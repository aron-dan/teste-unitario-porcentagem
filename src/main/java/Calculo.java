import java.util.Scanner;

public class Calculo {
	Scanner sc = new Scanner(System.in);
	public double calculo() {
		double result = 0;
		System.out.println("Valor do produto");
		
		try {
		double valor  = sc.nextDouble();
		if(valor == 0) {
			System.out.println("Valor digitado inválido");
			System.exit(0);
		}
		valor += valor*.1;
		result= valor;
		
		}
		catch(Exception valor){
			System.out.println("Valor digitado inválido");
		}
		System.out.println(result);
		return result;
		
		
		
	}

}
