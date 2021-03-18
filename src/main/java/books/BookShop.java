package books;

import java.util.HashMap;
import java.util.Map;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    public double cost(int[] books){
        //TODO complete
    	Map<Integer, Double> map = new HashMap<Integer, Double>();
    	map.put(0, 0.00);
    	map.put(1, 1.00);
    	map.put(2, 0.07);
    	map.put(3, 0.14);
    	map.put(4, 0.28);
    	map.put(5, 0.35);
     	
     	int one = 0;
     	int more = 0;
     	
     	//iterate over all books
     	
    	for (int i = 0; i < books.length; i++) {
    		//add to "one" if there is at least one occurence of this book
    		if (books[i] >= 1){
    			one += 1;
    			//add amount-1 to "more" if there is more than one occurence of this book
    			if (books[i]>=2) {
    				more += books[i]-1;
    			}
    		}
    	}
    	//calculate the price using hashmap for appropriate reductions
    	double reduced = (one * 8) - (one * 8 * map.get(one));
    	int notreduced = more*8;
    	
        return reduced+notreduced;
    }
}
