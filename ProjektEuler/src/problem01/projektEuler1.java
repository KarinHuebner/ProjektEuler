package problem01;
/**
 * @author KarinHuebner
 *
 */
public class projektEuler1 {
	
	public static void main (String[] args) {   
		int sum= 0;
		for (int i=3; i< 1000; i++) {
			if (i % 3 ==0)
				sum = sum +	i;
			else if (i % 5 == 0) 
				sum = sum +	i;
		}
	System.out.println("Summe aller Vielfachen = " + sum);
	}
}
