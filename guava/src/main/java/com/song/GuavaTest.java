package com.song;

import com.google.common.base.CaseFormat;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.*;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class GuavaTest {
    @Test
    public void test01() {
        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add(null);
        Joiner joiner = Joiner.on(",")
                // 忽略null
//                .skipNulls()
                .useForNull("替代null的字符串");
        System.out.println(joiner.join(strList));
        // stream
        System.out.println(strList.stream().filter(Objects::nonNull).collect(Collectors.joining(",")));
        /*
        a,b,c,替代null的字符串
        a,b,c
        */
    }

    @Test
    public void test02() {
        String str = " a , b,c,,\"\"";
        Splitter splitter = Splitter.on(",")
                // 过滤空白的字符串（不包括""）
                .omitEmptyStrings()
                // 去除每个元素的前后空格
                .trimResults();
        Iterable<String> split = splitter.split(str);
        System.out.println(split);
        List<String> splitToList = splitter.splitToList(str);
        System.out.println(splitToList);
        /*
        [a, b, c, ""]
        [a, b, c, ""]
        */
    }

    @Test
    public void test03() {
        /*
         * 下划线和驼峰互转
         * user_id
         * userId
         */
        String str = "user_id";
        // 下划线转驼峰
        // 小驼峰
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str));
        // 大驼峰
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, str));
        str = "userId";
        // 驼峰转下划线
        System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, str));
        /*
        userId
        UserId
        user_id
        */
    }

    @Test
    public void test04() {
        // 集合的快速创建方式
        ArrayList<String> strList = Lists.newArrayList("a", "b", "c");
        // 将List分为小的集合，小的集合大小是size
        List<List<String>> partition = Lists.partition(strList, 2);
        System.out.println(partition);
        /*
        [[a, b], [c]]
        */
    }

    @Test
    public void test05() {
        List<Integer> integers = Ints.asList(1, 2, 3);
        System.out.println(integers);
        List<Long> longs = Longs.asList(1, 2, 3);
        System.out.println(longs);
        /*
        [1, 2, 3]
        [1, 2, 3]
        */
    }

    @Test
    public void test06() {
        // 无序可重复的
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("a");
        multiset.add("b");
        multiset.add("c");
        multiset.add("a");
        System.out.println(multiset);
        Set<Multiset.Entry<String>> entrySet = multiset.entrySet();
        System.out.println(entrySet);
        for (Multiset.Entry<String> entry : entrySet) {
            System.out.println("元素:" + entry.getElement() + "个数:" + entry.getCount());
        }
        Set<String> elementSet = multiset.elementSet();
        System.out.println(elementSet);
        for (String element : elementSet) {
            System.out.println("集合中的元素:" + element);
        }
        /*
        [a x 2, b, c]
        [a x 2, b, c]
        元素:a个数:2
        元素:b个数:1
        元素:c个数:1
        [a, b, c]
        集合中的元素:a
        集合中的元素:b
        集合中的元素:c
        */
    }

    @Test
    public void test07() {
        /*
         * HashMultimap 用来替代jdk原生的Mpa<String, Collection<String>> map;
         */
        Multimap<String, String> multimap = HashMultimap.create();
        multimap.put("a", "1");
        multimap.put("a", "2");
        multimap.put("a", "3");
        multimap.put("b", "4");
        Collection<String> aValues = multimap.get("a");
        System.out.println(aValues);
        // 是否包含entry
        System.out.println(multimap.containsEntry("a", "1"));
        // 转为jdk原生api实现的数据结构
        Map<String, Collection<String>> jdkMap = multimap.asMap();
        System.out.println(jdkMap);
        /*
        [1, 2, 3]
        true
        {a=[1, 2, 3], b=[4]}
        */
    }

    @Test
    public void test08() {
        /*
         * 不可变的集合
         */
        ImmutableList<String> immutableList = ImmutableList.of("a", "b", "c");
        // 执行add操作报错:UnsupportedOperationException
//        immutableList.add("c");

        List strList = new ArrayList();
        List jdkUnmodifiableList = Collections.unmodifiableList(strList);
        // 执行add操作报错:UnsupportedOperationException
//        jdkUnmodifiableList.add("a");
        // 修改原集合会改变不可变集合
        strList.add("a");
        System.out.println(jdkUnmodifiableList);
        /*
        [a]
        */
    }

    @Test
    public void test09() {
        String param = null;
//        if (param == null) {
//            throw new RuntimeException("参数不能为空");
//        }
//        Preconditions.checkNotNull(param, "参数不能为空");
//        Preconditions.checkArgument(param != null, "参数不能为空");
        /*
         */
    }
}
