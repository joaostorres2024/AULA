package Exercicio3;

public class Fatura {
	private String nomeDoProduto;
	private String descricao;
	private int quantidadeComprada;
	private double precoUnitario;
	private double totalFatura;

	public Fatura(String nomeDoProduto, String descricao, int quantidadeComprada, double precoUnitario) {
		this.nomeDoProduto = nomeDoProduto;
		this.descricao = descricao;
		setQuantidadeComprada(quantidadeComprada);
		setPrecoUnitario(precoUnitario);
	}

	public void faturaTeste() {
		if (precoUnitario < 0) {
			precoUnitario = 0;
		} else {
			System.out.println("Erro no preço");
		}
	}

	public double getTotalFatura() {
		return quantidadeComprada * precoUnitario;
	}

	public void setTotalFatura(double totalFatura) {
		this.totalFatura = totalFatura;
	}

	public Fatura() {

	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = (quantidadeComprada > 0) ? quantidadeComprada : 0;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}


}
