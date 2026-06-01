import alunos.Aluno;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int quantidadeAlunos = 0;
        int quantidadeNotas = 0;

        System.out.println("Digite a quantidade de alunos: ");
        quantidadeAlunos = sc.nextInt();
        System.out.println("Digite a quantidade de provas: ");
        quantidadeNotas = sc.nextInt();

        Aluno[] alunos = new Aluno[quantidadeAlunos];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.next();
            double[] nota = new double[quantidadeNotas];
            alunos[i] = new Aluno(nome, nota);
            for (int j = 0; j < nota.length; j++) {
                System.out.printf("\nDigite a %d nota do aluno %d: ", j + 1, i + 1);
                double valor = sc.nextDouble();
                alunos[i].setNotas(valor, j);
            }
        }

        System.out.println("Iremos processar a media de cada aluno!");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.mediaAluno());
            System.out.println("--------------------");
        }
    }
}


