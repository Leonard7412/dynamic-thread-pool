package com.harper.thread.pool.sdk.config;

import com.alibaba.fastjson.JSON;
import com.harper.thread.pool.sdk.domain.impl.DynamicThreadPoolService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * @Title: 动态配置入口
 * @Author: leo.harper
 * @Date: 2024-09-03 23:07:46
 * @Params:
 * @Return: null
 * @Description: 动态配置入口
 */
@Configuration
public class DynamicThreadPoolAutoConfig {
    private final Logger logger = LoggerFactory.getLogger(DynamicThreadPoolAutoConfig.class);

    private String applicationName;

    @Bean("dynamicThreadPollService")
    public DynamicThreadPoolService dynamicThreadPollService(ApplicationContext applicationContext, Map<String, ThreadPoolExecutor> threadPoolExecutorMap) {
        String applicationName = applicationContext.getEnvironment().getProperty("spring.application.name");
        if (StringUtils.isBlank(applicationName)) {
            applicationName = "缺省的";
            logger.warn("动态线程池，启动提示。SpringBoot 应用未配置 spring.application.name 无法获取到应用名称！");
        }
        logger.warn("线程池message:{}", JSON.toJSONString(threadPoolExecutorMap.keySet()));
        // 获取缓存数据，设置本地线程池配置
        return new DynamicThreadPoolService(applicationName, threadPoolExecutorMap);
    }
}
