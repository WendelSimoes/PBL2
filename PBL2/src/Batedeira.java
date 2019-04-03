public class Batedeira extends Eletrodomestico{
    private int qtdHelices;
    private int capacidade;
    private int quantidadeLitros;
    private int litrosPorSegundo;

    public Batedeira(String marca, double preco, int voltagem){
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
        this.precoFinal = preco;
    }
    
    public Batedeira(String marca, int voltagem){
        this.marca = marca;
        this.voltagem = voltagem;
    }
    
    @Override
    public void setDesconto(String mes) {
        if(mes.equalsIgnoreCase("Dezembro")){
            desconto = (20*preco)/100;
            setPrecoFinal();
        }
    }
    
    public void setLitrosPorSegundo(){
        litrosPorSegundo = qtdHelices*capacidade*quantidadeLitros;
    }

    public int getQtdHelices() {
        return qtdHelices;
    }

    public void setQtdHelices(int qtdHelices) {
        this.qtdHelices = qtdHelices;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadeLitros() {
        return quantidadeLitros;
    }

    public void setQuantidadeLitros(int quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }

    public int getLitrosPorSegundo() {
        return litrosPorSegundo;
    }
}