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
public class CommentRequest extends ApiRequest {



    private Long userId;

    private Long foodId;

    private String type;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
