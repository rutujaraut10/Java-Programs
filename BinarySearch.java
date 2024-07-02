
import java.util.Scanner;

public class BinarySearch {
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

    int result = binarySearch(array, 0, len - 1, key);
        
        if (result == -1) 
        {
            System.out.println(key + " doesn't exist in the array.");
        } 
        else 
        {
            System.out.println(key + " is present at location " + (result + 1));
        }
        sc.close();
    }

    public static int binarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key) {
                return mid;
            }
            
            if (arr[mid] < key) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
}
