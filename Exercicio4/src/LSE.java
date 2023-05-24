public class LSE implements Lista {
    private Noh inicio;
    private static int cont;
    
    public LSE (){
        this.inicio = null;
    }

    public void insereInicio(Aluno aluno) {
        Noh novo = new Noh(aluno);
        if (inicio == null){
            inicio = novo;
            cont++;
        } else {
            novo.setProximo(inicio);
            inicio = novo;
            cont++;
        }
    }

    public void insereFim(Aluno aluno) {
        Noh novo = new Noh(aluno);
        if (inicio == null){
            inicio = novo;
            cont++;
        } else {
            for(Noh i=inicio; i != null; i=i.getProximo()) {
                i.setProximo(novo);
                cont++;
            }
        }

    }
    public boolean vazia() {
        if (inicio == null) {
            return true;
        } else return false;
    }

    public boolean remove(Aluno aluno) {
        Noh ant = null;
        Noh p = inicio;
        while (p!=null && p.getInfo() != aluno){ 
            ant = p;
            p = p.getProximo();
        }
        if (p==null) {
            return false;
        }
        if (ant==null) {
            inicio = p.getProximo();
            cont--;
        } else {
            ant.setProximo(p.getProximo());
            cont--;
        }
        return true;
    }

    public int tamanho() { return cont; }

    public String toString(){
        for(Noh i=inicio; i != null; i=i.getProximo()){
            System.out.println(i);
        }
        return null;
    }
}