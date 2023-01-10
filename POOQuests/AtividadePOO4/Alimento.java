package AtividadePOO4;

public class Alimento extends ItemDeLoja{
	public Alimento(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem) {
		super(codigoDoItem, nomeDoItem, descricaoDoItem, valorDoItem);
	}
	public int selo;

	public int getIdentificador() {
		return selo;
	}
	
}
