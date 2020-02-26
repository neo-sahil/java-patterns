
public class Pattern6 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i%2==0)
					if(j>=n+1-i && j<=n-1+i && j%2==0)
						System.out.print("*");
					else
						System.out.print(" ");
				else
					if(j>=n+1-i && j<=n-1+i && j%2!=0)
						System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		}

	}

}

//    *    
//   * *   
//  * * *  
// * * * * 
//* * * * *
