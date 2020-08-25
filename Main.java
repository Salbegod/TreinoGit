import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		
		Catalogo.Veiculos.add(new Onibus("Mercedes", "Mascarello Granvia", 2020, "verde", 250, 250000, "IEF-1234", 6));
		Catalogo.Veiculos.add(new Carro("Chevrolet", "Opala", 1969, "Amarelo", 120.0, 30000, "IJI-1720", 4));
        Catalogo.Veiculos.add(new Carro("Lada", "Niva", 1980, "Preto", 80.0, 11500, "AXX-9632", 4));
        Catalogo.Veiculos.add(new Carro("Volkswagen", "Beetle", 1971, "Azul", 36.0, 12000, "HGH-1165", 4));
        Catalogo.Veiculos.add(new Moto("Honda", "Twister", 2019, "Amarelo", 22.0, 15000, "AMG-4893", 2));
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite '0' para visualizar todos os veiculos, ou digite um preco maximo: ");
			
			int valor = input.nextInt();
			
			if (valor == 0) {
				for (Veiculo e: Catalogo.Veiculos) {
					System.out.println(e);
				}
			} else {
				for (Veiculo e: Catalogo.Veiculos) {
					if (e.getPreco() <= valor) {
						System.out.println(e);
					}
				}					
			}
			
			System.out.println("Digite '0' para sair, ou '1' para visualizar novamente: ");
			
			valor = input.nextInt();
			
			if (valor == 0) {
				break;
			}
		}
		
		
	}
	
	
}