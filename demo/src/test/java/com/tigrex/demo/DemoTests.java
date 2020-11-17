package com.tigrex.demo;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoTests {

    @Test
    public void stream() {
        System.out.println(Stream.of("a", "b").collect(Collectors.toList()));
    }
}
