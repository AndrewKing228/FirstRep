import java.util.Scanner;

public class Square extends Figure{
	int a;
	Scanner in = new Scanner(System.in);
	
	public void Input(){
		System.out.println("������� �������� a = ");
		a = in.nextInt();
	}
	
	public void Output(){
		System.out.println("������� �� �������� " + a);
	}
}

