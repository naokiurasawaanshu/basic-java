import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int len,bre, area;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the lenght");
	    len=sc.nextInt();
	    System.out.println("enter the breath");
	    bre=sc.nextInt();
	    area=len*bre;
	    System.out.println("area of rectangle " +area);
	    
	}
}
