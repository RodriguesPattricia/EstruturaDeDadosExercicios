public interface ILista {
    public void insereInicio(int info);
    public void insereFim(int info);
    public int getInicio();
    public int getFim();
    public boolean vazio();
    public boolean contem(int info);
    public boolean remove(int info);
    public int tamanho();
    public void toStringFim();
    public void toStringInicio();
    }
