import java.util.*;

public class Main1046 {

	public static void main(String[] args) {
		Scanner k = new Scanner (System.in);
		int start , end, left = 0;
		
		start = k.nextInt();
		end = k.nextInt();
		
		
	    if(start<=12 && end>=12)
		{
		    start = 12-start;
		    end = end-12;
		    left = start+end;
			System.out.print("O JOGO DUROU "+left+" HORA(S)\n");
		}
		else if(end<=12 && start>=12)
		{
			start = start-12;
			end = 12-end;
			left = 24- (start+end);
			System.out.print("O JOGO DUROU "+left+" HORA(S)\n");
		}
		else {
			left =24;
			System.out.print("O JOGO DUROU "+left+" HORA(S)\n");
		}
	}
}
