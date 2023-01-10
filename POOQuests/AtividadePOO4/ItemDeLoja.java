package AtividadePOO4;

public class ItemDeLoja {
	public int codigoDoItem;
	public String nomeDoItem;
	public String descricaoDoItem;
	public double valorDoItem;
	
	public ItemDeLoja(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem) {
		this.codigoDoItem = codigoDoItem;
		this.nomeDoItem = nomeDoItem;
		this.descricaoDoItem = descricaoDoItem;
		this.valorDoItem = valorDoItem;
	}
	
	public int getIdentificador() {
		return codigoDoItem;
	}
}
