import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(1000);
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            vetor.adiciona(random.nextInt(100));
        }

        long inicio = System.nanoTime();
        System.out.println("Maior valor: " + vetor.encontraMaiorRecursivo(vetor, 0, 999));
        long fim = System.nanoTime(); 

        System.out.println("Tempo de execução do método recursivo: " + (fim - inicio) + "ns");

        long inicio2 = System.nanoTime();
        System.out.println("Maior valor: "+vetor.encontraMaiorIterativo(vetor));
        long fim2 = System.nanoTime();

        System.out.println("Tempo de execução do método iterativo: " + (fim2 - inicio2) + "ns");
    }
}