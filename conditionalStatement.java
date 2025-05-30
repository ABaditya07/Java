import java.util.*;
public class conditionalStatement {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int age=sc.nextInt();

      if(age<0){
        System.out.println("Enter the Valid Age");
      }
      else if(age<18){
        System.out.println("You are children");
      }
      else if(age<30){
        System.out.println("You are young");
      }else{
        System.out.println("You are above young");
      }
      
      int day=sc.nextInt();
      switch(day){
        case 1:System.out.println("Monday");
        break;
        case 2:System.out.println("Tuesday");
        break;
        case 3:System.out.println("Wednesday");
        break;
        case 4:System.out.println("Thursday");
        break;
        case 5:System.out.println("Friday");
        break;
        case 6:System.out.println("Saturday");
        break;
        default:System.out.println("Sunday");

      }
    }
}
