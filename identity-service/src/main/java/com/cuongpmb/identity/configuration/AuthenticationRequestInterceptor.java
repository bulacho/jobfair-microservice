package com.cuongpmb.identity.configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Slf4j
public class AuthenticationRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String authHeader = null;
        if (servletRequestAttributes != null) {
            authHeader = servletRequestAttributes.getRequest().getHeader("Authorization");
            log.info("Header: {}",authHeader);
            requestTemplate.header("Authorization", authHeader);
        }

    }
}
