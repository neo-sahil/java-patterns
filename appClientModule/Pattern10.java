
public class Pattern10 {

	public static void main(String[] args) {
		
		int n=4, k=1;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{

				if(j>=n+1-k && j<=n-1+k)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			if(i<n)
				k++;
			else
				k--;
			System.out.println();
		}

	}

}
