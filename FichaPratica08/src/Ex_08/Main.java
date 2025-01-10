package Ex_08;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Vitor",25,"Informática",15);
        Aluno aluno2 = new Aluno("Joaquim",30,"Culinária",5);

        System.out.println(aluno2.situacao());
    }
}
