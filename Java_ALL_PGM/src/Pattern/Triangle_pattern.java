package Pattern;

public class Triangle_pattern {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");  
										
			}
			System.out.println();
		}



	}

}

/* j           *             i

 1             *             1
 1 2           * *           2 2
 1 2 3         * * *         3 3 3
 1 2 3 4       * * * *       4 4 4 4 */
