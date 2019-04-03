public class Liquidificador extends Eletrodomestico{
    private Tampa tampa;
    private int capacidade;
    private int quantidadeLitros;
    private int litrosPorSegundo;

    public Liquidificador(String marca, double preco, int voltagem){
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
        this.precoFinal = preco;
    }
    
    public Liquidificador(String marca, int voltagem){
        this.marca = marca;
        this.voltagem = voltagem;
    }
    
    @Override
    public void setDesconto(String mes) {
        if(mes.equalsIgnoreCase("Agosto")){
            desconto = (10*preco)/100;
            setPrecoFinal();
        }
    }
    
    public void setLitrosPorSegundo(){
        litrosPorSegundo = capacidade*quantidadeLitros;
    }

    public Tampa getTampa() {
        return tampa;
    }

    public void setTampa(Tampa tampa) {
        this.tampa = tampa;
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