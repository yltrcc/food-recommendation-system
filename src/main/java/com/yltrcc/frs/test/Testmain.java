package com.yltrcc.frs.test;

import java.awt.print.Printable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

/**
 * Package: com.yltrcc.frs.test
 * Date：2022-03-25
 * Time：17:40
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public class Testmain {

    public  static String[]  nameArr = {
            "老地方土菜馆", "优米郎", "炊烟小镇", "e秒食速", "怡家私厨", "六膳盟", "味乐福", "漫客Makia", "美味盒子",
            "饭飞凡", "每日鲜", "麦可斯","火山麻辣烫"
    };

    public  static String[]  descArr = {
            "好吃，真不错",
            "分量足，味道好",
            "好吃豆腐，石锅千夜豆腐",
            "香辣超值，熟悉的味道",
            "特别好吃，都开来啊"

    };
    //sales 销量随便编

    public static String[] urlArr = {
      "http://n.sinaimg.cn/fashion/crawl/116/w550h366/20200109/dd7b-imvsvza2134196.jpg",
            "https://www.hanchao.com/varimg/photogallery/Now_Seoul/6252/big_126925.jpg",
            "https://pic3.zhimg.com/v2-716e0bd12d7d8b7a4d342acfd636a7b1_1440w.jpg?source=172ae18b",
            "https://photo.16pic.com/00/60/72/16pic_6072305_b.jpg",
            "https://media-cdn.tripadvisor.com/media/daodao/photo-s/0d/46/78/a0/nice.jpg",
            "https://media-cdn.tripadvisor.com/media/daodao/photo-s/16/74/5d/39/caption.jpg",
            "http://image.uc.cn/s/wemedia/s/upload/2020/e85c31197c944a658572d4082fffaf6c.jpg",
            "http://i3.sinaimg.cn/travel/2016/0426/U11604P704DT20160426132323.jpg",
            "https://img.cnpp100.com/uploads/allimg/180826/1-1PR61041560-L.jpg",
            "http://image.bao315.com/upload/image/202003/18/f1c10ded-b15c-4d64-9f3c-a04d997f51b3.jpeg",
            "https://p5.itc.cn/images01/20220120/1c59c1194e244c459b4fac143a85b8f3.jpeg",
            "https://www.jrtm.net/wp-content/uploads/2022/02/e6b9aa8d53c52e03d253003c7b6951e6493976-2.jpg",
            "http://image.uc.cn/s/wemedia/s/upload/2022/550cd01165d252e08a24bdcb7d32c882.jpg",
            "https://www.jiamengfei.com/uploads/images/2021/07-29/fe7d2e0c214f.jpg",
            "https://taojin-pic-gz.cdn.bcebos.com/bos_gz_079a9286b340db5cfd673d1bfb16104f.jpg",
            "https://youimg1.tripcdn.com/target/100j0k000000chmrqC251_C_750_350.jpg",
            "https://www.xm171.com/uploads/allimg/160810/4-160Q0142AEa.jpg",
            "https://p5.itc.cn/q_70/images01/20220216/386774f2a24f45598acc42112f3850e7.jpeg",
        "https://img1.qunarzz.com/travel/poi/1807/25/a16499a559d5d437.jpg_480x360x95_c3f3b6c5.jpg",
            "https://taojin-pic-gz.cdn.bcebos.com/bos_gz_54f7c9400e8fdd599b6a58a6ff0985c7.jpg"
    };

    //location 位置
    public static String[] locationArr = {
            "一楼102", "一楼103", "一楼104", "一楼105", "一楼106", "一楼107",
            "一楼108", "一楼109", "一楼110",
            "二楼102", "二楼103", "二楼104", "二楼105", "二楼106", "二楼107",
            "二楼108", "二楼109", "二楼110",
            "三楼102", "三楼103", "三楼104", "三楼105", "三楼106", "三楼107",
            "三楼108", "三楼109", "三楼110"
    };
    //canteen 餐厅
    public static String[] canteenArr = {
            "仙炙轩餐厅", "上雅餐厅", "食悦阁"
    };
    //notice 公告
    public static String[] noticeArr = {
            "人间最美味，尽在老地方土菜馆。快来尽情双拥吧",
            "好吃，真不错", "好吃豆腐，石锅千夜豆腐",
            "香辣超值，熟悉的味道",
            "特别好吃，都开来啊"
    };

    public static void main(String[] args) {

        File file = new File("word.txt");
        try {
            //创建 FileOutputStream 对象
            FileOutputStream out = new FileOutputStream(file);
            //创建 byte 型数组byte buy[] = "我有一只小毛驴，我从来也不骑。".getBytes();
            for (int i=0; i<4000; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("INSERT INTO `tb_shop` (`shop_name`, `shop_desc`, `shop_sales`, `shop_url`, `location`, `like_count`, `collect_count`, `comment_count`, `canteen`, `notice` ) VALUES");
                sb.append("\t('");
                Random r = new Random();
                sb.append(nameArr[r.nextInt(nameArr.length)]);
                sb.append("', '");
                sb.append(descArr[r.nextInt(descArr.length)]);
                sb.append("', ");
                sb.append(r.nextInt(10000));
                sb.append(", '");
                sb.append(urlArr[r.nextInt(urlArr.length)]);
                sb.append("', '");
                sb.append(locationArr[r.nextInt(locationArr.length)]);
                sb.append("', ");
                sb.append("0");
                sb.append(", ");
                sb.append("0");
                sb.append(", ");
                sb.append("0");
                sb.append(", '");
                sb.append(canteenArr[r.nextInt(canteenArr.length)]);
                sb.append("', '");
                sb.append(noticeArr[r.nextInt(noticeArr.length)]);
                sb.append("');\n");
                //System.out.println(sb.toString());

                out.write(sb.toString().getBytes());
            }

            out.close();
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}
