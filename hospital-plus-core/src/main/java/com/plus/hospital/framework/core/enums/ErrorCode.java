package com.plus.hospital.framework.core.enums;

/**
 * feign调用接口错误码
 * @author huguangquan
 * 2023/6/5
 **/
public enum ErrorCode {
    system_error(500, "system_error"),
    forbidden(504, "无权限访问");
    private Integer code;
    private String message;

    ErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
