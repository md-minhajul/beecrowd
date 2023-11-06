import java.util.*;


public class URI1045 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		double [] T = new double [3];
		int co=0;
		while(true)
		{
			if(co>=T.length)
			{
				break;
			}
			else if(co<T.length)
			{
				double n = k.nextDouble();
				if(n>0)
				{
				T[co] = n;
				co++;
			}
		}
		}
		
		Arrays.sort(T);
		
		double a,b,c,temp;
		
		for(int str=0,end=T.length-1; str<=end; end--,str++)
		{
			temp = T[end];
			T[end] = T[str];
			T[str] = temp;
		}
		
		a = T[0];
		b = T[1];
		c = T[2];
		
		//System.out.print(a+" "+b+" "+c);
		
		
		/*if(a>=(b+c))
		{
			System.out.print("NAO FORMA TRIANGULO\n");
		}
		if((Math.pow(a,2))==(Math.pow(b,2)+Math.pow(c,2)))
		{
			System.out.print("TRIANGULO RETANGULO\n");
		}
		if(Math.pow(a,2)>(Math.pow(b,2)+Math.pow(c,2)))
		{
			System.out.print("TRIANGULO OBTUSANGULO\n");
		}
		if(Math.pow(a,2)<(Math.pow(b,2)+Math.pow(c,2)))
		{
			System.out.print("TRIANGULO ACUTANGULO\n");
		}
		if(a==b && a==c)
		{
			System.out.print("TRIANGULO EQUILATERO\n");
		}
		if(((a==b) && (b!=c)) || ((b==c) && (a!=c)) || ((a==c) && (b!=c)))
		{
			System.out.print("TRIANGULO ISOSCELES\n");
		}*/
		

		if(a>=(b+c))
		{
			System.out.print("NAO FORMA TRIANGULO\n");
		}
		else if((a*a)==((b*b)+(c*c)))
		{
			System.out.print("TRIANGULO RETANGULO\n");
		}
		else if((a*a)>((b*b)+(c*c)))
		{
			System.out.print("TRIANGULO OBTUSANGULO\n");
		}
		else if((a*a)<((b*b)+(c*c)))
		{
			System.out.print("TRIANGULO ACUTANGULO\n");
		}
		if((a==b) && (a==c) && (b==c))
		{
			System.out.print("TRIANGULO EQUILATERO\n");
		}
		else if(((a==b) && (b!=c)) || ((b==c) && (a!=c)) || ((a==c) && (b!=c)))
		{
			System.out.print("TRIANGULO ISOSCELES\n");
		}
		
		
	}
	}




