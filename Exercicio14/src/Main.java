public class Main {
    public static void main(String[] args) {

        BuscaBinaria minhaArvore = new BuscaBinaria(); 

        minhaArvore.recursiveAdd(20);
        minhaArvore.recursiveAdd(10);
        minhaArvore.recursiveAdd(30);
        minhaArvore.recursiveAdd(5);
        minhaArvore.recursiveAdd(15);
        minhaArvore.recursiveAdd(25);
        minhaArvore.recursiveAdd(35);
        

        minhaArvore.buscar(minhaArvore.getRaiz(), 20); 

        System.out.println("Imprimindo a minhaArvore: "); 
        minhaArvore.printTodaArvore(minhaArvore.getRaiz()); 

        System.out.println("A raiz da minhaArvore é: " + minhaArvore.getRaiz().valor); 

    }

}
