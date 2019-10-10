package com.hl.controller;

/**
 * 通用响应模板对象
 * @param <T>
 */
public class ResultDto<T> {
    public static final int SUCCESS = 0;
    public static final int SERVICE_ERROR = 500;

    public static final int API_KEY_ERROR = 400;
    public static final int INVALID_LOGIN_TOKEN = 401;


    private int code;
    private String message;
    private T data;

    public ResultDto(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
