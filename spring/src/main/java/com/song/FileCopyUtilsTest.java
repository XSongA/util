package com.song;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileCopyUtilsTest {
    @Test
    public void test01() throws Exception {
        ClassPathResource resource = new ClassPathResource("files/1.txt");
        EncodedResource encodedResource = new EncodedResource(resource, StandardCharsets.UTF_8);
        String targetPath = "/Users/zss/Projects/util/spring/src/main/resources/files/2.txt";
        FileCopyUtils.copy(encodedResource.getInputStream(), new FileOutputStream(targetPath));
    }
}
