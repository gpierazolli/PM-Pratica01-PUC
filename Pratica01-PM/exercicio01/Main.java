package exercicio01;

public class Main{
    public static void main (String [] args){
        Pessoa pessoa01 = new Pessoa("Gabi", "Pinheiro", 19, 1.60, 50);
        System.out.println(pessoa01.CalcularIMC());
        pessoa01.InformaObesidade();
    }
}