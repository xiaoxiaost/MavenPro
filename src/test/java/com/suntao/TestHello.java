package com.suntao;

import org.junit.Assert;
import org.junit.Test;

public class TestHello {

	@Test
	public void testSayHello() {
		Hello hello = new Hello();
		String result = hello.sayHello("Wang");
		Assert.assertEquals("Wang Hello World ! ",result);
	}

}
