import java.util.Scanner;

public class MyClass extends Figure{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int k=0, n=0;
	    Figure[] Mas = new Figure[30];
	    while(true){
	    	System.out.println("0-exit; 1-add triengle; 2-add sqare; 3-show all figures: ");
	    	k = in.nextInt();
	        switch (k){
	            case 1:{
	                Mas[n] = new Triengle();
	                Mas[n].Input();
	                n++;
	                break;
	            }
	            case 2:{
	                Mas[n]= new Square();
	                Mas[n].Input();
	                n++;
	                break;
	            }
	            case 3:{
	                for(int i=0;i<=n;i++){
	                    Mas[i].Output();    
	                }  
	                break;
	            }
	            case 0: return;
			}
		}
	}
}
