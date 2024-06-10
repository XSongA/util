package com.song.lang3;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.jupiter.api.Test;

public class ObjectUtilsTest {
    @Test
    public void test01() {
        String str1 = null;
        String str2 = null;
        String str3 = "abc";
        System.out.println(ObjectUtils.firstNonNull(str1, str2, str3));
        /*
        Output:
        abc
        */
    }

    @Test
    public void test02() {
        String str = "abc";
        /*
         * System.identityHashCode(object)
         */
        System.out.println(ObjectUtils.identityToString(str));
        /*
        Output:
        java.lang.String@4a87761d
        */
    }
}
