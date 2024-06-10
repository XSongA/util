package com.song;

import com.song.entity.Man;
import org.junit.jupiter.api.Test;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtilsTest {
    @Test
    public void test01() {
        ReflectionUtils.doWithFields(Man.class, new ReflectionUtils.FieldCallback() {
            @Override
            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                System.out.println(field.getName());
            }
        });

        ReflectionUtils.doWithMethods(Man.class, new ReflectionUtils.MethodCallback() {
            @Override
            public void doWith(Method method) throws IllegalArgumentException, IllegalAccessException {
                System.out.println(method.getDeclaringClass() + "的" + method.getName());
            }
        });

        Method[] allDeclaredMethods = ReflectionUtils.getAllDeclaredMethods(Man.class);
        Man man = new Man();
        man.setName("zhangsan");
        ReflectionUtils.doWithFields(Man.class, new ReflectionUtils.FieldCallback() {
            @Override
            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                field.setAccessible(true);
                Object fieldName = ReflectionUtils.getField(field, man);
                System.out.println(fieldName);
            }
        });
        /*
        manProp
        name
        age
        class com.song.Man的getManProp
        class com.song.Man的setManProp
        class com.song.Person的getName
        class com.song.Person的setName
        class com.song.Person的say
        class com.song.Person的getAge
        class com.song.Person的setAge
        class java.lang.Object的finalize
        class java.lang.Object的wait
        class java.lang.Object的wait
        class java.lang.Object的wait
        class java.lang.Object的equals
        class java.lang.Object的toString
        class java.lang.Object的hashCode
        class java.lang.Object的getClass
        class java.lang.Object的clone
        class java.lang.Object的notify
        class java.lang.Object的notifyAll
        null
        zhangsan
        null
        */
    }
}
