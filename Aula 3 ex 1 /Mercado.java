public class Mercado {

    private String nomeProduto;
    private double preco;
    private int qtde;

    public Mercado(String nomeProduto, double preco, int qtde) {
        super();
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.qtde = qtde;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }


}
