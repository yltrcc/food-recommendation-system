package com.yltrcc.frs.test;

import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.jdbc.ReloadFromJDBCDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.*;
import org.apache.mahout.cf.taste.impl.recommender.*;
import org.apache.mahout.cf.taste.impl.similarity.*;
import org.apache.mahout.cf.taste.model.*;
import org.apache.mahout.cf.taste.neighborhood.*;
import org.apache.mahout.cf.taste.recommender.*;
import org.apache.mahout.cf.taste.similarity.*;

import java.util.*;

public class MyUserBasedRecommender {


	public static void main(String args[]) throws Exception {
		// step:1 构建模型 2 计算相似度 3 查找k紧邻 4 构造推荐引擎
		List<RecommendedItem> recommendations = null;
		try {
			ReloadFromJDBCDataModel model = new ReloadFromJDBCDataModel(
					MyDataModel.myDataModel());
			UserSimilarity similarity = new PearsonCorrelationSimilarity(model);//用PearsonCorrelation 算法计算用户相似度
			UserNeighborhood neighborhood = new NearestNUserNeighborhood(3, similarity, model);//计算用户的“邻居”，这里将与该用户最近距离为 3 的用户设置为该用户的“邻居”。
			Recommender recommender = new CachingRecommender(new GenericUserBasedRecommender(model, neighborhood, similarity));//采用 CachingRecommender 为 RecommendationItem 进行缓存
			//recommendations = recommender.recommend(userID, size);//得到推荐的结果，size是推荐结果的数目
			List<RecommendedItem> list = recommender.recommend(1, 100);

			System.out.println("-------------------------------------");
			System.out.printf("uid:%s", 1);
			for (RecommendedItem ritem : list) {
				System.out.printf("(%s,%f)", ritem.getItemID(), ritem.getValue());
			}

			/*LongPrimitiveIterator iter = model.getUserIDs();

			while (iter.hasNext()) {
				long uid = iter.nextLong();
				List<RecommendedItem> list = recommender.recommend(uid, 20);
				System.out.printf("uid:%s", uid);
				for (RecommendedItem ritem : list) {
					System.out.printf("(%s,%f)", ritem.getItemID(), ritem.getValue());
				}
				System.out.println();
			}*/
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}