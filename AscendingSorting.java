
import java.util.Scanner;

public class AscendingSorting {
    int a[] = new int[5];
    int i,j,temp;
    Scanner sc = new Scanner(System.in);

    public void accept()
    {
        System.out.println("Enter Five numbers:");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();     
        }
    }

    public void sort()
    {
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    /* How the for loop works 
              i=0  j=1,2,3,4
              87 5 67 54 98              
              5 87 67 54 98
            
              i=1  j=2,3,4
              5 67 87 54 98
              5 54 87 67 98

              i=2  j=3,4
              5 54 67 87 98

              i=3 j=4
              5 54 67 87 98
    */   

    public void display()
    {
        System.out.println("The sorted elements are: ");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        AscendingSorting ascendingSorting = new AscendingSorting();
        ascendingSorting.accept();
        ascendingSorting.sort();
        ascendingSorting.display();
    }
}
