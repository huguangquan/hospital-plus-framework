package com.plus.hospital.framework.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 获取当前登录账号的AccountId注解，如果未登录使用此注解，接口会返回无权限
 * @author huguangquan
 * 2023/6/9
 **/
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface CurrentAccountId {
}
