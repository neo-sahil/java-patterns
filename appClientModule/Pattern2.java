
public class Pattern2 {

	public static void main(String[] args) {
		
		int n=4,k=1;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=k)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			if(i<n)
				k++;
			else
				k--;
		}

	}

}

//*       
//* *     
//* * *   
//* * * * 
//* * *   
//* *     
//*       



