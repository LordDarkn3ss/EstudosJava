package AtividadePOO3;

public class MeioDeTransporte {
	public int id;
	public short ano;
	public String modelo;
	public double carga_maxima;
	
	public MeioDeTransporte(int id, short ano, String modelo, double carga_maxima) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
	}
	
	public double consumo() {
		return 0;
	}
}
