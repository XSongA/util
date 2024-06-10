package com.song;

import com.song.entity.BaseDao;
import com.song.entity.Person;
import com.song.entity.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.core.GenericTypeResolver;

public class GenericTypeResolverTest {
    @Test
    public void test01() {
        new UserDao().insert(new Person());
        // 解析泛型类型的参数
        Class<?> aClass = GenericTypeResolver.resolveTypeArgument(UserDao.class, BaseDao.class);
        System.out.println(aClass.getName());
    }
    /*
    com.song.entity.Person
    com.song.entity.Person
    */
}
