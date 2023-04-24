class Multiplication{

public static void main(String mul[])
{
System.out.println("main started");
//invoking a method
multiply(32,43);//arguments-32,43(at the time of invoking a method we pass arguments)
multiply(12,56);
multiply(67,786);
System.out.println("main ended");
}
public static void multiply(int num1,int num2)//public static-access modifier,void-return type,void multiply(int num1,int num2)-signature of a method.
//(at the time of declaration of a method we pass parameters)
{System.out.println("multiply method started");
System.out.println(num1*num2);
System.out.println("multiply method ended");
}
}
//syntax-<access-modifier> return type methodname(parameter1,parameter2,.....parameter n){
	
	//block of code/statements
	//return value;
}
//method definition-it is a block of statements which is used to perform certain functionality
