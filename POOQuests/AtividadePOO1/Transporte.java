package AtividadePOO1;

public class Transporte {
	private int id;
	private int ano;
	private String modelo;
	private double carga_maxima;
	private double potencia;
	
	public Transporte(){
		
	}
	
	public Transporte(int id, int ano, String modelo, double carga_maxima, double potencia){
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
		this.potencia = potencia;
	}
	
	public double Consumo() {
		return this.potencia * this.carga_maxima * 100;
	}
	
	public String leiaModelo() {
		return this.modelo;
	}
	
	public void gravaModelo(String modelo_name) {
		this.modelo = modelo_name;
	}
	
}

