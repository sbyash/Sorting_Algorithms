/*SOP refers to java class which implements the Console Printing statement. I separated that code to make it easier to call and for hassel free writing */
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort
{	private static SOP p=new SOP();
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
		
		BubbleSort bs=new BubbleSort();
		numarr=bs.sort(numarr);
		p.SOPLN("final sorted array: "+Arrays.toString(numarr));
		
	}
	public int[] sort(int a[])
	{	boolean flag=true;
		for(int i=0;i<a.length&&flag;i++) /* flag is used to stop sorting if the array is already sorted*/
		{	flag=false;
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j-1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					flag=true;
				}
			}
			/*p.SOPLN("pass "+(i+1)+": "+Arrays.toString(a));*/ //uncomment this line to print pass by pass values
		}
		return a;
	}

}