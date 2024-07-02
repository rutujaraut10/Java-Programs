
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) { 
    int i,key,len,array[];
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Array Length: ");
    len = sc.nextInt();
    array = new int[len];
    System.out.println("Enter " + len + " elememts");

    for (i = 0; i < len; i++) 
    {
        array[i] = sc.nextInt();    
    }
    
    System.out.println("Enter the search key value: ");
    key = sc.nextInt();
    for (i = 0; i < len; i++) 
    {
        if(array[i] == key) 
        {
            System.out.println(key + " is present at location " +(i+1));
            break;
        }
    }
    if (i == len) 
    {
        System.out.println(key + "doesn't exist in array.");
    }        
    }
}

