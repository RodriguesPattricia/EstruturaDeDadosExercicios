public class LDE implements ILista {
    private Noh inicio;
    private Noh fim;
    
    public LDE (){
        this.inicio = null;
        this.fim = null;
    }
    
    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        
        if (inicio == null){
            inicio = novo;
            fim = novo;
        }
        else {
            novo.setProx(inicio);
            inicio.setAnt(novo);
            inicio = novo;
        }
    }
    
    public void insereFim(Object info) {
        Noh novo = new Noh(info);
       
        
        if (inicio == null){
            inicio = novo;
            fim = novo;
        }
        else {
           novo.setAnt(fim);
           fim.setProx(novo);
           fim = novo;
        }
    }
    
    public boolean vazio() {
        if(inicio == null | fim == null)
            return true;
        else
            return false;
    }
    
    public boolean remove(Object info) {
        Noh p = inicio;
        while (p!=null && p.getInfo() != info)
            p = p.getProx();
        if (p==null)
            return false;   
        if (p == inicio){ 
            inicio = p.getProx();
            if (inicio != null) 
                inicio.setAnt(null);
            else fim = null;
        } else if (p.getProx() == null){ 
            p.getAnt().setProx(null);
            fim = p.getAnt();
        } else { 
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }   
        return true;
    }
    
    public int tamanho() {
        int tamanho = 0;
        Noh p = inicio;

        while (p != null) {
            tamanho++;
            p = p.getProx();
        }
        return tamanho;
    }

    public Object getInicio() {
        return inicio.getInfo();
    }

    public Object getFim() {
        return fim.getInfo();
    }

    public boolean contem(Object info) {
        Noh p = inicio;
        while (p != null) {
            if (p.getInfo() == info) {
                return true;
            }
            p = p.getProx();
        }
        return false;
    }

    public void toStringInicio() {
        for (Noh p = inicio; p != null; p = p.getProx()){
            System.out.println(p.getInfo());
        }
    }

    public void toStringFim() {
        for (Noh p = fim; p != null; p = p.getAnt()){
            System.out.println(p.getInfo());
        }
    }
}