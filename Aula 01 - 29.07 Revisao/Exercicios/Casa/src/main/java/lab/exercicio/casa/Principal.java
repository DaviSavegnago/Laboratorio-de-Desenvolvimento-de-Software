package lab.exercicio.casa;

public class Principal {
    public static void main(String[] args) {
        Casa casinha = new Casa();

        casinha.calcularPreco(45);
        System.out.println("Casa comum: " + casinha.getPreco());
        casinha.calcularPreco(45,4);
        System.out.println(casinha.getPreco());
    }
}
