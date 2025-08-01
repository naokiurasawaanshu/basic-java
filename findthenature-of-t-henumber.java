import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        a=sc.nextInt();
        if (a>0){
            System.out.println("positive");
        }else if (a<0){
            System.out.println("negative");
        }else if(a==0){
            System.out.println("zero");
        }
    }  
}
