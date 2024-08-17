import java.util.Scanner;
import java.util.HashMap;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashMap<Character,Integer> obj=new HashMap<Character,Integer>();
		obj.put('I',1);
		obj.put('V',5);
		obj.put('X',10);	
		obj.put('L',50);
		obj.put('C',100);
		obj.put('D',500);
		obj.put('M',1000);
		int result=0;
		for(int i=0;i<s.length();i++)
		{
		   if (i > 0 && obj.get(s.charAt(i)) > obj.get(s.charAt(i - 1)))
		    {
		        result += obj.get(s.charAt(i)) - 2 * obj.get(s.charAt(i - 1));
		    }
		    else
		    {
		        result += obj.get(s.charAt(i));
		    }
		}
		System.out.println(result);
	}
}
