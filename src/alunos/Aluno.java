package alunos;

public class Aluno {

    private String nome;
    private double [] notas;

    public Aluno(String nome,  double [] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public String getNome() {
        return nome;
    }
    public void setNomeAluno(String nome){
        this.nome = nome;
    }

    public void setNotas(double nota, int indice) throws Exception {
        if(nota >= 0.00 && nota <= 10.00){
            this.notas[indice] = nota;
        }
        else{
            throw new Exception("Nota invalida");
        }
    }


    public double mediaAluno(){
        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        return media/this.notas.length;
    }
}
