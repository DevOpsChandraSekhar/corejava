package objectclass;

class U {
	int i;
	U(int i)
	{
		this.i=i;
	}
	@Override
	public String toString() {
		
		return "="+i;
	}
	@Override
	public boolean equals(Object obj) {
		
		return (obj instanceof U &&i==((U)obj).i);
	}
	@Override
	public int hashCode() {
		
		return i;
	}
}
/**
 * @author chandra
 *
 */
public class Mgr13 {
public static void main(String[] args) {
	U u1=new U(90);
	U u2=new U(90);
	System.out.println(u1);
	System.out.println(u2);
	System.out.println(u1.equals(u2));
	System.out.println(u1.hashCode());
	System.out.println(u2.hashCode());
}
}
