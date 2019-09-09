package semana4;

public class TurmaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno a1 = new Aluno();	//NOVO TIPO
			
		a1.setMatricula("001");
		a1.setNome("Lucas");
		
		Turma turma_poo = new Turma();
		
		turma_poo.adicionarAluno(a1);	// INCLUINDO ALUNO
		
		a1 = new Aluno();
		a1.setMatricula("002");
		a1.setNome("Maria");		

		turma_poo.adicionarAluno(a1);	//INLCUINDO ALUNO
		
		turma_poo.imprimirAlunos();
		
	}

}
