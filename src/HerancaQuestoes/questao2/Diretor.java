package HerancaQuestoes.questao2;

public class Diretor extends Funcionario{
    final int acoes;
    public Diretor(String nome, double salario, int acoes) {
        super(nome, salario);
        this.acoes = acoes;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "acoes=" + acoes +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
