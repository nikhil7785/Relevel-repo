package Basic_Programs;

public class FindMinNo_InArray {

	public static void main(String[] args) {
		int arr[]= {10,20,3,5,50};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			//if(min<arr[i])   Find max no
			if(min>arr[i])   //Find min no
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		
	}

}
