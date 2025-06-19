import java.util.Scanner;

public class functions {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printName(n);

    }
    public static void printName(int n) {
        for(int i=1;i<=n;i++){
            System.out.println("Aditya");
        }
    }
}
