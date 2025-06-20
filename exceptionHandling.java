public class exceptionHandling {
    public static void main(String[] args) {
        try {
            int ans=10/0;
            int arr[]=new int[5];
            System.out.println(arr[100]);
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("There is an Exception");
        }
        finally{
            System.out.println("This block will print in any how condition");
        }
    }
}
