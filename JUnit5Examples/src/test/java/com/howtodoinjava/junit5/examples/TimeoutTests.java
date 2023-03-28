package com.howtodoinjava.junit5.examples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(3)
class TimeoutTests {

	/*@Test
	void testMethodOne() throws InterruptedException {
	    TimeUnit.SECONDS.sleep(5);
	}*/
	
	@Test
	@Timeout(5)
	void testMethodTwo() throws InterruptedException {
	    TimeUnit.SECONDS.sleep(4);
	}
	
	@Test
	void testGetValue() throws InterruptedException {
	    Assertions.assertTimeout(Duration.ofSeconds(3), () -> {
            getValue();
        });
	}
	
	void getValue() throws InterruptedException {
		TimeUnit.SECONDS.sleep(2);
	}
}
