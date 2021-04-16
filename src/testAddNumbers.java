import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitTesting junit = new jUnitTesting();
		int result = junit.addNumbers(296, 304);
		assertEquals(600, result);
	}

}
