package construcor;

/**
 * @author chandra
 *
 */
public class Invocation 
{
  public Invocation(int i)
  {
	  
	  System.out.println("int");
  }
  public Invocation()
  {
	  this(20);
	  System.out.println("default");
  }
}
