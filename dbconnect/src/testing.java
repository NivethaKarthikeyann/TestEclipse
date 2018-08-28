import java.io.*;
public class testing {
	public static void main(String args[])
	{
	String a[]="select ID,NAME from report".split(" ");
	System.out.println(a[1]);
	String a1=a[1];
	if(a1.equalsIgnoreCase("*"))
		System.out.println("display all columns from table");
	else
	{
		String b[]=a[1].split(",");
		for(String c:b)
		{
			System.out.println(c);
		}
		
	}
	
	}
}
