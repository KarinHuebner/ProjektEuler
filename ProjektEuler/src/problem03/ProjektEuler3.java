package problem03;
/**
 * @author KarinHuebner
 *
 *Primfaktorzerlegung: 
 *Die Primfaktoren von 13195 sind 5, 7, 13 und 29.
 *Was ist der größte Primfaktor der Zahl 600851475143?
 */
public class ProjektEuler3 {

	public static void main(String[] args) {
		long zahl = 600851475143L ;	
		long primfaktor = 1L;
		long zz= zahl;
		System.out.println ("Der groesste Primfaktor der Zahl "+
			zahl+" ist "+ zahlZerlegung (zz,primfaktor));
	}

	public static boolean primzahlPruefung(long i) {
		for (long teiler = i/2; teiler>1; teiler--) {
			if (i % teiler == 0) {
				return false;
			}
		}	
		return true;
	}

	public static long zahlZerlegung (long zerlegung, long pf) {
		if  (zerlegung <= 2L) {
			return pf;
		} else {
			for (long i=2L; i<= zerlegung/2; i++) {
				if (primzahlPruefung (i) == true) {
					if (zerlegung % i == 0) {
						if (i > pf) {
							pf = i;
						}	
						zerlegung = zerlegung/i;
						return zahlZerlegung (zerlegung, pf);
					}
				}
			}
			if (pf< zerlegung) {
				pf = zerlegung;
			}
			return pf;
		}
	}
}