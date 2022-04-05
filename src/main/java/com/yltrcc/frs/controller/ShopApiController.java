package com.yltrcc.frs.controller;

import com.yltrcc.frs.module.ApiResponse;
import com.yltrcc.frs.module.CategoryRequest;
import com.yltrcc.frs.module.ShopRequest;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.entity.*;
import com.yltrcc.frs.service.ITbCategoryService;
import com.yltrcc.frs.service.ITbFoodService;
import com.yltrcc.frs.service.ITbShopService;
import com.yltrcc.frs.service.ITbUserService;
import com.yltrcc.frs.test.MyDataModel;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.jdbc.ReloadFromJDBCDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.CachingRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Package: com.yltrcc.frs.controller
 * Date：2022-03-03
 * Time：19:18
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@RestController
@RequestMapping("/api/shop")
public class ShopApiController {

    @Autowired
    private ITbShopService tbShopService;

    @Autowired
    private ITbCategoryService categoryService;

    @Autowired
    private ITbFoodService tbFoodService;

    @RequestMapping("/getShop")
    public ApiResponse<TbShop> getShop(ShopRequest shopRequest) {

        int page_size = shopRequest.getPage_size();
        int page_num = shopRequest.getPage_num();

        List<TbShop> list = tbShopService.query(shopRequest);

        //查询总记录数
        int total_count = tbShopService.queryCount(shopRequest);
        int total_page = total_count / page_size;
        total_page = (int) Math.floor(total_page);
        if (total_count % page_size != 0) {
            total_page += 1;
            total_page = (int) Math.ceil(total_page);
        }
        content<TbShop> content = new content<>(list);
        content.setCurrent_page(page_num);
        content.setPage_size(page_size);
        content.setTotal_count(total_count);
        content.setTotal_page(total_page);
        ApiResponse<TbShop> response = new ApiResponse<TbShop>(content);
        response.setSuccess(true);

        return response;
    }

    @RequestMapping("/getShopById")
    public ApiResponse<TbShop> getShopById(ShopRequest shopRequest) {


        TbShop tbShop = tbShopService.getShopById(shopRequest);


        ArrayList<TbShop> list = new ArrayList<TbShop>();
        list.add(tbShop);
        content<TbShop> content = new content<>(list);
        ApiResponse<TbShop> response = new ApiResponse<TbShop>(content);
        response.setSuccess(true);

        return response;
    }

    @RequestMapping("/updateShopById")
    public ApiResponse<TbShop> updateShopById(ShopRequest shopRequest) {


        tbShopService.updateShopById(shopRequest);


        ArrayList<TbShop> list = new ArrayList<TbShop>();
        content<TbShop> content = new content<>(list);
        ApiResponse<TbShop> response = new ApiResponse<TbShop>(content);
        response.setSuccess(true);

        return response;
    }

    @RequestMapping("/getShopByUserId")
    public ApiResponse<TbShop> getShopByUserId(ShopRequest shopRequest) {

        int page_size = shopRequest.getPage_size();
        int page_num = shopRequest.getPage_num();

        List<TbShop> list = tbShopService.getShopByUserId(shopRequest);
        List<TbShop> list1 = new ArrayList<>();
        if (!CollectionUtils.isEmpty(list)) {
            for (TbShop shop: list) {
                shop.setPrice("金额：" + shop.getTotalPrice() + "元");
                list1.add(shop);
            }
        }

        //查询总记录数
        int total_count = tbShopService.queryShopCountByUserId(shopRequest);
        int total_page = total_count / page_size;
        total_page = (int) Math.floor(total_page);
        if (total_count % page_size != 0) {
            total_page += 1;
            total_page = (int) Math.ceil(total_page);
        }
        content<TbShop> content = new content<>(list1);
        content.setCurrent_page(page_num);
        content.setPage_size(page_size);
        content.setTotal_count(total_count);
        content.setTotal_page(total_page);
        ApiResponse<TbShop> response = new ApiResponse<TbShop>(content);
        response.setSuccess(true);

        return response;
    }

    @RequestMapping("/getShopListById")
    public JsonRootBean getShopListById(ShopRequest shopRequest) {

        JsonRootBean result = new JsonRootBean();

        //获取商铺
        TbShop tbShop = tbShopService.getShopById(shopRequest);
        //获取商铺分类
        CategoryRequest categoryRequest = new CategoryRequest();
        categoryRequest.setShopId(shopRequest.getShopId());
        List<TbCategory> list = categoryService.getCategoryByShopId(categoryRequest);
        if (!CollectionUtils.isEmpty(list)) {
            result.setCode(0);

            Data1 data1 = new Data1();
            data1.setCode(0);
            List<Data> data = new ArrayList<>();
            //根据分类ID 获取商品
            for (TbCategory tbCategory : list) {
                Data tmp = new Data();
                List<Menu> tbFoodList = tbFoodService.queryByCategoryId(tbCategory);
                List<Menu> menus = new ArrayList<>();
                for (Menu menu : tbFoodList) {
                    menu.setTotal(0);
                    menu.setNum(0);
                    menu.setSpec("");
                    menus.add(menu);
                }
                tmp.setId("C" + Integer.toString((int) tbCategory.getCategoryId()));
                tmp.setName(tbCategory.getCategoryName());
                tmp.setMenu(menus);
                data.add(tmp);
            }
            data1.setData(data);
            result.setData(data1);
        } else {
            result.setCode(1);
            result.setMessage("数据库暂无数据");
        }

        return result;
    }

    @RequestMapping("/getShopListByComment")
    public ApiResponse<TbShop> getShopListByComment(ShopRequest shopRequest) throws TasteException {


        ReloadFromJDBCDataModel model = new ReloadFromJDBCDataModel(
                MyDataModel.myDataModel());
        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);//用PearsonCorrelation 算法计算用户相似度
        UserNeighborhood neighborhood = new NearestNUserNeighborhood(3, similarity, model);//计算用户的“邻居”，这里将与该用户最近距离为 3 的用户设置为该用户的“邻居”。
        Recommender recommender = new CachingRecommender(new GenericUserBasedRecommender(model, neighborhood, similarity));//采用 CachingRecommender 为 RecommendationItem 进行缓存
        //recommendations = recommender.recommend(userID, size);//得到推荐的结果，size是推荐结果的数目
        List<RecommendedItem> list = recommender.recommend(shopRequest.getUserId(), 15);

        System.out.println("-------------------------------------");
        System.out.printf("uid:%s", shopRequest.getUserId());
        ArrayList<TbShop> list1 = new ArrayList<TbShop>();

        for (RecommendedItem ritem : list) {
            System.out.printf("(%s,%f)", ritem.getItemID(), ritem.getValue());
            //通过商家ID获取信息
            shopRequest.setShopId(ritem.getItemID());
            TbShop tbShop = tbShopService.getShopById(shopRequest);
            list1.add(tbShop);
        }

        content<TbShop> content = new content<>(list1);
        ApiResponse<TbShop> response = new ApiResponse<TbShop>(content);
        response.setSuccess(true);

        return response;
    }


}
