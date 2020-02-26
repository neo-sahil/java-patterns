
public class Pattern8 {

	public static void main(String[] args) {
		
		int n=4,k=0;
		
		for(int i=1;i<=n;i++)
		{
			k=1;
			for(int j=1;j<=n*2-1;j++)
			{
				if(j>=n+1-i && j<=n-1+i)
				{
					System.out.print(k+" ");
					if(j<n)
						k++;
					else
						k--;
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}


//      1        
//    1 2 1     
//  1 2 3 2 1   
//1 2 3 4 3 2 1 

