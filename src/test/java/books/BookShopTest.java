package books;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * TODO : Add your import here
 */

public class BookShopTest {

    /**
     * TODO : Put your test here
     */
	
	@Test
	public void test() {
		BookShop test = new BookShop("testshop");
		
		int[] books1 = {1,2,0,1,1};
		double output1 = test.cost(books1);
		
		int[] books2 = {5,0,0,1,1};
		double output2 = test.cost(books2);
		
		int[] books3 = {1,1,1,1,1};
		double output3 = test.cost(books3);
		
		int[] books4 = {1,3,3,2,1};
		double output4 = test.cost(books4);
		
		int[] books5 = {0,0,0,0,0};
		double output5 = test.cost(books5);
		
		assertEquals(31.04, output1);
		assertEquals(52.64, output2);
		assertEquals(26.00, output3);
		assertEquals(66.00, output4);
		assertEquals(00.00, output5);
	}
}