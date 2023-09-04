package NotasMedia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Aluno aluno = new Aluno();
        double soma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o nome");
        String nome = scanner.nextLine();
        aluno.setNome(nome);

        System.out.println("quantas notas?");
        int qntNotas = scanner.nextInt();

        for (int i = 1; i < qntNotas + 1; i++){
            System.out.println("nota "+i);
            double notas = scanner.nextDouble();
            aluno.setNota(notas);
            soma += aluno.getNota();
        }
        double result = soma / qntNotas;
        if (result >= 7 ){
            System.out.println("aprovado");
        }else if(result < 4){
            System.out.println("reprovado");
        }else{
            System.out.println("final");
        }
        System.out.println("media: "+result+" \naluno: "+aluno.getNome());
    }
}