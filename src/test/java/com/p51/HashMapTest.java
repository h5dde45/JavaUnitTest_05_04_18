package com.p51;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.fest.assertions.api.Assertions.assertThat;

public class HashMapTest {
    @Test
    public void test1() throws Exception {
        Map<String,String> map=new HashMap<>();

        assertThat(map).isEmpty();
        assertThat(map).hasSize(0);
        assertThat(map).doesNotContainKey("d");

        assertThat(map.entrySet().iterator().hasNext()).isFalse();
    }


    @Test
    public void test2() throws Exception {
        Map<String,String> originalMap=new HashMap<>();
        originalMap.put("a","a1");
        originalMap.put("b","b1");

        Map<String,String> copyMap=new HashMap<>(originalMap);

        assertThat(copyMap)
                .describedAs("c m")
                .hasSize(2)
                .isEqualTo(originalMap)
                .isNotSameAs(originalMap);

        originalMap.put("c","c1");

        assertThat(copyMap)
                .hasSize(2)
                .doesNotContainKey("c")
//                .doesNotContain(entry("b","b1"))
                .isNotEqualTo(originalMap); }


}
