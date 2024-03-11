package problem02;
/**
 * @author KarinHuebner
 *
 *	Jeder neue Term in der Fibonacci-Reihe wird gebildet, indem die beiden vorherigen Zahlen addiert werden. 
 *  Wenn man mit 1 und 2 beginnt, sind die ersten 10 Terme wie folgt:
 *   1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *  Finden Sie die Summe aller geraden Terme der Fibonacci-Reihe, die jeweils 4 Millionen nicht überschreiten.
 */
public class ProjektEuler2 {
	
	public static void main (String[] args) {   
		int precursor= 0;
		int sum = 0;
		int reminder= 0;
		System.out.println(sum);
	   
		for (int follower = 1; follower <= 4000000;follower = precursor + follower) {
		   if (follower % 2 ==0) {
			   sum = sum + follower;
		   }
		   precursor= reminder;		  
		   reminder = follower;		
		    if (follower >= 2000000) {
		    	System.out.println ("f= "+follower + "s= "+ sum);
		    }
		}
		System.out.println("sum= "+ sum);
	}
}