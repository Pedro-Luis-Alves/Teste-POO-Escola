package curso;

public class Teste {

	public static void main(String[] args) {
		
		//-----------Criando Curso-----------
		
		Curso contabilidade = new Curso();
		
		//-----------Criando Aluno-----------
		
		Aluno Pedro = new Aluno();
		Pedro.curso = contabilidade;
		
		//-----------Criando Professor-----------
		
		Professor Carlos = new Professor();
		

		contabilidade.professor = Carlos;
		
		
		
	}
}