package HerancaQuestoes.questao2;

public class Gerente extends Funcionario{
    final String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public void calcularBonus( ){
         double aumento = salario * 0.1;
         salario += aumento;

    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
