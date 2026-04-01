import java . util.*;
class Demo {

	public static void main(String [] args ){
		int [] arr = {1,2,1,3,2,1};
		
		HashMap <Integer , Integer> hm = new HashMap<>();
	
	
		for(int i= 0; i<arr.length; i++){
			hm.put(arr[i] , hm.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(hm);
	}	
}