import java.util.*;

public class URI1041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner (System.in);
		Float x,y;
		x = k.nextFloat();
		y = k.nextFloat();
		
		if(x==0.0 && y==0.0)
		{
			System.out.print("Origem\n");
		}
		else if(x==0.0 && y!=0.0)
		{
			System.out.print("Eixo Y\n");
		}
		else if(x!=0.0 && y==0.0)
		{
			System.out.print("Eixo X\n");
		}
		else if(x>0.0 && y>0.0)
		{
			System.out.print("Q1\n");
		}
		else if(x>0.0 && y<0.0)
		{
			System.out.print("Q4\n");
		}
		else if(x<0.0 && y<0.0)
		{
			System.out.print("Q3\n");
		}
		else if(x<0.0 && y>0.0)
		{
			System.out.print("Q2\n");
		}

	}

}
