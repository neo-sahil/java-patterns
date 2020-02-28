
public class Pattern15 {

	public static void main(String[] args) {
		
		int n=5,k=1,a;
		for(int i=1;i<=n*2-1;i++)
		{
			a=1;
			for(int j=1;j<=n;j++)
			{
				if(j>=n+1-k)
				{
					System.out.print(a+" ");
					a++;
				}
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

//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1 
