import java.util.Date;

public class agegame {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age<=5) {
			System.out.println("baby");
		}
		else if(age<=10) {
			System.out.println("toddler");
		}
		else if(age<=18) {
			System.out.println("teenaged");
		}
		else if(age<=25) {
			System.out.println("adult");
		}
		else {
			System.out.println("Grown old")
    }
}