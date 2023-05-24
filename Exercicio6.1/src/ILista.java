public interface ILista {
    public void insereInicio(Object info);
    public void insereFim(Object info);
    public Object getInicio();
    public Object getFim();
    public boolean vazio();
    public boolean contem(Object info);
    public boolean remove(Object info);
    public int tamanho();
    public void toStringFim();
    public void toStringInicio();
    }
