package lab.exercicio.casa;

public class Casa {
    private double preco;
    private int quartos;

    public double calcularPreco(int tamanho){
        return preco = tamanho * 1000;
    }

    public double calcularPreco(int tamanho, int quartos){
        preco = calcularPreco(tamanho);
        return preco = preco * quartos;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }
}
