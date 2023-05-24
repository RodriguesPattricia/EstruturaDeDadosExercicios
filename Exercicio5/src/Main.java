public class Main {
	public static void main(String[] args) {
		ILista lista = new LDE();
		
		lista.insereInicio(10);
		lista.insereInicio(2);
		lista.insereInicio(3);
		lista.insereFim(99);

		System.out.println("Tamanho: " + lista.tamanho());
        System.out.println("Imprimindo os dados do Início:");
		lista.toStringInicio();
		System.out.println("Imprimindo os dados do Fim: ");
		lista.toStringFim();

		System.out.println(lista.getInicio());
		System.out.println(lista.getFim());
		

	}

}