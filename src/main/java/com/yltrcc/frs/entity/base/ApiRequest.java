package com.yltrcc.frs.entity.base;

/**
 * Package: com.yltrcc.blog.api
 * Date：2022-01-15
 * Time：16:18
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public class ApiRequest {

    /**
     * 请求面试题的数量
     */
    private Integer page_num;

    private Integer page_size;

    public Integer getPage_num() {
        return page_num;
    }

    public void setPage_num(Integer page_num) {
        this.page_num = page_num;
    }

    public Integer getPage_size() {
        return page_size;
    }

    public void setPage_size(Integer page_size) {
        this.page_size = page_size;
    }
}
