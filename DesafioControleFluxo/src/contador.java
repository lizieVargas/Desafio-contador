import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class contador {

	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o Segundo número");
		int parametroDois = scanner.nextInt();
		
		try {
			
		 contar(parametroUm, parametroDois);
				
		}catch (InputMismatchException e) {
			System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if(parametroDois < parametroUm)
			throw new ParametrosInvalidosException();
			
			int contagem = parametroDois - parametroUm;
			
			for(int cont = parametroUm; cont <=parametroDois; cont++ ) {
				System.out.println("Contador " + cont);
		
	}
			

	}
	}


