package com.briup.briuppts.exception;


import com.briup.briuppts.result.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理
 */
//@ControllerAdvice + @ResponseBody
// @RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        Result result = null;
        if (e instanceof ServiceException) {
            result = Result.failure(((ServiceException) e).getResultCode());
        } else {
            result = Result.failure(500, "服务器意外错误：" + e.getMessage());
        }
        return result;
    }
}
