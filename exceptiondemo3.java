public class exceptiondemo3 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String str = "Hello";
        try{
            int value = array [3];
            char charValue = str.charAt(5);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index out of bounds: " + e.getMessage());
        }
    }
}

