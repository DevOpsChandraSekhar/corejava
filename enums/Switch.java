package enums;

/**
 * @author chandra
 *
 */
public class Switch 
{
  enum X
  {
	  A,B,C,D;
  }
  public static void main(String[] args) {
	X x1=X.B;
	switch (x1) {
	    case A:
		System.out.println("In A");
		break;

		case B:
			System.out.println("In B");
			break;
		case C:
			System.out.println("In C");
			break;

		case D:
				System.out.println("In D");
				break;	
	default:
		break;
	}
	System.out.println("done");
}
}
