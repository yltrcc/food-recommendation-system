package com.yltrcc.frs.module.entity;

import java.util.List;

/**
 * Package: com.yltrcc.frs.entity.base
 * Date：2022-03-03
 * Time：20:21
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public class content<T> {

    /**
     * 请求结果数据
     */
    private List<T> content;

    private Integer current_page;

    private Integer page_size;

    private Integer total_count;

    private Integer total_page;

    public content(List<T> content) {
        this.content = content;
    }


    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public Integer getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(Integer current_page) {
        this.current_page = current_page;
    }

    public Integer getPage_size() {
        return page_size;
    }

    public void setPage_size(Integer page_size) {
        this.page_size = page_size;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Integer getTotal_page() {
        return total_page;
    }

    public void setTotal_page(Integer total_page) {
        this.total_page = total_page;
    }
}
