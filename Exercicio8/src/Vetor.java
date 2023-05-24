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

    public void set(int i, int num){
        this.numeros[i] = num;
    }

    public void ordenar(Vetor vetor) {
        for (int i = 0; i < vetor.tamanho(); i++) {
            int indiceDoMenor = i;
            for (int j = i + 1; j < vetor.tamanho(); j++) {
                if (vetor.get(j) < vetor.get(indiceDoMenor)) {
                    indiceDoMenor = j;
                }
            }
            if (indiceDoMenor != i) {
                int temp = vetor.get(i);
                vetor.set(i, vetor.get(indiceDoMenor));
                vetor.set(indiceDoMenor, temp);
            }
        }
    }

    public int pesquisaBinariaIterativa(Vetor vetor, int valor) {
        int inicio = 0;
        int fim = vetor.tamanho() - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (vetor.get(meio) == valor) {
                return meio;
            } else if (vetor.get(meio) < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public int pesquisaBinariaRecursiva(Vetor vetor, int inicio, int fim, int valor) {
        if (inicio > fim) {
            return -1;
        }
        int meio = (inicio + fim) / 2;
        if (vetor.get(meio) == valor) {
            return meio;
        } else if (vetor.get(meio) < valor) {
            return pesquisaBinariaRecursiva(vetor, meio + 1, fim, valor);
        } else {
            return pesquisaBinariaRecursiva(vetor, inicio, meio - 1, valor);
        }
    }
}
