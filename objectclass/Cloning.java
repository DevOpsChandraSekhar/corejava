package objectclass;

/**
 * @author chandra
 *
 */
public class Cloning implements Cloneable
{
  int i;
  public static void main(String[] args)throws CloneNotSupportedException {
	Cloning c1=new Cloning();
	c1.i=10;
	Cloning c2=(Cloning)c1.clone();
	System.out.println(c1.i);
	System.out.println(c2.i);

}
}
