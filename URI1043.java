import java.util.*;

public class URI1043 {

	public static void main(String[] args) {
		Scanner k = new Scanner (System.in);
		Float a,b,c,Area,p;
		
		a = k.nextFloat();
		b = k.nextFloat();
		c = k.nextFloat();	
		 
		 if((a+b)>c && (a+c)>b && (b+c)>a)
		 {
		  p = a+b+c;
		  System.out.print("Perimetro = "+p+"\n");		 	 
		 }
		 else
		 {
			 Area = ((a+b)/2)*c;
			 System.out.print("Area = "+Area+"\n");
		 }

	}

}
