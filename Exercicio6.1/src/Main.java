public class Main {
	public static void main(String[] args) {
		ILista lista = new LDE();

        Aluno a1 = new Aluno("Maria", 17, 9.1);
        Aluno a2 = new Aluno("João", 15, 4.8);
        Aluno a3 = new Aluno("Ana", 16, 7.5);

		lista.insereInicio(a2);
		lista.insereInicio(a1);
		lista.insereFim(a3);

		System.out.println("Tamanho: " + lista.tamanho());
        System.out.println("Imprimindo os dados do Início:");
		lista.toStringInicio();
		System.out.println("Imprimindo os dados do Fim: ");
		lista.toStringFim();
		

	}

}