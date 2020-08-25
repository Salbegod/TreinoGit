public class MotorHome extends Catalogo implements Veiculo {

	public MotorHome (String marca, String modelo, int ano, String cor, double motor, int preco, String placa, int numRodas) {
		super.marca = marca;
		super.modelo = modelo;
		super.ano = ano;
		super.cor = cor;
		super.motor = motor;
		super.preco = preco;
		super.placa = placa;
		super.numRodas = numRodas;
	}
	
	@Override
	public String getMarca() {
		return marca;
	}
	
	@Override
	public String getModelo() {
		return modelo;
	}
	
	@Override
	public int getAno() {
		return ano;
	}
	
	@Override
	public String getCor() {
		return cor;
	}
	
	@Override
	public double getMotor() {
		return motor;
	}
	
	@Override
	public int getPreco() {
		return preco;
	}
	
	@Override
	public String getPlaca() {
		return placa;
	}
	
	@Override
	public int getNumRodas() {
		return numRodas;
	}
}