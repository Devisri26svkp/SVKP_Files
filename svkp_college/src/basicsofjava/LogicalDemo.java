package basicsofjava;

public class LogicalDemo {

	public static void main(String[] args) {
		int a=10,b=5,c=20;
		//logical and
		System.out.println("(a>b)&&(b<c)"+((a>b)&&(b<c)));//true
		//logical or
		System.out.println("(a>b)||(b<c)"+((a>b)||(b<c)));//true
		//logical not
		System.out.println("!(a>b)"+!(a>b));//false
		
		}

}
