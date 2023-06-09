package com.plus.hospital.framework.core.web.resolver;

import com.plus.hospital.framework.core.annotations.CurrentAccountId;
import com.plus.hospital.framework.core.constants.SystemConstants;
import com.plus.hospital.framework.core.enums.ErrorCode;
import com.plus.hospital.framework.core.exception.HospitalPlusException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.Objects;

/**
 * @CurrentAccountId注解的参数解析器
 * @author huguangquan
 * 2023/6/9
 **/
@Slf4j
public class CurrentAccountIdResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        CurrentAccountId parameterAnnotation = parameter.getParameterAnnotation(CurrentAccountId.class);
        return parameter.getParameterType().isAssignableFrom(Long.class) && !Objects.isNull(parameterAnnotation);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        String loginAccountId = webRequest.getHeader(SystemConstants.login_account_header_name);
        if (StringUtils.isEmpty(loginAccountId)) {
            log.error("{}.{} 方法未登录获取accountId错误", parameter.getDeclaringClass().getName(), parameter.getMethod().getName());
            throw new HospitalPlusException(ErrorCode.forbidden.getCode().toString(), "账号未登录，获取登录用户ID异常。");
        }
        return loginAccountId;
    }
}
