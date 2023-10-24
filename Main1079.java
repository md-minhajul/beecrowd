import java.util.Scanner;

public class Main1079 {

 public static void main(String[] args) {
  
  int N;
  float v1, v2, v3;
  float ave;
  Scanner k =new Scanner(System.in);
  N = k.nextInt();
  
  for (int i = 1; i <= N; i++) {
   v1 = k.nextFloat();
   v2 = k.nextFloat();
   v3 = k.nextFloat();
   ave = ( v1*2 + v2*3 + v3*5 ) / 10;
   System.out.printf("%.1f\n", ave);
  }
 }

}