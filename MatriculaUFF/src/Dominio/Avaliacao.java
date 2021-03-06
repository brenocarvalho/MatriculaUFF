/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */

package Dominio;

public class Avaliacao 
{
    private int nota;
    private Turma turma;
    private Evento evento;

    public Turma getTurma(){
        return turma;
    }
    public Evento getEvento(){
        return evento;
    }

    public int getNota() 
    {
        return nota;
    }
    
    public void setNota(int nota)
    {
        this.nota = nota;
    }
}
