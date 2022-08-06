package introduction1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld1 {
	private HelloWorld1 helloWorld1;

	@Before
	public void setup() throws Exception{
		helloWorld1 = new HelloWorld1();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void testhelloWorld() {
		assertEquals(helloWorld1.helloWorld("Hello World!"), "Hello World!");
	}
}
