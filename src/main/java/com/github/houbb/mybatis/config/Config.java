package com.github.houbb.mybatis.config;

import com.github.houbb.mybatis.handler.type.handler.TypeHandler;
import com.github.houbb.mybatis.mapper.MapperMethod;
import com.github.houbb.mybatis.plugin.Interceptor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * 配置信息
 * @author binbin.hou
 * @since 0.0.1
 */
public interface Config {

    /**
     * 获取映射类信息
     * @param clazz 类信息
     * @param methodName 方法名称
     * @return 结果
     * @since 0.0.1
     */
    MapperMethod getMapperMethod(final Class clazz,
                                 final String methodName);

    /**
     * 获取数据库连接信息
     * @return 连接信息
     * @since 0.0.18
     */
    Connection getConnection();

    /**
     * 获取拦截器列表
     * @return 拦截器实现
     * @since 0.0.2
     */
    List<Interceptor> getInterceptorList();

    /**
     * 获取类型处理类
     * @param javaType Java 类
     * @param <T> 泛型
     * @return 处理类
     * @since 0.0.4
     */
    <T> TypeHandler<T> getTypeHandler(final Class<T> javaType);

    /**
     * 获取类型的别称
     * @param alias 别称
     * @return 结果
     * @since 0.0.5
     */
    String getTypeAlias(final String alias);

    /**
     * 新建对象
     * @param tClass 类型
     * @param <T> 泛型
     * @return 结果
     * @since 0.0.6
     */
    <T> T newInstance(final Class<T> tClass);

}
