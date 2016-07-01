import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;


public class RandomArrayGeneratorTest {

	//RandomArrayGenerator returns an ArrayList of 100 int[], whose length is between 1 and 100.
	//each int[] contains integers between the values of 1 and 100
	RandomArrayGenerator rando = new RandomArrayGenerator();
	ArrayList<int[]> arl = new ArrayList<int[]>();
	
	//generates the ArrayList of int []
	@Before
    public void setup() {
		
		
		arl = rando.generate();
		System.out.println("@Before - setup: arl is ArrayList of int[]");
    }
	
	//assert the generated arraylist contains 100 elements
	//The test should pass, as the Arraylist should have 100 elements
	@Test
	public void testGenerate() {
		assertEquals(arl.size(), 100);
		
	}
	
	@Test
	public void testLength() {
		for(int i = 0; i < 100; i++ ){
			assertEquals((rando.getArray(i).length < 100), true);
			assertEquals((rando.getArray(i).length > 1), true);
		}
		
		
	}
	
	
	

}
