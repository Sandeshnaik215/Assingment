
public class BubbleSort {

public static void main(String[] args) {

	int [] arr= {10,2,46,23,12,13};
	
	for(int i=0;i<=arr.length;i++) {
		for(int j=0;j<arr.length ;j++) {
			int temp=0;
			if(arr[j]<arr[j+1]){
				
				temp=arr[j];
				arr[j]=arr[j+1];
				
			arr[j+1]=temp;
			arr[i]=arr[j];
			
			}
		}
		
/*	int [] arrf= new int[arr.length];
	for(int k=0;k<arr.length;k++) {

		arrf=*/
	}
		System.out.println();
	
	}
	
}


}
