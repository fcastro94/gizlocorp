package lesson;

import java.util.*;

public class bits {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Ingrese numero:");
		int x = scnr.nextInt();
		int digito;
		String binario="";
		do {
			digito=x%2;
			binario+=digito;
			x=x/2;
		} while (x!=0);
		System.out.println("El numero binario es:" + binario);

}
}
