package com.hl.controller.exception;

/**
 * 包装业务处理异常
 */
public class BusinessRuntimeException extends RuntimeException{
    private int code;
    private String errorMsg;
    private Object errorData;

    public BusinessRuntimeException(int code, String errorMsg, Object errorData){
        super();
        this.code = code;
        this.errorMsg = errorMsg;
        this.errorData = errorData;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Object getErrorData() {
        return errorData;
    }

    public void setErrorData(Object errorData) {
        this.errorData = errorData;
    }
}
