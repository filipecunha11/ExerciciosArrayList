
public class Produtos {

	float preco; String nome; int quant;
	
	public Produtos(String nome, float preco, int quant)
	{
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	
}
