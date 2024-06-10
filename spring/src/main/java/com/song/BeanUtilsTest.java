package com.song;

import com.song.entity.Man;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

public class BeanUtilsTest {
    @Test
    public void test01() {
        Man man = new Man();
        man.setName("zhangsan");
        man.setAge(18);
        man.setManProp("manProp");
        Man man02 = new Man();
        BeanUtils.copyProperties(man, man02);
        System.out.println(man02);
        /*
        Person{name='zhangsan', age=18}Man{manProp='manProp'}
        */
    }
}
