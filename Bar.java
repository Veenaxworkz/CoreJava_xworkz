class Bar{

       static String alcohol[]={"OMR","BP","Black&White","BlackDog","100 Piper'S","Brocode","Budwiser","Signature"};
	   public static void main(String Bar[]){
	   System.out.println("List of brands available:");
	   System.out.println("1:"+alcohol[0]+"\n"+"2:"+alcohol[1]+"\n"+"3:"+alcohol[2]+"\n"+"4:"+alcohol[3]+"\n"+"5:"+alcohol[4]);
	   
	   
	   
	   
//+for concatination.
//\n for next line.
//\n also consider as string so written in "".	
// for more brands we use for looping statement to consume time.
//we have written string out side main so we have used static.
   
	 

 System.out.println("List of brands available using for loop:");
for(int i=0;i<alcohol.length;i++){ System.out.println(alcohol[i]);}

	   


//length is the property of array type variable.
//+ concatination
//++ increment operator
//< relational operator(<,>,!=,==,<=,>=) its output is always true or false.these are used as conditions.
//in for loop 1st statement will get executed only once.that is  declaration and initialization  of variable .

 System.out.println("List of brands available using for loop:");
for(int i=0;i<=alcohol.length-1;i++){ System.out.println(alcohol[i]);}
	   }
}
//if you use<=,then write length-1. length-1 is index size.

//syntax for for loop is:for(declaration and initialization of variable;condition using relational operator;increment statement){
//block of code }





// hw-clg dept,mnc companies,supermarket things-chocolates.perfumes.groceries.,tourist places-placenames,hotstar-hindi series15,english series 15,credit card names

