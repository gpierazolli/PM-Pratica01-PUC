package exercicio02;

public class Aluno {
    private String nome, casa;
    private int idade, coragem, inteligencia, ambicao, lealdade;
    public int grifinolia, sonserina, corvinal, lufalufa;

    public Aluno(String nome, int idade, int coragem, int inteligencia, int ambicao, int lealdade){
        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
    } 

    public void setCasa(String casa){
        this.casa = casa;
    }
    public String getCasa(){
        return casa;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Casa: " + casa);
    }

    public void calcularCasa(){
        grifinolia = (2 * coragem) + lealdade;
        sonserina = (2 * ambicao) + inteligencia;
        corvinal = (2 * inteligencia) + ambicao;
        lufalufa = (2 * lealdade) + coragem;

        if (grifinolia > sonserina && grifinolia > corvinal && grifinolia > lufalufa){
            setCasa("Grifinolia");
        }
        else if (sonserina > grifinolia && sonserina > corvinal && sonserina > lufalufa){
            setCasa("Sonserina");
        }
        else if (corvinal > grifinolia && corvinal > sonserina && corvinal > lufalufa){
            setCasa("Corvinal");
        }
        else {
            setCasa("Lufa-Lufa");
        }

    }
}