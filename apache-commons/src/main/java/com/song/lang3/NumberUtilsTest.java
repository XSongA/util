package com.song.lang3;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
    @Test
    public void test01() {
        String str = "12";
        System.out.println(Integer.valueOf(str));
        /* Output:
        12
        */
        str = "12.3";
        System.out.println(str + " isDigits " + NumberUtils.isDigits(str));
        System.out.println(str + " isParsable " + NumberUtils.isParsable(str));
        System.out.println(str + " isCreatable " + NumberUtils.isCreatable(str));
        /* Output:
        12.3 isDigits false
        12.3 isParsable true
        12.3 isCreatable true
        */
        str = "+12.3";
        System.out.println(str + " isDigits " + NumberUtils.isDigits(str));
        System.out.println(str + " isParsable " + NumberUtils.isParsable(str));
        System.out.println(str + " isCreatable " + NumberUtils.isCreatable(str));
        /* Output:
        +12.3 isDigits false
        +12.3 isParsable false
        +12.3 isCreatable true
        */
        str = "12";
        System.out.println(str + " isDigits " + NumberUtils.isDigits(str));
        System.out.println(str + " isParsable " + NumberUtils.isParsable(str));
        System.out.println(str + " isCreatable " + NumberUtils.isCreatable(str));
        /* Output:
        12 isDigits true
        12 isParsable true
        12 isCreatable true
        */
        str = "12.3aa";
        System.out.println(str + " isDigits " + NumberUtils.isDigits(str));
        System.out.println(str + " isParsable " + NumberUtils.isParsable(str));
        System.out.println(str + " isCreatable " + NumberUtils.isCreatable(str));
        /* Output:
        12.3aa isDigits false
        12.3aa isParsable false
        12.3aa isCreatable false
        */
        str = "09";
        // 十进制
        System.out.println(str + " isDigits " + NumberUtils.isDigits(str));
        // 十进制
        System.out.println(str + " isParsable " + NumberUtils.isParsable(str));
        // 以0开头任务是八进制
        System.out.println(str + " isCreatable " + NumberUtils.isCreatable(str));
        /* Output:
        09 isDigits true
        09 isParsable true
        09 isCreatable false
        */
    }
}
