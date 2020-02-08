import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multiFunTesting {

	@Test
	void test() {
		int expec= 25;
		multiFun o =new multiFun();
		int act=o.multi(5,5);
		assertTrue(expec==act);
	}

}
