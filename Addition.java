class Addition{

   public static void main(String addition[])
   {
   System.out.println("main started");
   add(234,876);
   add(123,675);
   add(654,98);
   add(76,98);
   System.out.println("main ended");
   }

//declaration of a method
//always associated with paranthesis
//inside paranthesis we will have parameters
public static void add(int a,int b)
{
 System.out.println(a+b);
}

}