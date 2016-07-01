import java.util.*;

public class RandomArrayGenerator {
	
	ArrayList<int[]> arl = new ArrayList<int[]>();

	public ArrayList<int[]> generate(){
		
		
		
		for(int j = 0; j < 100; j++){
			Random random = new Random();
			int length = random.nextInt(99) + 1;
			int [] array = new int [length];
			int value;
			
			for(int i = 0; i <= length-1; i++){
				value = random.nextInt(99) + 1;
				array[i] = value;
				
			}
			//System.out.println(array[array.length-1]);
			arl.add(array);
		}
		
		return arl;
		
	}
	
	public int[] getArray(int i){
		return arl.get(i);
	}
	
}
