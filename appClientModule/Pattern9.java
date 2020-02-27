
public class Pattern9 {

	public static void main(String[] args) {
		
		int n=5;
		char k;
		
		for(int i=1;i<=n;i++)
		{
			k='A';
			for(int j=1;j<=n*2-1;j++)
			{
				if(j<=n+1-i || j>=n-1+i)
				{
					System.out.print(k+" ");
				}
				else
				{
					System.out.print("  ");
				}
				if(j<n)
					k++;
				else
					k--;
			}
			System.out.println();
		}

	}

}

//A B C D E D C B A 
//A B C D   D C B A 
//A B C       C B A 
//A B           B A 
//A               A 

