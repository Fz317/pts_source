package com.briup.briuppts.exception;


import com.briup.briuppts.result.ResultCode;

/**
 * 自定义service层异常类
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private ResultCode resultCode;

    public ServiceException(ResultCode resultCode) {
        this(resultCode.getMsg());
        this.resultCode = resultCode;
    }

    private ServiceException(String message) {
        super(message);
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
