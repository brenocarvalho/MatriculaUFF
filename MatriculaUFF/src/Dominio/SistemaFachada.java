package Dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */

public class SistemaFachada 
{
    public static SistemaFachada uniqueInstance = null;
    private Scanner in;
    private int ano, periodo;
    private Map<String, Usuario> usuarios;
    public Usuario usuarioLogado;
    
    private SistemaFachada()
    {
        usuarios = new HashMap<String, Usuario>();
        in = new Scanner(System.in);
        usuarioLogado = null;
        //TODO ano = system.getYear();
    }
    
    public static synchronized SistemaFachada getInstance()
    {
        if(uniqueInstance == null)
            uniqueInstance = new SistemaFachada();
        return uniqueInstance;
    }
    
    
    public Usuario getUsuarioLogado(){ return this.usuarioLogado;}
    public void setUsuarioLogado(Usuario usuario){ this.usuarioLogado = usuario;}    
    
    public int getPeriodo(){ return this.periodo;}
    public int getAno(){ return this.ano;}
    
    public void setPeriodo(int periodo){ this.periodo = periodo;}
    public void setAno(int ano){ this.ano = ano;}
    
    public Usuario logarSistema(String usuario, String senha)
    {
        if(!estaCadastrado(usuario))
        {
            System.out.println("Usuário não cadastrado no sistema!!");
            return null;
        }
            
        Usuario resp = usuarios.get(usuario);
        
        if(resp.getSenha().equals(senha))
        {
            resp.setLogged(true);
            return resp;
        }
        
        System.out.println("Senha digitada está incorreta!!");
        return null;
    }
    
    public boolean estaCadastrado(String usuario)
    {
        return usuarios.containsKey(usuario);
    }
    
    public void visualizarInfo(Aluno aluno)
    {   
        System.out.printf("Informaçãoes:\nNome: %s\nCPF: %s\nRG: %s\nMatricula: %s\nCurso Atual: %s\nE-Mail: %s\n"
                + "Telefone: %s\nEndereço: %s\n", aluno.getNome(), aluno.getCpf(), aluno.getRg(), aluno.getMatricula().getCodigo(), 
                aluno.getCursoAtual().getNome());
        
        System.out.println("Deseja editar suas informações? [S/N]");
        String resp = in.next();
        
        if(resp.equalsIgnoreCase("s"))
            modificaInfo(aluno);
    }

    private void modificaInfo(Aluno aluno) 
    {
        System.out.println("Qual informação deseja editar?\n1 - E-Mail\n2 - Endereço\n3 - Telefone");
        int opt = in.nextInt();
        
        switch(opt)
        {
            case 1:        
                System.out.println("Digite o novo e-mail: ");
                aluno.setEMail(in.next());
            break;
                
            case 2:
                System.out.println("Digite o novo endereço: ");
                aluno.setEndereco(in.next());
            break;
                
            case 3:
                System.out.println("Digite o novo telefone: ");
                aluno.setTelefone(in.next());
            break;
                
            default:
                System.out.println("Opção inválida!!");
        }
    }
    
    public List<Disciplina> visualuzaDisciplinas(Matricula matricula){
        Turma[] turmas = matricula.getTurmas();
        List<Disciplina> disc = new ArrayList();
        for (Turma t: turmas){
            disc.add(t.getDisciplina());
        }
        return disc;
    }
    
    public List<String> visualizaEmenta(Matricula matricula){
        Turma[] turmas = matricula.getTurmas();
        List<String> ementas = new ArrayList();
        for (Turma t: turmas){
            ementas.add(t.getDisciplina().getEmenta()+"\nCarga horária: "+t.getDisciplina().getCargaHoraria());
        }
        return ementas;
    }
    
    
    public List<String> visualizaPlanoDeEstudos(Matricula matricula){
        Turma[] turmas = matricula.getTurmas();
        List<String> ementas = new ArrayList();
        for (Turma t: turmas){
            Disciplina disciplina = t.getDisciplina();
            if(t.getAno() == this.getAno()  && t.getPeriodo() == this.getPeriodo()){
                ementas.add(disciplina.getNome()+"\nHorário: "+t.getHorario());
            }
        }
        return ementas;
    }
    
    public List<String> visualizaHistorico(Matricula matricula){
        Turma[] turmas = matricula.getTurmas();
        List<String> ementas = new ArrayList();
        for (Turma t: turmas){
            Disciplina disciplina = t.getDisciplina();
	    int nota = 0, peso, fator = 0;
	    for(Avaliacao aval: matricula.getAvaliacoes()){
		if(aval.getTurma() == t){
		    peso = aval.getEvento().getPeso();
		    nota = aval.getNota()*peso;
		    fator += peso;
		}
	    }
	    nota /= fator;
            ementas.add(disciplina.getEmenta()+"\nCarga horária: "+Integer.toString(disciplina.getCargaHoraria())+"\nNota: "+Integer.toString(nota));
        }
        return ementas;
    }
    
    
    
    public void listarContatos(Usuario usuario)
    {
        Usuario[] contatos = usuario.getContatos();
        
        System.out.println("Contatos: ");
        
        for(int i=0; i<contatos.length; i++)
            System.out.println("Login: " + contatos[i].getLogin());
    }
    
    // Retorna null caso não seja encontrado
    public Usuario buscaUsuarioPeloLogin(String login) {
        // Implementar este método
        return null;
    } 
}
