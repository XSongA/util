package com.song.lang3;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    @Test
    public void test01() {
        String str = "   ";
        System.out.println(StringUtils.isBlank(str));
        System.out.println(StringUtils.isNoneBlank(str));
        /* Output:
        true
        false
        */
        str = "";
        System.out.println(StringUtils.isEmpty(str));
        System.out.println(StringUtils.isNotEmpty(str));
        /* Output:
        true
        false
        */
        str = "12345678901";
        String left = StringUtils.left(str, 3);
        String right = StringUtils.right(str, 4);
        System.out.println(left + "****" + right);
        String leftPad = StringUtils.rightPad(left, 7, '*');
        System.out.println((leftPad + right));
        /* Output:
        123****8901
        123****8901
        */
    }
}
