class Netflix{

 static String kannadaMovies[]={"Kantara","Kranti","Googly","A","Shh!","KGF","Galipata","MungaruMale"};
 
 
 static String tamilMovies[]={"Sir","Enemy","Varisu","PS1","Karnan","Pathu tala","Master","Singham"};
 
 //method
public static void main(String Netflix[]){
System.out.println("Main started");
getKannadaMovies();
getTamilMovies();
System.out.println("Main ended");
}

//method
//Declaration of a method
public static void getKannadaMovies(){
System.out.println("calling getKannadaMovies method");
System.out.println("List of kannadaMovies: ");
for(int i=0;i<kannadaMovies.length;i++){System.out.println(kannadaMovies[i]);}
System.out.println("ending getKannadaMovies method");
return;
}

public static void getTamilMovies(){
	System.out.println("calling getTamilMovies");
	System.out.println("List of tamilMovies:");
	for(int i=0;i<tamilMovies.length;i++){System.out.println(tamilMovies[i]);}
	System.out.println("ending getTamilMovies");
	return;
	
	
	
}





}



