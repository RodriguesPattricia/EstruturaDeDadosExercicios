import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Vetor vetor = new Vetor();
        int[] arraySequential = vetor.generateSequentialArray();
        int[] arrayRandom = vetor.generateRandomArray();
        
        //Bubble Sort
        for (int i = 0; i < 9; i++) {
                System.out.println(arrayRandom[i]);
        }

        System.out.println("Bubble Sort: ");

        int[] arrayBubble = vetor.generateRandomArray();

        long startTime3 = System.nanoTime();
        vetor.bubbleSort(arrayBubble, 0, arrayBubble.length - 1);
        long endTime3 = System.nanoTime();
        long duration3 = (endTime3 - startTime3);


        for (int i = 0; i < 9; i++) {
                System.out.println(arrayBubble[i]);
        }

        System.out.println("Tempo de execução: " + duration3 + " nanosegundos");



        //Selection Sort
        for (int i = 0; i < 9; i++) {
                System.out.println(arrayRandom[i]);
        }

        System.out.println("Selection Sort: ");

        int[] arraySelection = vetor.generateRandomArray();

        long startTime4 = System.nanoTime();
        vetor.selectionSort(arraySelection, 0, arraySelection.length - 1);
        long endTime4 = System.nanoTime();
        long duration4 = (endTime4 - startTime4);

        for (int i = 0; i < 9; i++) {
                System.out.println(arraySelection[i]);
        }

        System.out.println("Tempo de execução: " + duration4 + " nanosegundos");



        //Insertion Sort
        for (int i = 0; i < 9; i++) {
                System.out.println(arrayRandom[i]);
        }

        System.out.println("Insertion Sort: ");

        int[] arrayInsertion = vetor.generateRandomArray();

        long startTime5 = System.nanoTime();
        vetor.insertSort(arrayInsertion, 0, arrayInsertion.length - 1);
        long endTime5 = System.nanoTime();
        long duration5 = (endTime5 - startTime5);

        for (int i = 0; i < 9; i++) {
                System.out.println(arrayInsertion[i]);
        }

        System.out.println("Tempo de execução: " + duration5 + " nanosegundos");



        //Imprimir o mais rápido
        if (Math.min(Math.min(duration3, duration4), duration5) == duration3) {
                System.out.println("O mais rápido é o Bubble Sort");
        }
        else if (Math.min(Math.min(duration3, duration4), duration5) == duration4) {
                System.out.println("O mais rápido é o Selection Sort");
        }
        else {
                System.out.println("O mais rápido é o Insertion Sort");
        }

        input.close();

        }

}