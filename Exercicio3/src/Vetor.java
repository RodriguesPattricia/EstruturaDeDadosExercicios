public class Vetor implements IVetor{
    
    private int totalAlunos = 0;
    public Aluno alunos[];

    public Vetor(int tamanho){
        alunos = new Aluno[tamanho];
    }

    public void adiciona(Aluno aluno){
        this.garanteEspaco();
        this.alunos[totalAlunos] = aluno;
        totalAlunos++;
        
    }

    public int tamanho(){
        return this.totalAlunos;
    }

    public boolean contem(Aluno aluno){
        for(int i = 0; i<this.totalAlunos; i++){
            if(this.alunos[i].equals(aluno)){
                return true;
            }
        }
        return false;
    }

    public boolean verificarCheio(){
        if (totalAlunos == this.alunos.length)
            return true;
        return false;
    }

    private void garanteEspaco(){
        if (this.verificarCheio()){
            Aluno[] novoAlunos = new Aluno[this.alunos.length * 2];
            for (int i=0; i < this.alunos.length; i++){
                novoAlunos[i] = this.alunos[i];
            }
            this.alunos = novoAlunos;
        }
    }

    public boolean remove(Aluno aluno){
        int indice = -1;
        for(int i=0; i < totalAlunos; i++){ 
            if (aluno == this.alunos[i]){
                indice = i; 
                break; 
            }
        }
        if (indice != -1){ 
            for(int i=indice; i<(totalAlunos-1); i++){
                alunos[i] = alunos[i+1];
            }
            totalAlunos--;
            return true;
        }
        return false;
        }
        
}