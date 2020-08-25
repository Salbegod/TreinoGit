/**
 * O objetivo deste exercicio e praticar a colaboração em um projeto fechado com equipe pequena.
 * Cada equipe, de 2 a 4 integrantes devera desenvolver um catalogo de veiculos a venda.
 * O sistema e formado, basicamente pelas classes "Catalogo", pela interface "Veiculo" (e suas implementacoes)
 * e pela classe que contém a interface com o usuario (pode ser texto) e o metodo main.
 *
 *
 * @author Miguel zanela,
 *
 * version 24 Ago 2020
 */
import java.util.Scanner;
public class App {
    public static void main(String args[]){

        Catalogo.veiculos.add(new Carro("VM", "gol", 1995, 2, 1546165156, 1551.24156));
        Catalogo.veiculos.add(new Moto("honda", "cg", 1995, 2, 1546165156, 1551.24156));
        Catalogo.veiculos.add(new Suv("Jeep", "Renegade", 1995, 2, 1546165156, 1551.24156));
        Catalogo.veiculos.add(new Suv("VM", "saveiro", 1995, 2, 1546165156, 1551.24156));

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n\n### Veículos ###");
            System.out.println("\n                  =========================");
            System.out.println("                  |     1 - Todos");
            System.out.println("                  |     2 - Caminhonete");
            System.out.println("                  |     3 - Carro");
            System.out.println("                  |     4 - Moto");
            System.out.println("                  |     5 - Suv");
            System.out.println("                  |     0 - Sair");
            System.out.println("                  =========================\n");

            opcao = sc.nextInt();
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    System.out.println("Todos");
                    for(Veiculo it: Catalogo.veiculos){
                        System.out.println(it);
                    }
                    break;
                case 2:
                    System.out.println("Caminhonete:");
                    for(Veiculo it: Catalogo.veiculos){
                        String className = it.getClass().getSimpleName();
                        if(className=="Caminhonete"){
                            System.out.println(it);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Carros:");
                    for(Veiculo it: Catalogo.veiculos){
                        String className = it.getClass().getSimpleName();
                        if(className=="Carro"){
                            System.out.println(it);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Moto:");
                    for(Veiculo it: Catalogo.veiculos){
                        String className = it.getClass().getSimpleName();
                        if(className=="Moto"){
                            System.out.println(it);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Suv:");
                    for(Veiculo it: Catalogo.veiculos){
                        String className = it.getClass().getSimpleName();
                        if(className=="Suv"){
                            System.out.println(it);
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
        /*for(Veiculo it: Catalogo.veiculos){

            String className = it.getClass().getSimpleName();
            System.out.println(className+"/"+it);
        }*/
    }
}