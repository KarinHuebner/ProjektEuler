package problem04;

public class Problem4 {
	//array für die Ziffern des Ergebnisses, um auf Palindrom zu prüfen
	int[] newP = new int [] {0,0,0,0,0,0};
	int biggestPalindrome = 0;
	int ergebnis = 0;
	int reminder = 0;
	
	public void rechne() {
		for (int i = 999; i>=100; i--) {
			for (int j = 999; j>=i; j--) {
				ergebnis = i*j;
				changeToArray(ergebnis);
			}
		}
		System.out.println ("Ergebnis: " + biggestPalindrome);
	}

	public void changeToArray (int neu){
		newP[0] = neu / 100000;
		reminder = neu % 100000;
		newP[1] = reminder /10000;
		reminder = reminder % 10000; 
		newP[2] = reminder /1000;
		reminder = reminder % 1000;
		newP[3] = reminder /100;
		reminder = reminder % 100;
		newP[4] = reminder /10;
		reminder = reminder % 10;
		newP[5] = reminder;
		palindromeCheck (neu);
	}
	
	public void palindromeCheck (int neu) {
		if (newP[0]==0) {	//5stellig
			if (newP[1] == newP[5])
				if (newP[2] == newP[4])
					comparePalindromes (neu);
		} else {  		//sechsstellig
			if (newP [0] ==  newP[5]) 
				if (newP[1]==newP[4])
					if (newP[2] == newP[3]) 
						comparePalindromes (neu);
		}
	}

	public void comparePalindromes (int neu) {
		//Rechenergebnis vs. bisher gr. Palindrom
		if (neu > biggestPalindrome) {
			biggestPalindrome = neu;
		}
	}
}