package sorting_and_searching;

public class BubbleSort {

	public static void main(String[] args) {
		
		float data[]= {10.5f,5.2f,3.3f,2.8f,67.1f,8.9f,12.12f};
		
		for(int i=data.length-1;i>=1;i--) {
			for(int j=0;j<i;j++) {
				if(data[j]>data[j+1])
				{
					var temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
		
		for(var d:data) {
			System.out.println(d);
		}
		
		
		

	}

}
