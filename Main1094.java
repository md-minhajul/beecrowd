import java.util.*;

public class Main1094 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		Object [][] sub;
		
		int testCase, anm; char ch;
		
		//System.out.print(sub.length);
		
		testCase = k.nextInt();
		sub = new Object[testCase][2];
		
		for(int row=0,col=0; row<sub.length; row++)
		{
			anm = k.nextInt();
			if(1<=anm && anm<=15)
			{
				ch = k.next().charAt(0);
				sub[row][col] = ch;
				sub[row][col+1] = anm;
			}
			else {
				row--;
			}		
		}
		
		char c1 = 'c',c2='r',c3='s';
		
		int sumC = 0,sumR = 0,sumS = 0;
		
		for(int row=0,col=0;row<sub.length; row++)
		{
			if((Character.toLowerCase((char) sub[row][col])) == c1)
			{
				sumC = sumC+(int)sub[row][col+1];
			}
			else if((Character.toLowerCase((char) sub[row][col])) == c2)
			{
				sumR = sumR+(int)sub[row][col+1];
			}
			else if ((Character.toLowerCase((char) sub[row][col])) == c3)
			{
				sumS = sumS+(int)sub[row][col+1];
			}
		}
		
		float cP = (float) ((sumC*100.00)/(sumC+sumR+sumS));
		float rP = (float) ((sumR*100.00)/(sumC+sumR+sumS));
		float sP = (float) ((sumS*100.00)/(sumC+sumR+sumS));
		
		System.out.print("Total: "+(sumC+sumR+sumS)+" cobaias\n"+"Total de coelhos: "+sumC+"\n"+"Total de ratos: "+sumR+"\n"+"Total de sapos: "+sumS+"\n");
		System.out.printf("Percentual de coelhos: %.2f",cP);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f",rP);
		System.out.print(" %\n");
	    System.out.printf("Percentual de sapos: %.2f",sP);
	    System.out.print(" %\n");

	}

}
