import java.util.*;
class test extends RuntimeException
{
    test(String msg)
    {
        super(msg);
    }
}
public class exception2 {
    public static void main(String[] args) {
        public int age;
        try {
             Scanner c=new Scanner(System.in);
             System.out.println("Enter age=");
            age =c.nextInt();
            if (age<18)
                {
                    throw new test("You are not eligible"+age);
                }
            }
            catch (Exception e) 
                {
            System.out.println("You are not eligible");
                }
       
        }
}

