import java.util.Arrays;
import java.util.Scanner;


public class InsertionSort {
	private static SOP p=new SOP();
	
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		p.SOP("enter number of elements");
		int n=sc.nextInt();
		int numarr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			numarr[i]=sc.nextInt();
		}
		
		InsertionSort is=new InsertionSort();
		numarr=is.sort(numarr);
		p.SOPLN("final sorted array: "+Arrays.toString(numarr));
		
	}
	
	public int[] sort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			int tempval=a[i];
			int j=i;
			for(;j>0;j--)
			{
				if(a[j-1]>tempval)
					a[j]=a[j-1];
				else
					break;
			}
			a[j]=tempval;
			p.SOPLN("pass "+(i+1)+": "+Arrays.toString(a)); //uncomment this line to print pass by pass values
			
		}
		return a;
	}

}
