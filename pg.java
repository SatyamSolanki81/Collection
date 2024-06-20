import java.util.*;
class Demo1 
{
	public static void main(String ar[])
	{
		int st[]={1,2,3,4,5,6,7,8,5,3};
		//st=st.sort();
		HashSet<Integer> hm=new HashSet<>();
		for(int i=0;i<st.length;i++)
		{
			hm.add(st[i]);
		} 
		for(int str:hm)
		{
		System.out.print(" "+str);
		}
		
	}
}