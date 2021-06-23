package desafios;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	// Metodos
	public Data() {	// Caso não instancie o valor padrao sera 1/1/1970
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		// Você pode usar o this() para apartir de um construtor, chamar outro construtor
		this(1, 1, 1970);	// Chamar o outro construtor dentro da classe
							// o que define qual construtor voce esta chamando e
							// a quantidade de parametros
		
		// Se você tem uma variavel local vc obrigatoriamente tem que inicializar
		
		/* VALORES PADRÕES CASO NÃO INICIALIZE OU DEFINE */
		// byte, short, int, long -> 0
		// float, double -> 0.0
		// boolean -> false
		// char -> '\u0000'
		// Objetos terão por padrão  valor -> null (não aponta para um local da memória)
		
		int a;	// Variavel local
		a = 2;	// Inicialização variavel local
		System.out.println(a);
		
		String s = null;	// Variavel local inicializada
		System.out.println(s);
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}	// Resolver conflito de nomes de parametros c/ atributos, utilizo o this,
		// para referenciar o objeto que esta sendo criado naquele momento
	
	public String obterDataFormatada() {
		String formato = "%d/%d/%d";	// Variaveis locais -> tempo de vida dentro do metodo, apenas.
		return String.format(formato, this.dia, this.mes, this.ano);
	}
	
	public void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
	/*
	static void teste() {
		this.dia = 3;	// Não pode usar this em um metodo static
	}
	*/
	
}