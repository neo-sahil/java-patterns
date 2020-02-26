package SORTING;

public class BubbleSort {

	public static void main(String[] args) {
		
		int n=5;
		int arr[]= {4,7,3,8,5,3,8,4,9};
		
		for(int i=0;i<arr.length-1;i++)
		{
			boolean sorted = true; //this is for optimization
			for(int j=0;j<arr.length-1-i;j++) //we subtract i for optimization
			{
				if(arr[j+1]<arr[j])
				{
					arr[j+1]=arr[j+1]+arr[j]; //this is the swappin logic without the temp variable
					arr[j]=arr[j+1]-arr[j];
					arr[j+1]=arr[j+1]-arr[j];
					sorted=false;
				}
			}
			if(sorted) // this is for optimization
				break;
		}
		System.out.println("After Swapping:-");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
