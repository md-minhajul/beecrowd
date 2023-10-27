import java.util.*;


public class Main1051 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		Float n,s,s2,s3,s4,l1=(float) 0.00,li2=(float) 2000.00,li3=(float) 2000.01,li4=(float) 3000.00,li5=(float) 3000.01,li6=(float) 4500.00;
		
		int p =8;
		
		s=k.nextFloat();
		
		if(s>=l1 && s<=li2)
		{
			System.out.print("Isento\n");
		}
		else
		{
			if(s>li2 && s<=li4)
			{
			p= 8;
			s2 = s - li2;
			n = ((s2*p)/100);
		}
		else if(s>=li5 && s<=li6)
		{
			s2= s-li2;
		    s3 = s2 - 1000;
		    s4 = s2-s3;
			s4 = ((s4*8)/100);
			s3 = ((s3*18))/100;
			n=s4+s3;
		}
			else {
				s2 =s-li2;
				s3 = s2-1000;
				s4 = s3 - 1500;
				s2 = s2-s3;
				s3 = s3-s4;
				s2 = ((s2*8)/100);
				s3 = ((s3*18)/100);
				s4 = ((s4*28)/100); 
				n = s2+s3+s4;
			}
			System.out.printf("R$ %.2f\n",n);
		}
		
	}
}


