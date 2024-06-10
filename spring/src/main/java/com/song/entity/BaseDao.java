package com.song.entity;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseDao<T> {
    private Class<T> clazz;

    public BaseDao() {
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        Type actualTypeArgument = parameterizedType.getActualTypeArguments()[0];
        clazz = (Class<T>) actualTypeArgument;
    }

    public void insert(T t) {
        System.out.println(clazz.getName());
    }
}
