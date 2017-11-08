import java.util.Scanner;

public class Square extends Figure{
	int a;
	Scanner in = new Scanner(System.in);
	
	public void Input(){
		System.out.println("Сторона квадрата a = ");
		a = in.nextInt();
	}
	
	public void Output(){
		System.out.println("Квадрат со стороной " + a);
	}
}

