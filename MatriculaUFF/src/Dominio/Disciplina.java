package Dominio;
import java.util.ArrayList;


/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */

public class Disciplina
{
    private String nome, ementa, codigo;
    private ArrayList<Curso> cursos;
    private int carga;

    public Disciplina(String nome, String codigo)
    {
        this.nome = nome;
        this.codigo = codigo;
        inicializaEstruturas();
    }

    public Disciplina(String nome, String ementa, int cargaHoraria, String codigo)
    {
        this.nome = nome;
        this.ementa = ementa;
        this.carga = cargaHoraria;
        this.codigo = codigo;
        inicializaEstruturas();
    }
    
    private void inicializaEstruturas()
    {
        cursos = new ArrayList<Curso>();
    }
    
    public ArrayList<Curso> getCursos()
    {
        return cursos;
    }
    
    public void adicionaCurso(Curso c)
    {
        cursos.add(c);
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getEmenta()
    {
        return ementa;
    }

    public void setEmenta(String ementa)
    {
        this.ementa = ementa;
    }

    public int getCargaHoraria() {
        return this.carga;
    }

    public void getCargaHoraria(int cargaHoraria){
        this.carga = cargaHoraria;
    }

    
}
