package com.plus.hospital.framework.core.web.config;

import com.plus.hospital.framework.core.web.resolver.CurrentAccountIdResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * web mvc配置
 * @author huguangquan
 * 2023/6/9
 **/
@Configuration
public class CustomerWebConfig implements WebMvcConfigurer {
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new CurrentAccountIdResolver());
    }
}
