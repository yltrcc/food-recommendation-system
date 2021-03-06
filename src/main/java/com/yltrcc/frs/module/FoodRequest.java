package com.yltrcc.frs.module;

/**
 * Package: com.yltrcc.frs.entity
 * Date：2022-03-03
 * Time：19:55
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public class FoodRequest extends ApiRequest {

    /**
     * 餐厅
     */
    private String canteen;

    private Long shopId;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getCanteen() {
        return canteen;
    }

    public void setCanteen(String canteen) {
        this.canteen = canteen;
    }
}
