import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        num1=sc.nextInt();
        System.out.println("Enter first string:");
        num2=sc.nextInt();
        if (num1>num2){
            System.out.println("num1 is greater");
            
        }else if (num1<num2){
            System.out.println("num2 is greater");
        }
    }        
}
