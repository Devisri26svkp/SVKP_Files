package basicsofjava;

public class IfElseIfDemo {

	public static void main(String[] args) {
		int score=89;
		if(score>90)
		{
			System.out.println("Grade A");
			
		}
		else if(score>=80) {
			System.out.println("Grade B");
		}
		else if(score>=70)
		{
			System.out.println("Grade C");
		}
		else if(score>60) {
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}