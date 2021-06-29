package composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João Pedro");
		Aluno aluno2 = new Aluno("Maria Luiza");
		Aluno aluno3 = new Aluno("Raphael Rodrigues");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Desenvolvimento Web");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno1);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		System.out.println("*------- CURSO 1 --------*");
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome + " ...");
			System.out.println("e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println("*------- CURSO 2 --------*");
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso " + curso2.nome + " ...");
			System.out.println("e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println("*------- CURSO 3 --------*");
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome + " ...");
			System.out.println("e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos); // Apartir do aluno, peguei os cursos do aluno
														 // peguei o primeiro curso do aluno e depois peguei
														 // todos os alunos daquele curso
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("React Native");
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.alunos);
		}
		
	}
}