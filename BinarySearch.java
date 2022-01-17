package sorting_and_searching;

public class BinarySearch {

	public static void main(String[] args) {
		//Array initialization
		float data[]= {10.1f,23.4f,34.3f,44.44f,65.34f,78.5f,99.1f,122.3f,333.4f,445.6f};
		float search=44.44f;
        int mid,high,low=0,loc=-1;
        high=data.length;
        //calculating the mid fist time
        mid=(low+high)/2;
		while(true) {
			//showing the low mid and high value
			
			System.out.println("\n\nlow="+low);
			System.out.println("High="+high);
			System.out.println("mid= "+mid);
			
			//checking the search value is present or not
			if(search==data[mid]) {
				loc=mid;
				break;
			}
			
			//moving the low 
			else if(search>data[mid]) {
				low=mid+1;
			}
			
			//moving the high
			else {
				high=mid-1;
			}
			
			//checking of low and mid are equal 
			if(low==mid) {
				break;
			}
			
			//calculating the mid again
			mid=(low+high)/2;
	     }
		
		if(loc==-1)
		System.out.println(search+" Element not found in the list");
		
		else
		  System.out.println(search+" Element foud at the location :"+(loc+1));			
		
	}

}
