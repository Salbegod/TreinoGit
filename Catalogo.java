import java.util.ArrayList;
import java.util.List;

public class Catalogo {

	private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private double motor;
    private int preco;
    private String placa;
    private int numRodas;
    public static List<Veiculo> Veiculos = new ArrayList<>();

    @Override
    public String toString() {

        return this.marca + " " + this.modelo + " " + this.ano + " " + this.cor + " " + this.motor + " " + this.preco + " " + this.placa + " " + this.numRodas;
    }
}