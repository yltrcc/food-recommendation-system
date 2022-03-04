package com.yltrcc.frs.entity.base;

import java.util.List;

/**
 * Package: com.yltrcc.blog.api
 * Date：2022-01-15
 * Time：16:18
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public class ApiResponse<T> {

    public ApiResponse(content<T> data) {
        this.data = data;
    }

    /**
     * 请求结果HTTP状态码 200 表示成功
     */
    private int status;

    /**
     * 请求结果自定义状态码 表示具体的自定义错误码
     * 错误码是40483，其中404代表了请求的资源不存在，而83则制定了这次出错，具体是哪一种资源不存在。
     */
    private int code;

    private Boolean success;

    /**
     * 用户可理解的信息
     */
    private String message;

    /**
     * 该出错的详细技术信息，提供给客户端的开发者阅读
     */
    private String developerMessage;

    /**
     * 请求结果数据
     */
    private content<T> data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }

    public content<T> getData() {
        return data;
    }

    public void setData(content<T> data) {
        this.data = data;
    }
}
