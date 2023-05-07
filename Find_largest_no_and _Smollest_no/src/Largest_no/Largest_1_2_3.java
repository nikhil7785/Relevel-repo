package Largest_no;

public class Largest_1_2_3 {
	public static void main(String[] args) {
		int fl=0,sl=0,tl=0;
		
		int[]arr={10,5,50,6,30,100};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fl)
			{
				tl=sl;
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]>sl)
			{
				tl=sl;
				sl=arr[i];
			}
			else
			{
				tl=arr[i];
			}
		}
		System.out.println(fl+" "+sl+" "+tl);
	}

}
