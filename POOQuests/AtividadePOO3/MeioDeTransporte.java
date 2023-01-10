package AtividadePOO3;

public class MeioDeTransporte {
	private int id;
	private short ano;
	private String modelo;
	private double carga_maxima;
	
	public MeioDeTransporte(int id, short ano, String modelo, double carga_maxima) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
	}
	
	public void consumo() {
	}
}
