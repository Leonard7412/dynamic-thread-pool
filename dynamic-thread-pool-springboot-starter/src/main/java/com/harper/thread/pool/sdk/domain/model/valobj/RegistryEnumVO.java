package com.harper.thread.pool.sdk.domain.model.valobj;

/**
 * @Title: 枚举值对象
 * @Author: leo.harper
 * @Date: 2024-09-03 23:45:06
 * @Params:
 * @Description: 枚举值对象
 */
public enum RegistryEnumVO {
    THREAD_POOL_CONFIG_LIST_KEY("THREAD_POOL_CONFIG_LIST_KEY", "池化配置列表"),
    THREAD_POOL_CONFIG_PARAMETER_LIST_KEY("THREAD_POOL_CONFIG_PARAMETER_LIST_KEY", "池化配置参数"),
    DYNAMIC_THREAD_POOL_REDIS_TOPIC("DYNAMIC_THREAD_POOL_REDIS_TOPIC", "动态线程池监听主题配置");

    private final String key;
    private final String desc;

    RegistryEnumVO(String key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public String getDesc() {
        return desc;
    }


}
