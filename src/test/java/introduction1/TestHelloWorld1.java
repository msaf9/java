package introduction1;

import static org.junit.Assert.assertEquals;

import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestHelloWorld1 {
	private HelloWorld1 helloWorld1;
	private final PrintStream standardOut = System.out;

	@BeforeEach
	public void setup() throws Exception {
		helloWorld1 = new HelloWorld1();
	}

	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}

	@SuppressWarnings("static-access")
	@Test
	public void testhelloWorld() {
		assertEquals(helloWorld1.helloWorld("Hello World!"), "Hello World!");
	}

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@SuppressWarnings("static-access")
	@Test
	public void testPrint() {
		helloWorld1.print();
		Assert.assertEquals("Hello World!", systemOutRule.getLog().trim());
	}

}
