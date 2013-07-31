
/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        adicionarDadosIniciais();
    }

    public static void adicionarDadosIniciais()
    {
        Curso cc = new Curso("Ciencia da Computacao", "1");
        Curso adm = new Curso("Administracao", "2");
        Curso eng = new Curso("Engenharia", "3");

        Disciplina es1 = new Disciplina("Engenharia de Software 1");
        Disciplina tpa = new Disciplina("Tecnicas de Programacao Avancada");

        Aluno rafael = new Aluno("Rafael Grillo Abreu", new Matricula("210311320", cc));
        Aluno ian = new Aluno("Ian Villar", new Matricula("21003203", adm));
        Aluno cb = new Aluno("Carlos Bruno", new Matricula("21031920", cc));
        Aluno breno = new Aluno("Breno Carvalho", new Matricula("210020930", eng));


    }
}
