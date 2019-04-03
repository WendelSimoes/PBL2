public abstract class Eletrodomestico {
    protected String marca;
    protected double preco;
    protected int voltagem;
    protected double desconto;
    protected double precoFinal;

    public abstract void setDesconto(String mes);
    
    public void setPrecoFinal(){
        precoFinal = preco - desconto;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getDesconto() {
        return desconto;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = preco - desconto;
    }
}
