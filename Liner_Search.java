package sorting_and_searching;
public class Liner_Search {
	public static void main(String[] args) {

		int data[]= {10,23,34,44,65,78,99,122,333,445};
		int i=0,search=65,loc=-1;
		
		while(i<data.length) {
			if(data[i]==search) {
				loc=i+1;
				break;
			}
			else {
				i++;
			}
		}
		
		
		if(loc!=-1) 
			System.out.println(search+" Element found at the location : "+loc);
		else
			System.out.println("Element not found in the array "+search);
		
	}

}
