package com.song;

import org.junit.jupiter.api.Test;
import org.springframework.util.ClassUtils;

public class ClassUtilsTest {
    @Test
    public void test01() {
        // 判断当前应用是否加载了某个类
        String className = "com.song.Zhang";
//        try {
////            Class.forName(className);
//            ClassUtilsTest.class.getClassLoader().loadClass(className);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        className = "com.song.entity.MyTest";
        boolean present = ClassUtils.isPresent(className, null);
        System.out.println(present);
        /*
        true
        */
    }
}
