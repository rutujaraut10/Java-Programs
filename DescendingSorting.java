
import java.util.Scanner;

public class DescendingSorting {
    int arr[] = new int[5];
    int i,j,temp;
    Scanner sc = new Scanner(System.in);

    public void accept()
    {
        System.out.println("Enter Five Numbers: ");
        for (i = 0; i < 5; i++) {
            arr[i]=sc.nextInt(); 
        }
    }

    public void sort()
    {
        for (i = 0; i < 5; i++) 
        {
            for (j=i+1;j<5;j++) 
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    
            }
            
        }
    }

    public void display()
    {
        System.out.println("The sorted elements are: ");
        for(i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        DescendingSorting obj = new DescendingSorting();
        obj.accept();
        obj.sort();
        obj.display();
    }
}


