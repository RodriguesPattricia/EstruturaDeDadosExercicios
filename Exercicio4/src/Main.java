public class Main {
    public static void main(String[] args){
        Lista lista = new LSE();

        Aluno a1 = new Aluno("Ana", 16, 7.5);
        Aluno a2 = new Aluno("João", 15, 6.8);
        Aluno a3 = new Aluno("Maria", 17, 9.1);

        lista.insereInicio(a1);
        lista.insereInicio(a2);
        lista.insereFim(a3);

        lista.toString();

        lista.remove(a2);

        lista.toString();
    }
}