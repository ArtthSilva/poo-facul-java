package HerancaQuestoes.questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("vc é gerente ou diretor? tudo em minúsculo pfv");
        String cargo = scan.nextLine();

        if (cargo.equals("gerente")) {
            System.out.println("qual é o seu nome? ");
            String nome = scan.nextLine();
            System.out.println("qual é o seu salário? ");
            double salario = scan2.nextDouble();
            System.out.println("qual é o seu departamento? ");
            String departamento = scan.nextLine();

            Gerente gerente = new Gerente(nome, salario, departamento);
            gerente.calcularBonus();
            System.out.println(gerente);

        }else if(cargo.equals("diretor")){
            System.out.println("qual é o seu nome? ");
            String nome = scan.nextLine();
            System.out.println("qual é o seu salário? ");
            double salario = scan2.nextDouble();
            System.out.println("quantas ações vc tem? ");
            int acoes = scan.nextInt();

            Diretor diretor = new Diretor(nome,salario,acoes);
            System.out.println(diretor);
        }else {
            System.out.println("tu digitou um cargo q não existe");
        }
    }
}
