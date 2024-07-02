public class exception {
    public static void main(String[] args) {
        try
		{
			int a[]=new int[5];
            int c=23/0;
			a[5]=50/5;
			System.out.println(a[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("You can not divide with zero");

		}
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(0);
        }	
			System.out.println("yupppppeeee no exception");
    }
}

