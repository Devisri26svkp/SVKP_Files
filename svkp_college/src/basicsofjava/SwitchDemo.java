package basicsofjava;

public class SwitchDemo {

	public static void main(String[] args) {
		String day="funday";
		switch(day)
		{
		case "Monday":
		case "monday":
			System.out.println("Attend the Meeting");
			break;
			
		case "Tuesday":
		case "tuesday":
			System.out.println("Work on projecttask");
			break;
		case "Wednesday":
		case "wednesday":
			System.out.println("Submit the progress report");
	        break;	
		case "Thursday":
		case "thursday":
			System.out.println("Client call and review");
		    break;
		case "Friday":
		case "friday":
			System.out.println("wrap up weekly task ");
			break;
		case "Saturday":
		case "saturday":
			System.out.println("enjoy the weekend");
			break;
			
			default:
			{
				System.out.println("invalid day");
			}
		}
	}

}
