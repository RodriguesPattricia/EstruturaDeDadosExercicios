public class LDE implements ILista {
    private Noh inicio;
    private Noh fim;
    
    public LDE (){
        this.inicio = null;
        this.fim = null;
    }
    
    public void insereInicio(int info) {
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
    
    public void insereFim(int info) {
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
    
    public boolean remove(int info) {
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

    public int getInicio() {
        return inicio.getInfo();
    }

    public int getFim() {
        return fim.getInfo();
    }

    public boolean contem(int info) {
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
        Noh p = inicio;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getProx();
        }
    }

    public void toStringFim() {
        Noh p = fim;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getAnt();
        }
    }
}