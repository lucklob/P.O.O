package semana4;

import java.util.ArrayList;

public class Turma {
	
	private int codigo;
	private String descricao;
	private ArrayList<Aluno> alunos; //lista do tipo aluno
	
	public Turma(){
		alunos = new ArrayList<>(); //AGORA ESTA INSTACIADO UTILIZAMOS O CONSTRUTOR
	}
	
	public void imprimirAlunos(){
	
		System.out.println("Listagem de alunos");
		System.out.println("**************************");
		
		for(int i=0;i<alunos.size();i++)
		{
			Aluno al;
			
			al = alunos.get(i);
			System.out.println("Matricula = " + al.getMatricula());
			System.out.println("Nome =  " + al.getNome());
			System.out.println("**************************");
		}
	}/*
	for(Aluno al;alunos){//faca um iteracao na variavel alunos  que tem o obj desse tipoe joga na al
	syso
	syso
	}*/
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//novos metodos
	
	public void adicionarAluno(Aluno novoAluno){
		//toda vez que ele executar, ele vai adiacionar no ARRAY
		alunos.add(novoAluno);
		System.out.print("aluno inserido");
	}
	
}
