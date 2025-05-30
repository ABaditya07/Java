import java.util.*;

class first{
    public static void main(String args[]){
        // To print the outout
        System.out.println("Hello Aditya ");

        // To take the input from the user
        Scanner sc=new Scanner(System.in);

        // as the input is string we take nextline(), for int nextInt() is used
        String name=sc.nextLine();
        System.out.println(name);
        
        // Sum of the two numbers
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}


// Data types in java

// Primitive:-
//    Byte,short,char,boolean,int,long,float,double

// Non-Primitive:-
//    String,Array,Class,Object,Interface