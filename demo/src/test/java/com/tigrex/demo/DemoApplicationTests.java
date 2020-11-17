package com.tigrex.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void stream() {
		System.out.println(Stream.of("a", "b", "c").collect(Collectors.toList()));
	}

}
