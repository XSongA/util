package com.song.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IoTest {
    @Test
    public void test01() throws IOException {
        String path = "/Users/zss/Projects/util/apache-commons/src/main/resources/1.txt";
        System.out.println(FileUtils.readFileToString(new File(path), StandardCharsets.UTF_8));
        /* Output:
        123
        abc
        hello
        666
        FileUtils测试
        */
    }

    @Test
    public void test02() throws IOException {
        String path = "/Users/zss/Projects/util/apache-commons/src/main/resources/1.txt";
        System.out.println(FileUtils.readLines(new File(path), StandardCharsets.UTF_8));
        /* Output:
        [123, abc, hello, 666, FileUtils测试]
        */
    }

    @Test
    public void test03() throws IOException {
        String path = "/Users/zss/Projects/util/apache-commons/src/main/resources/1.txt";
        System.out.println(FilenameUtils.getBaseName(path));
        System.out.println(FilenameUtils.getExtension(path));
        /* Output:
        1
        txt
        */
    }
}
