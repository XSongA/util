package com.song.lang3;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {
    @Test
    public void test01() {
        int[] intArr = new int[1];
        System.out.println(ArrayUtils.isEmpty(intArr));
        System.out.println(ArrayUtils.toString(intArr));
        int[] newIntArr = ArrayUtils.add(intArr, 1);
        System.out.println(ArrayUtils.toString(intArr));
        System.out.println(ArrayUtils.toString(newIntArr));
        /*
        false
        {0}
        {0}
        {0,1}
        */
    }
}
