import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTesting junit = new jUnitTesting();
		String result = junit.addStrings("Hello ", "World");
		assertEquals("Hello World", result);
	}

}
