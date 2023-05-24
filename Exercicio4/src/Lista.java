public interface Lista {
    public void insereInicio(Aluno info);
    public void insereFim(Aluno info);
    public boolean vazia();
    public boolean remove(Aluno info);
    public int tamanho();
    public String toString();
}