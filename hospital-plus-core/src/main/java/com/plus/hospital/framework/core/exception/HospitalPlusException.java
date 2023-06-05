package com.plus.hospital.framework.core.exception;

import com.feiniaojin.gracefulresponse.GracefulResponseException;

/**
 * HospitalPlus业务异常基类
 * @author huguangquan
 * 2023/6/5
 **/
public class HospitalPlusException extends GracefulResponseException {

    public HospitalPlusException() {
        super();
    }

    public HospitalPlusException(String code, String message) {
        super(code, message);
    }

    public HospitalPlusException(String code, String msg, Throwable cause) {
        super(code, msg, cause);
    }
}
