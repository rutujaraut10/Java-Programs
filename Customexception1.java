import java.util.Scanner;

public class Customexception1 {
    int salary;
    String nationality;
    Scanner sc = new Scanner(System.in);
    public void accept()
    {
        System.out.println("Your Nationality");
        nationality = sc.nextLine();
        System.out.println("Enter your Salary");
        salary = sc.nextInt();
    }
    public void validate() 
    {
        if(nationality.equalsIgnoreCase("Indian") && salary >=50000)
        {
            int san = (salary*70/100);
            System.out.println("You are eligible");
        }
        else{
            System.out.println("You are not eligible");
        }
    }

    public static void main(String[] args) {
        Customexception1 obj = new Customexception1();
        obj.accept();
        obj.validate();
    }
}

