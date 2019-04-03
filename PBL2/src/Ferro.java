public class Ferro extends Eletrodomestico{
    public Ferro(String marca, double preco, int voltagem){
        this.marca = marca;
        this.preco = preco;
        this.voltagem = voltagem;
        this.precoFinal = preco;
    }
    
    public Ferro(String marca, int voltagem){
        this.marca = marca;
        this.voltagem = voltagem;
    }
    
    @Override
    public void setDesconto(String mes) {
        if(mes.equalsIgnoreCase("Maio")){
            desconto = (15*preco)/100;
            setPrecoFinal();
        }
    } 
}
