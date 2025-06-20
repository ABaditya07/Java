import java.util.Scanner;

public class strings {
    public static void main(String[] args) {

    //    Scanner sc=new Scanner(System.in);
    //    System.out.println("Enter The First Name ");
    //    String firstN=sc.nextLine();

    //    System.out.println("Enter The Last Name ");
    //    String lastN=sc.nextLine();

    //    System.out.println(firstN+" "+lastN);
        

        // String firstName="Aditya";
        // System.out.println(firstName);

        // String lastName=new String("Bhure");
        // System.out.println(lastName);

        // System.out.println(firstName+" "+lastName);

        // String str="aditya";
        // str="love";
        // System.out.println(str);


        // String name1="Aditya";
        // String name2="Aditya";
        // String name3=new String("ADITYA");

        // if(name1==name2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        // if(name1.equals(name3)){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        
        // if(name1.equalsIgnoreCase(name3)){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }


        String name="AdityaBhure";
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.substring(1,6));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String str="This,is,my,code";
        String[]words=str.split(",");

        for(String word:words){
            System.out.println(word);
        }
    }
}
