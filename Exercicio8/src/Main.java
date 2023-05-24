import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(1000);
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            vetor.adiciona(random.nextInt(100));
        }
        vetor.ordenar(vetor);

        int valor = vetor.get(random.nextInt(1000));

        long inicio = System.nanoTime();
        System.out.println("O valor é: "+vetor.pesquisaBinariaIterativa(vetor, valor));
        long fim = System.nanoTime(); 
        System.out.println("Tempo de execução do método iterativo: " + (fim - inicio) + "ns");

        long inicio2 = System.nanoTime();
        System.out.println("O valor é: "+vetor.pesquisaBinariaRecursiva(vetor, 0, 999, valor));
        long fim2 = System.nanoTime();
        System.out.println("Tempo de execução do método recursivo: " + (fim2 - inicio2) + "ns");
    }
}
