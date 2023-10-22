import java.util.*;

public class Main1050 {

	public static void main(String[] args) {
		Scanner k = new Scanner (System.in);
		
		LinkedList<String> [][] var = new LinkedList[8][2]; 
		
		/*ArrayList[][] code = new ArrayList[10][10];
		code[0][0] = new ArrayList(); // add another ArrayList object to [0,0]
		code[0][0].add(12);
		code[0][1].add(45);*/
		
		for(int row=0,col=0; row<var.length; row++)
		{
			for(; col<2; col++)
			{
				var[row][col] = new LinkedList();	
			}
			if(col==2){
				col=0;
			}
		}
		
		
		var[0][0].add("61");
		var[0][1].add("Brasilia");
		var[1][0].add("71");
		var[1][1].add("Salvador");
		var[2][0].add("11");
		var[2][1].add("Sao Paulo");
		var[3][0].add("21");
		var[3][1].add("Rio de Janeiro");
		var[4][0].add("32");
		var[4][1].add("Juiz de Fora");
		var[5][0].add("19");
		var[5][1].add("Campinas");
		var[6][0].add("27");
		var[6][1].add("Victoria");
		var[7][0].add("31");
		var[7][1].add("Belo Horizonte");
		
		int codeNumber = k.nextInt();
		
		int temp;
		String city=null;
		
		for(int row=0,col=0; row <var.length; row++)
		{
			temp = Integer.parseInt(var[row][col].peek());
			if(temp==codeNumber)
			{
				city = var[row][col+1].peek();
				break;
			}		
		}
		
		if(city!=null)
		{
			System.out.println(city);
		}
		else {
			System.out.println("DDD nao cadastrado");
		}
	}

}
