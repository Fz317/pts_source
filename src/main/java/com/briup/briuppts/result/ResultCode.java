package com.briup.briuppts.result;

import lombok.Getter;

/**
 * 定义出项目中所有的异常情况
 */
@Getter
public enum ResultCode {
    /* 成功的返回 */
    SUCCESS(200,"请求成功"),
    /* 失败状态码 */
    FAIL(0, "操作失败，请重试"),

    /* 程序内部错误 */
    PROGRAM_INTERNAL_ERROR(500, "程序内部错误"),

    /* 全局异常 10001 - 19999 */
    USER_IS_NOT_EXIST(1001, "用户不存在"),
    PWD_IS_WRONG(1002, "密码错误"),
    USER_NOT_LOGIN(1003, "用户未登录，请登录后访问"),
    TOKEN_TIMEOUT(1004, "登录超过五天，请重新登录"),
    TOKEN_VALIDATE_ERROR(1005, "token验证未通过"),
    PARAM_IS_EMPTY(1006, "参数为空"),
    DATA_IS_EMPTY(1007, "数据不存在或者已经删除"),
    DATA_CAN_NOT_DELETE(1008, "数据关联其他数据，无法删除"),

    /* 栏舍管理模块错误 2001 - 2999 */
    FENCE_HOUSE_IS_EXIST(2001, "栏舍名称已经存在"),
    /* 栏圈管理模块错误 3001 - 3999 */

    /* 动物管理模块错误 4001 - 4999 */
    ANIMAL_IS_NOT_IN_BREEDING(4001, "动物不在养殖中，无法添加病症记录")

    /* 指标记录模块错误 5001 - 5999 */

    /* 病症记录模块错误 6001 - 6999 */
    ;


    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
