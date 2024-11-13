package com.briup.briuppts.result;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Result<D> {
    private Integer code;
    private String msg;
    private D data;
    private final Long timestamp;
    // 做时间的初始化
    {
        timestamp = System.currentTimeMillis();
    }

    // 构造器私有化，外界不允许创建这个类的对象
    private Result(){}
    private Result(ResultCode resultCode){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    // 1、成功、不带数据 增删改
    public static Result success(){
        return success(null);
    }
    // 2、成功、带数据的 查询
    public static <D> Result<D> success(D data){
        Result<D> result = new Result<>(ResultCode.SUCCESS);
        result.data = data;
        return result;
    }
    // 3、失败，不带数据
    public static Result failure(ResultCode resultCode){
        return new Result<>(resultCode);
    }

    // 补充自定义的错误状态
    public static Result failure(Integer code ,String msg){
        return new Result(code,msg);
    }
}
