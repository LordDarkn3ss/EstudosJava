package AtividadePOO2;

import java.util.Date;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private Date validade;
	
	public Produto(int id, String nome, String descricao, Date validade) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.validade = validade;
	}
	
	public int getCod() {
		return this.id;
	}
	
}
