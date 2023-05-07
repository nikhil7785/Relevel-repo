package BS;

public class BS_Assending_ord {
	public static void main(String[] args) {
		int []arr={10,30,5,2,0,9};
		{
			for(int j=0;j<=arr.length;j++)
			{
				for(int i=0;i<arr.length-1;i++)
				{
					if(arr[i]<arr[i+1])
					{
						int temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
				}
			}
			for(int k=0;k<arr.length;k++)
			{
				System.out.println(arr[k]);
			}
		}
	}

}
