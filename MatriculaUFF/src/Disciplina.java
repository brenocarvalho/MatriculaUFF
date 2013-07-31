
/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */
public class Disciplina
{

    private String nome, ementa;

    public Disciplina(String nome)
    {
        this.nome = nome;
    }

    public Disciplina(String nome, String ementa)
    {
        this.nome = nome;
        this.ementa = ementa;
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
}
