package exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Deseja cadastrar um aluno? (s/n)");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                System.out.println("Fim");
                break;
            }

            System.out.println("Digite o nome do aluno:");
            String nome = sc.nextLine();

            System.out.println("Digite a idade:");
            int idade = sc.nextInt();

            System.out.println("Digite a coragem:");
            int coragem = sc.nextInt();

            System.out.println("Digite a inteligencia:");
            int inteligencia = sc.nextInt();

            System.out.println("Digite a ambicao:");
            int ambicao = sc.nextInt();

            System.out.println("Digite a lealdade:");
            int lealdade = sc.nextInt();

            sc.nextLine();

            Aluno aluno = new Aluno(nome, idade, coragem, inteligencia, ambicao, lealdade);

            aluno.calcularCasa();

            aluno.exibirInformacoes();
        }

        sc.close();

    }
}
