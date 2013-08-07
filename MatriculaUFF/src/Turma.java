
/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Turma
{

    private String                  codigo, horario;
    private int                     ano, periodo;
    private Professor               professor;
    private Map<Evento, Avaliação>  eventos;
    private List<Material>          materiais;
    
    public Turma(Professor professor) {
        setProfessor(professor);
        
        eventos = new HashMap();
        
        materiais = new ArrayList();
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public String getHorario()
    {
        return horario;
    }

    public void setHorario(String horario)
    {
        this.horario = horario;
    }

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public int getPeriodo()
    {
        return periodo;
    }

    public void setPeriodo(int periodo)
    {
        this.periodo = periodo;
    }
    
    public Professor getProfessor() {
        return professor;
    }
    
    public void setProfessor(Professor professfor) {
        this.professor = professor;
    }
}
