public class Vetor {
    private int total = 0;
    public int numeros[];

    public Vetor(int tamanho) {
        numeros = new int[tamanho];
    }

    public void adiciona(int num) {
        this.numeros[total] = num;
        total++;
    }

    public int tamanho() {
        return this.total;
    }

    public boolean contem(int num) {
        for (int i = 0; i < this.total; i++) {
            if (this.numeros[i] == (num)) {
                return true;
            }
        }
        return false;
    }

    public int get(int i){
        return numeros[i];
    }

    public int encontraMaiorRecursivo(Vetor vetor, int inicio, int fim) {
        if (inicio == fim) { 
            return numeros[inicio];
        } else {
            int meio = (int ) (inicio + fim) / 2;
            int maiorEsquerda = encontraMaiorRecursivo(vetor, inicio, meio);
            int maiorDireita = encontraMaiorRecursivo(vetor, meio + 1, fim);
            return Math.max(maiorEsquerda, maiorDireita);
        }
    }

    public int encontraMaiorIterativo(Vetor vetor) {
        int maior = numeros[0]; 
        for (int i = 1; i < vetor.tamanho(); i++) {
            if (vetor.get(i) > maior) { 
                maior = vetor.get(i); 
            }
        }
        return maior; 
    }
}
