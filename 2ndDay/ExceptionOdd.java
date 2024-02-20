import java.util.*; 
class fileHandling {
    public static void main(String[] args)
    {
            System.out.println("Enter the number");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            CheckOddExcep(num);

    }
    static void CheckOddExcep(int num) throws Exception
    {
        if(num%2!=0){
                throw new Exception("It is and Odd Exception");
            }
            else{
                System.out.println("NO exception");
            }
    }
}