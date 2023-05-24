public class Noh {
    private Aluno aluno; 
    private Noh proximo;

    public Noh (Aluno aluno){
        this.aluno = aluno;
        this.proximo = null;
    }

    public Aluno getInfo() { return this.aluno; }

    public Noh getProximo() { return this.proximo; }

    public void setProximo(Noh n){ this.proximo = n; }
    
}