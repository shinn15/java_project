package sekretong;
import java.util.Scanner;


public class secretiko {
	

	public static void main(String[] args) {
		
Scanner ao = new Scanner(System.in);

System.out.println("Enter a Secret message: ");
String mensahe = ao.nextLine();

String labas = "";
System.out.println("Enter a key (-25 - 25): ");
int sulval = Integer.parseInt(ao.nextLine());
char susi = (char) sulval;
for ( int x = 0; x < mensahe.length(); x++) {
	char pasok = mensahe.charAt(x);
	if (pasok >= 'A' && pasok <= 'Z') {
		pasok += susi;
		if (pasok > 'Z')
			pasok -= 26;
		if (pasok < 'A')
			pasok += 26;
	}
	
	else if (pasok >= 'a' && pasok <= 'z') {
		pasok += susi;
		if (pasok > 'z')
			pasok -= 26;
		if (pasok < 'a')
			pasok += 26;
		
	}
	
	else if (pasok >= '0' && pasok <= '9') {
		pasok += (sulval % 10);
		if (pasok > '9')
			pasok -= 10;
		if (pasok < '0')
			pasok += 10;
	}
	
	labas += pasok;
}

System.out.println(labas);
ao.close();


	}

}
