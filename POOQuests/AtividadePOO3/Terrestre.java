package AtividadePOO3;

public class Terrestre extends MeioDeTransporte{
	public Terrestre(int id, short ano, String modelo, double carga_maxima) {
		super(id, ano, modelo, carga_maxima);
	}
	private int qtdeRoda;
	private double potencia;
	
	public double consumo() {
		return potencia * carga_maxima * 100; 
	}
	

}
