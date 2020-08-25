import java.util.ArrayList;
import java.util.List;

public class Catalogo {

	public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public double motor;
    public int preco;
    public String placa;
    public int numRodas;
    public static List<Veiculo> Veiculos = new ArrayList<>();

    @Override
    public String toString() {

        return this.marca + " " + this.modelo + " " + this.ano + " " + this.cor + " " + this.motor + " " + this.preco + " " + this.placa + " " + this.numRodas;
    }
}