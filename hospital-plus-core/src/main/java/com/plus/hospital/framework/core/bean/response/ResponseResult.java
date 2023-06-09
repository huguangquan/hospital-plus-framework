package com.plus.hospital.framework.core.bean.response;

import com.plus.hospital.framework.core.enums.ErrorCode;

import java.io.Serializable;

/**
 * feign调用返回结果响应类
 *
 * @author huguangquan
 * 2023/6/5
 **/
public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = 8905157821290738304L;

    private static final Integer success_code = 200;
    private static final String success_message = "success";
    private static final Integer failure_code = 500;
    private static final String failure_message = "failure";

    private Integer code;

    private String message;

    private String exceptionMsg;

    private T data;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public T getData() {
        return data;
    }

    public void success(T data) {
        this.code = success_code;
        this.message = success_message;
        this.data = data;
    }

    public void failure(String message) {
        this.code = failure_code;
        this.message = message;
    }

    public void failure(Exception exception) {
        this.code = failure_code;
        this.message = failure_message;
        this.exceptionMsg = exception.getMessage();
    }

    public void failure(String message, String exceptionMsg) {
        this.message = message;
        this.exceptionMsg = exceptionMsg;
    }

    public void failure(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public void failure(ErrorCode errorCode, Exception exception) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
        this.exceptionMsg = exception.getMessage();
    }

    public void failure(ErrorCode errorCode, String exceptionMsg) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
        this.exceptionMsg = exceptionMsg;
    }

    @Override
    public String toString() {
        return "FeignResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", exceptionMsg='" + exceptionMsg + '\'' +
                ", data=" + data +
                '}';
    }

}
