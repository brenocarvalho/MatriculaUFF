
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */
public class Main
{
    /**
     * @param args the command line arguments
     * TODO Pessoal temos que conferir esta classe e refatorar seus métodos
     */
    private String nome, ementa, codigo;
    private ArrayList<Curso> cursos;

    public Disciplina(String nome, String codigo)
    {
        this.nome = nome;
        this.codigo = codigo;
        inicializaEstruturas();
    }

    public Disciplina(String nome, String ementa, String codigo)
    {
        this.nome = nome;
        this.ementa = ementa;
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



    public static void main(String[] args) throws IOException
    {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        Menu            mainMenu = new Menu();
        
        mainMenu.addOpcao("Opção 1");
        mainMenu.addOpcao("Opção 2");
        mainMenu.addOpcao("Sair");

        adicionarDadosIniciais();
        
        boolean exit = false;
        String opt = "0";
        while(!opt.equals("-1"))
        {
            switch(mainMenu.run()) {
                case 0:
                    break;
                    
                case 1:
                    break;
                    
                case 2:
                    exit = true;
                    break;
                    
                default:
                    System.out.print("Erro: menu sem oções\n");
                    exit = true;
            }
        }
        }
        
        System.out.println("Fim do Programa");
    }

    public static void adicionarDadosIniciais()
    {
        Usuario rafa = new Usuario("grillorafael", "120491");
        
        Curso cc = new Curso("Ciencia da Computacao", "1");
        Curso adm = new Curso("Administracao", "2");
        Curso eng = new Curso("Engenharia", "3");

        Disciplina calc = new Disciplina("Calculo I", "GMA02930");
        Disciplina es1 = new Disciplina("Engenharia de Software 1", "TCC01920");
        Disciplina tpa = new Disciplina("Tecnicas de Programacao Avancada", "TCC92030");
        
        cc.adicionaDisciplina(calc);
        cc.adicionaDisciplina(es1);
        cc.adicionaDisciplina(tpa);
        
        adm.adicionaDisciplina(calc);
        
        eng.adicionaDisciplina(calc);

        Aluno rafael = new Aluno("Rafael Grillo Abreu", new Matricula("210311320", cc));
        Aluno ian = new Aluno("Ian Villar", new Matricula("21003203", adm));
        Aluno cb = new Aluno("Carlos Bruno", new Matricula("21031920", cc));
        Aluno breno = new Aluno("Breno Carvalho", new Matricula("210020930", eng));

        

    }
}
