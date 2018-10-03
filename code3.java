import java.util.*;
class code3
{
	static char Frequency(String str)
	{
		int array[] = new int[256];
		int max = -1;
		char freq = ' ';
		for(int i=0;i<str.length();i++) 
		{
			array[str.charAt(i)]++;
			if (max<array[str.charAt(i)]) 
			{
                max=array[str.charAt(i)];
                freq=str.charAt(i);
            }
        }
		return freq;
	}
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your String");
	String str = s.next();
	System.out.println("maximum frequency element in string: "+ Frequency(str));
}
}

