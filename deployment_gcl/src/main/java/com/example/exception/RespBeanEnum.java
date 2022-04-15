package com.example.exception;


import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Getter;
/**
 * @author: gcl
 * @date: 2022/4/15 10:40
 * @param:
 * @return:
 * @description:返回状态枚举
 */

@ToString
@Getter
@AllArgsConstructor /** 通过构造器注入的方式注入（Spring4以后推荐的做法 */
public enum RespBeanEnum {
    //通用状态码
    SUCCESS(200,"success"),
    ERROR(500,"服务端异常"),
    //登录模块5002xx
    SESSION_ERROR(500210,"session不存在或者已经失效"),
    LOGINVO_ERROR(500211,"用户名或者密码错误"),
    MOBILE_ERROR(500212,"手机号码格式错误");


    private final Integer code;
    private final String message;
}
