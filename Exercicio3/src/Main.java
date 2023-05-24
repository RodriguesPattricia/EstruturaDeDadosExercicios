public class Main {
    public static void main(String[] args){

        Vetor vetAlunos = new Vetor(2);

        Aluno aluno1 = new Aluno("joao", 15, 5.2);
        Aluno aluno2 = new Aluno("maria", 16, 9.9);
        Aluno aluno3 = new Aluno("ana", 16, 6.2);
        Aluno aluno4 = new Aluno("antonio", 17, 5.0);

        vetAlunos.adiciona(aluno1);
        vetAlunos.adiciona(aluno2);
        vetAlunos.adiciona(aluno3);
        vetAlunos.adiciona(aluno4);

        System.out.println(vetAlunos.tamanho());

        if(vetAlunos.remove(aluno2) == true){
            System.out.println("Aluno excluído!");
        }

        System.out.println(vetAlunos.tamanho());

        System.out.println(vetAlunos.contem(aluno1));
        System.out.println(vetAlunos.contem(aluno2));
    }
}