import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor calcular a distância entre dois pontos cartesianos a e b: ");
        System.out.print("Digite o valor de X para o ponto a: ");
        double xa = entrada.nextDouble();
        System.out.print("Digite o valor de Y para o ponto a: ");
        double ya = entrada.nextDouble();
        System.out.print("Digite o valor de X para o ponto b: ");
        double xb = entrada.nextDouble();
        System.out.print("Digite o valor de Y para o ponto b: ");
        double yb = entrada.nextDouble();

        Calculadora calc = new Calculadora(xa, ya, xb, yb);
        System.out.print("A distância entre os pontos é " + calc.calculaDistancia(xa, ya, xb, yb));

    }
}