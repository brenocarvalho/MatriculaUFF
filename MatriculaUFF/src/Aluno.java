
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */
public class Aluno
{

    private String nome, cpf, rg;
    private Matricula mat;
    private Curso cAtual;
    private Map<Curso, Matricula> cursados;

    //public Aluno(String nome, Matricula matricula, Curso curso){
    public Aluno(String nome, Matricula matricula)
    {
        setNome(nome);
        setMatricula(matricula);
        //TODO encapsular esta parte
        cursados = new HashMap<Curso, Matricula>();
        //cAtual = curso;
        matricula.setAluno(this);
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getRg()
    {
        return rg;
    }

    public void setRg(String rg)
    {
        this.rg = rg;
    }

    public Matricula getMatricula()
    {
        return mat;
    }

    public void setMatricula(Matricula mat)
    {
        this.mat = mat;
    }

    public void addConcluido(Curso curso, Matricula matricula)
    {
        cursados.put(curso, matricula);
    }

    public void removeConcluido(Curso curso)
    {
        cursados.remove(curso);
    }

    public boolean concluiu(Curso curso)
    {
        return cursados.containsKey(curso);
    }

    public Curso[] getConcluidos()
    {
        return cursados.keySet().toArray(new Curso[0]);
    }
    //TODO adicionar métodos para mais fácil manipulação do mapa de cursos finalizados.
}
