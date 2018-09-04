import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] series = new int[30];
		series[0]=1;
		series[1]=1;
		
		for(int i=1, index=2;index<30;i++)
		{
		    series[index++] = (int)Math.pow(2,i);
		    series[index++] = (int)Math.pow(3,i);
		}
		
        System.out.println(series[n-1]);
	}
}
