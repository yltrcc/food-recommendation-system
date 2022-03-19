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
public class ShopRequest extends ApiRequest {

    /**
     * 餐厅
     */
    private String canteen;

    private Long shopId;

    private String notice;

    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getCanteen() {
        return canteen;
    }

    public void setCanteen(String canteen) {
        this.canteen = canteen;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}
