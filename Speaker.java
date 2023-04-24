class Speaker{

 static boolean isConnected;
 static double price =3000.0;
 static int maxVolume=8;
 static int minVolume;
 static int currentVolume=0;
 static String name="voice";
 
 public static void main(String speaker[])
 {
 System.out.println("main started");
 onOroff();
increaseVolume();
 increaseVolume();
 increaseVolume();
 onOroff();
 onOroff();
 decreaseVolume();
 decreaseVolume();

 
 System.out.println("main ended");
 }
 
 
 
 
 
 
 public static boolean onOroff()
 
 {
 System.out.println("onOroff method started");
 //condition statements
 if(isConnected==false)
 {
 isConnected=true;
 System.out.println("Speaker is turned on...");
 }
 
 else if (isConnected==true)
 {
 isConnected=false;
 System.out.println("Speaker is turned off...") ;}
 System.out.println("onOroff method ended");
 return isConnected;
 
 }
public static int increaseVolume()
{
	System.out.println("increaseVolume method started");
	if(isConnected==true)
	{
	if (currentVolume<maxVolume){System.out.println("current volume is less than max...proceed");
	currentVolume=currentVolume+1;
	System.out.println("the current volume is"+currentVolume);
	}	
		else
		{
			System.out.println("max volume reached");
			}
	}else{
				System.out.println("Gubee..speaker turn on maadu first");
			}
			System.out.println("increaseVolume method ended");
	return currentVolume;
}
	
 public static int decreaseVolume()
{
	System.out.println("decreaseVolume method started");
	if(isConnected==true)
	{
	if (currentVolume>minVolume){System.out.println("current volume is greater than min...proceed");
	currentVolume=currentVolume-1;
	System.out.println("the current volume is"+currentVolume);
	}	
		else
		{
			System.out.println("min volume reached");
			}
	}else{
				System.out.println("Gubee..speaker turn on maadu first");
			}
			System.out.println("decreaseVolume method ended");
	return currentVolume;
}
}
 



