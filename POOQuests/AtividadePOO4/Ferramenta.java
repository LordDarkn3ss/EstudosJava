package AtividadePOO4;

public class Ferramenta extends ItemDeLoja{
	public Ferramenta(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem) {
		super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
	}
	
	public String categoria;
	public int serial;
	
	public int getIdentificador() {
		return serial;
	}
	
	public void separar(String cate) {
		categoria = (cate == null) ? "outros" : cate;
	}
	
	public void separa(String valor) {		
	}
}
