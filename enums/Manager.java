package enums;

/**
 * @author chandra
 *
 */
public class Manager 
{
	enum Test
	{
		t1,t2,t3,t4;
	}
 public static void main(String[] args)
{
	Test values[]=Test.values();
	for(int i=0;i<values.length;i++)
	{
		System.out.println(values[i]);
	}
}
}
