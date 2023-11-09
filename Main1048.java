
import java.text.DecimalFormat;
import java.util.*;
public class Main1048 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#.##");
		//float twoDigitsF = Float.valueOf(df.format(f));
		
		Float ex; int p;
		
		Float salary = k.nextFloat();
		
		salary = Float.valueOf(df.format(salary));
				
	
		
		if(salary>=0.00 && salary<=400.00 )
		{
			p=15;
			Float ns = (float) (salary+(salary*p/100.00));
			ns = Float.valueOf(df.format(ns));
			ex = (float) (salary*p/100.00);
			System.out.printf("Novo salario: %.2f\n",ns);
			System.out.printf("Reajuste ganho: %.2f\n",ex);
			System.out.print("Em percentual: "+p+" %\n");
		}
		else if(salary>=400.01 && salary<=800.00)
		{
			p=12;
			Float ns = (float) (salary+(salary*p/100.00));
			ns = Float.valueOf(df.format(ns));
			ex = (float) (salary*p/100.00);
			System.out.printf("Novo salario: %.2f\n",ns);
			System.out.printf("Reajuste ganho: %.2f",ex);
			System.out.print("Em percentual: "+p+" %\n");			
		}
		else if(800.01<=salary && salary <=1200.00)
		{
			p=10;
			Float ns = (float) (salary+(salary*p/100.00));
			ns = Float.valueOf(df.format(ns));
			ex = (float) (salary*p/100.00);
			System.out.printf("Novo salario: %.2f\n",ns);
			//ns = Float.valueOf(df.format(S));
			System.out.printf("Reajuste ganho: %.2f\n",ex);
			System.out.print("Em percentual: "+p+" %\n");	
		}
		else if(1200.01<=salary && salary <=2000.00)
		{
			p=7;
			Float ns = (float) (salary+(salary*p/100.00));
			ns = Float.valueOf(df.format(ns));
			ex = (float) (salary*p/100.00);
			System.out.printf("Novo salario: %.2f\n",ns);
			System.out.printf("Reajuste ganho: %.2f\n",ex);
			System.out.print("Em percentual: "+p+" %\n");	
		}
		else if(salary >2000.00)
		{
			p=4;
			Float ns = (float) (salary+(salary*p/100.00));
			ns = Float.valueOf(df.format(ns));
			ex = (float) (salary*p/100.00);
			System.out.printf("Novo salario: %.2f\n",ns);
			System.out.printf("Reajuste ganho: %.2f\n",ex);
			System.out.print("Em percentual: "+p+" %\n");	
		}
		
	}

}


