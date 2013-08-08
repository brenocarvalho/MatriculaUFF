
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */
public class Matricula
{

    private String codigo;
    private Aluno aluno;
    private Curso curso;
    private List<AtividadeComplementar> atividades;
    private List<Avaliacao> avaliacoes;
    private List<Turma> turmas;

    public Matricula(String codigo, Curso curso)
    {
        atividades = new ArrayList<AtividadeComplementar>();
        avaliacoes = new ArrayList<Avaliacao>();
        turmas = new ArrayList<Turma>();
        
        this.codigo = codigo;
        this.curso = curso;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public Aluno getAluno()
    {
        return aluno;
    }

    public void setAluno(Aluno aluno)
    {
        this.aluno = aluno;
    }

    public Curso getCurso()
    {
        return curso;
    }

    public void setCurso(Curso curso)
    {
        this.curso = curso;
    }
    
    public void addAtividadeComplementar(AtividadeComplementar ac)
    {
        atividades.add(ac);
    }
    
    public AtividadeComplementar[] getAtividadesComplementares()
    {
        return (AtividadeComplementar[]) atividades.toArray();
    }
    
    public AtividadeComplementar getAtividadeComplementar(String nome)
    {
        for(AtividadeComplementar av : atividades)
            if(av.getNome().equalsIgnoreCase(nome))
                return av;
        return null;
    }
    
    public void addAvaliacao(Avaliacao avaliacao)
    {
        avaliacoes.add(avaliacao);
    }
    
    public Avaliacao[] getAvaliacoes()
    {
        return (Avaliacao[]) avaliacoes.toArray();
    }
    
    public void addTurma(Turma t)
    {
        turmas.add(t);
    }
    
    public Turma[] getTurmas()
    {
        return (Turma[]) turmas.toArray();
    }
}
