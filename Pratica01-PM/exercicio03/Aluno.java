package exercicio03;
import java.time.LocalDate;
import java.time.Period;

public class Aluno {

    private String nome;
    private String sobrenome;
    private String casa;
    private LocalDate dataNascimento;
    private String codigoMatricula;

    public Aluno(String nome, String sobrenome, String casa, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.casa = casa;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCasa() {
        return casa;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public int calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public boolean verificarMaioridadeMagica() {
        return calcularIdade() >= 17;
    }

    public String formatarCasa() {
        return casa.toUpperCase();
    }

    public String gerarNomeUsuario() {

        String primeiraLetra = nome.substring(0, 1);
        String sobrenomeMinusculo = sobrenome.toLowerCase();

        return primeiraLetra.toLowerCase() + sobrenomeMinusculo;
    }

    public void gerarCodigoMatricula(int posicao) {

        String iniciais =
                nome.substring(0, 1).toUpperCase()
                + sobrenome.substring(0, 1).toUpperCase();

        int ano = LocalDate.now().getYear();

        codigoMatricula =
                iniciais + "-"
                + ano + "-"
                + String.format("%02d", posicao);
    }

    public boolean verificarCasa(String casaInformada) {
        return casa.equalsIgnoreCase(casaInformada);
    }

    public boolean verificarPalavra(String palavra) {
        return sobrenome.toLowerCase().contains(palavra.toLowerCase());
    }

    public void mostrarDados() {

        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Casa: " + formatarCasa());
        System.out.println("Nascimento: " + dataNascimento);
        System.out.println("Idade: " + calcularIdade());
        System.out.println("Usuário: " + gerarNomeUsuario());
        System.out.println("Matrícula: " + codigoMatricula);
        System.out.println();
    }
}