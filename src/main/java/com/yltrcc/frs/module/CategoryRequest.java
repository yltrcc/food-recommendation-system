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
public class CategoryRequest extends ApiRequest {



    private Long shopId;

    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }


}
