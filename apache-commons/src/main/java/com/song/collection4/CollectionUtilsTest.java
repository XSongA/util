package com.song.collection4;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtilsTest {
    @Test
    public void test01() {
        List<String> strList = new ArrayList<>();
        System.out.println(CollectionUtils.isEmpty(strList));
        strList.add("abc");
        System.out.println(CollectionUtils.isEmpty(strList));
        /*
        true
        false
        */
    }

    @Test
    public void test02() {
        List<String> strList1 = new ArrayList<>();
        strList1.add("cat");
        strList1.add("dog");
        strList1.add("bird");
        List<String> strList2 = new ArrayList<>();
        strList2.add("aircraft");
        strList2.add("bird");
        // 交集
        System.out.println(CollectionUtils.intersection(strList1, strList2));
        // 并集
        System.out.println(CollectionUtils.union(strList1, strList2));
        // 差集
        System.out.println(CollectionUtils.subtract(strList1, strList2));
        System.out.println(CollectionUtils.subtract(strList2, strList1));
        /*
        [bird]
        [cat, bird, aircraft, dog]
        [cat, dog]
        [aircraft]
        */
    }
}
