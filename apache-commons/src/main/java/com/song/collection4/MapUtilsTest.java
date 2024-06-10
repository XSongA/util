package com.song.collection4;

import org.apache.commons.collections4.MapUtils;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapUtilsTest {
    @Test
    public void test01() {
        Map<String, String> map = new HashMap<>();
        System.out.println(MapUtils.isEmpty(map));
        map.put("a", "1");
        System.out.println(MapUtils.isEmpty(map));
        System.out.println(MapUtils.getInteger(map, "a"));
        System.out.println(MapUtils.getInteger(map, "b"));
        map.put("c", "cat");
        System.out.println(MapUtils.getInteger(map, "c"));
        /*
        true
        false
        1
        null
        null
        */
    }
}
