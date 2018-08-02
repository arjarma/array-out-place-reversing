class test7
{
static int[] arrs(int[] arr)
{
int n=arr.length;
	int j=n-1;
int s[]=new int[n];
for(int i=0;i<n;i++)
{

	s[j]=arr[i];
	System.out.print("\t"+arr[i]);
	System.out.print("\n");
	j=j-1;
}
arr=s;
s=null;
return arr;
}

public static void main(String a[])
{
	int[] arr1=new int[]{50,40,30,20,10,5};
	//System.out.println(arr1);
	int[] rev=arrs(arr1);
	for(int i:rev)
	{
		
	System.out.print("\t"+i);
	}

}
}