import java.util.Scanner;

public class functions {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printName(n);
        printSum(n);
        double ans=getAVG(4, 10);
        System.out.println("Average is "+ans);

    }
    public static void printName(int n) {
        for(int i=1;i<=n;i++){
            System.out.println("Aditya");
        }
    }

    public static void printSum(int n) {
        int sum=0;
          
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Printing the Sum:- "+sum);
    }
    
    public static double getAVG(int a,int b) {
        double avg=(double)(a+b)/2;
        return avg;
    }

}
