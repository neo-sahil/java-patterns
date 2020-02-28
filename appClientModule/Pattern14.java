
public class Pattern14 {

	public static void main(String[] args) {
		
		int n=7,k,a;
		k=n-1;
		
		for(int i=1;i<=n;i++)
		{
			a=k;
			for(int j=1;j<=n;j++)
			{
				if(j<=n+1-i)
				{
					System.out.print(a+" ");
					a--;
				}
				else
					System.out.print("  ");
			}
			System.out.println();
			k--;
		}

	}

}

//6 5 4 3 2 1 0 
//5 4 3 2 1 0   
//4 3 2 1 0     
//3 2 1 0       
//2 1 0         
//1 0           
//0             

