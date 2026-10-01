package exercicio03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno[] alunos = new Aluno[10];

        int quantidade = 0;
        int opcao;

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {

            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar todos os alunos");
            System.out.println("3 - Exibir alunos de uma casa");
            System.out.println("4 - Exibir alunos por casa");
            System.out.println("5 - Exibir alunos maiores de idade");
            System.out.println("6 - Exibir alunos menores de idade");
            System.out.println("7 - Buscar por sobrenome");
            System.out.println("8 - Encerrar");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                if (quantidade == 10) {
                    System.out.println("Limite de alunos atingido.");
                    continue;
                }

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Sobrenome: ");
                String sobrenome = scanner.nextLine();

                System.out.print("Casa: ");
                String casa = scanner.nextLine();

                System.out.print("Data de nascimento (dd/MM/yyyy): ");
                String data = scanner.nextLine();

                LocalDate nascimento;

                try {
                    nascimento = LocalDate.parse(data, formato);
                } catch (Exception e) {
                    System.out.println("Data inválida.");
                    continue;
                }

                Aluno aluno = new Aluno(
                        nome,
                        sobrenome,
                        casa,
                        nascimento
                );

                quantidade++;

                aluno.gerarCodigoMatricula(quantidade);

                alunos[quantidade - 1] = aluno;

                System.out.println("Aluno cadastrado!");
                System.out.println(
                        "Matrícula: " + aluno.getCodigoMatricula()
                );
            }

            else if (opcao == 2) {

                for (int i = 0; i < quantidade; i++) {
                    alunos[i].mostrarDados();
                }
            }

            else if (opcao == 3) {

                System.out.print("Digite a casa: ");
                String casa = scanner.nextLine();

                int total = 0;

                for (int i = 0; i < quantidade; i++) {

                    if (alunos[i].verificarCasa(casa)) {

                        System.out.println(
                                alunos[i].getNome()
                                + " "
                                + alunos[i].getSobrenome()
                        );

                        total++;
                    }
                }

                System.out.println("Total: " + total);
            }

            else if (opcao == 4) {

                String[] casas = {
                        "Grifinória",
                        "Sonserina",
                        "Corvinal",
                        "Lufa-Lufa"
                };

                for (String casa : casas) {

                    System.out.println("\n" + casa + ":");

                    for (int i = 0; i < quantidade; i++) {

                        if (alunos[i].verificarCasa(casa)) {

                            System.out.println(
                                    alunos[i].getNome()
                                    + " "
                                    + alunos[i].getSobrenome()
                            );
                        }
                    }
                }
            }

            else if (opcao == 5) {

                for (int i = 0; i < quantidade; i++) {

                    if (alunos[i].verificarMaioridadeMagica()) {

                        System.out.println(
                                alunos[i].getNome()
                                + " "
                                + alunos[i].getSobrenome()
                        );
                    }
                }
            }

            else if (opcao == 6) {

                for (int i = 0; i < quantidade; i++) {

                    if (!alunos[i].verificarMaioridadeMagica()) {

                        System.out.println(
                                alunos[i].getNome()
                                + " "
                                + alunos[i].getSobrenome()
                        );
                    }
                }
            }

            else if (opcao == 7) {

                System.out.print("Digite parte do sobrenome: ");
                String palavra = scanner.nextLine();

                for (int i = 0; i < quantidade; i++) {

                    if (alunos[i].verificarPalavra(palavra)) {

                        System.out.println(
                                alunos[i].getNome()
                                + " "
                                + alunos[i].getSobrenome()
                        );
                    }
                }
            }

            else if (opcao == 8) {

                System.out.println("Programa encerrado.");
            }

            else {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 8);

        scanner.close();
    }
}