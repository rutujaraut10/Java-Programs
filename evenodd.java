import java.util.Scanner;

public class evenodd {
        public static void check(int a) {
            {
                if(a % 2 != 0)
                {
                    throw new ArithmeticException("It's oddd number");
                }
                else
                {
                    System.out.println("It's even number so welcome!!");
                }
            }
    
        }
    
        public static void main(String[] args) {
            evenodd obj=new evenodd();
            Scanner sc = new Scanner(System.in);
            System.err.println("Enter your number");
            int a = sc.nextInt();
            obj.check(a);
        }
    }
    
