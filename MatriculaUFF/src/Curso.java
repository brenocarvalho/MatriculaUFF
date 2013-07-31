
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */
public class Curso
{

    private String nome, codigo;
    private List<Matricula> mats;
    private Map<Aluno, Matricula> emersos;

    public Curso(String nome, String codigo)
    {
        setNome(nome);
        setCodigo(codigo);
        //TODO editar esta pare para encapsular mais, i.e., fazer metodos para instanciar mats e alunos.
        mats = new ArrayList<Matricula>();
        emersos = new HashMap<Aluno, Matricula>();
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo.toUpperCase();
    }

    public void addMatricula(Matricula mat)
    {
        mats.add(mat);
    }

    public void removeMatricula(Matricula mat)
    {
        mats.remove(mat);
    }

    public void removeMatricula(String codigo)
    {
        for (int i = 0; i < mats.size(); i++)
        {
            if (codigo.equals(mats.get(i).getCodigo()))
            {
                mats.remove(i);
                break;
            }
        }
    }

    public boolean temMatricula(Matricula mat)
    {
        return mats.contains(mat);
    }

    public boolean temMatricula(String codigo)
    {
        for (int i = 0; i < mats.size(); i++)
        {
            if (codigo.equals(mats.get(i).getCodigo()))
            {
                return true;
            }
        }
        return false;
    }

    public Matricula[] getMatriculas()
    {
        return mats.toArray(new Matricula[0]);
    }

    public String[] getCodigoMatriculas()
    {
        String[] codigos = new String[mats.size()];
        for (int i = 0; i < codigos.length; i++)
        {
            codigos[i] = mats.get(i).getCodigo();
        }
        return codigos;
    }

    public void addAlunoEmerso(Aluno aluno)
    {
        emersos.put(aluno, aluno.getMatricula());
    }

    public void removeAlunoEmerso(Aluno aluno)
    {
        emersos.remove(aluno);
    }

    public void removeAlunoEmersoPorCPF(String cpf)
    {
        for (Aluno a : emersos.keySet())
        {
            if (cpf.equals(a.getCpf()))
            {
                emersos.remove(a);
                break;
            }
        }
    }

    public void removeAlunoEmersoPorRG(String rg)
    {
        for (Aluno a : emersos.keySet())
        {
            if (rg.equals(a.getRg()))
            {
                emersos.remove(a);
                break;
            }
        }
    }

    public boolean temAlunoEmerso(Aluno aluno)
    {
        return emersos.containsKey(aluno);
    }

    public boolean temMatriculaEmersa(Matricula mat)
    {
        return emersos.containsValue(mat);
    }

    public boolean temCpfALunoEmerso(String cpf)
    {
        for (Aluno a : emersos.keySet())
        {
            if (cpf.equals(a.getCpf()))
            {
                return true;
            }
        }
        return false;
    }

    public boolean temRgALunoEmerso(String rg)
    {
        for (Aluno a : emersos.keySet())
        {
            if (rg.equals(a.getRg()))
            {
                return true;
            }
        }
        return false;
    }

    public Aluno[] getAlunosEmersos()
    {
        return emersos.keySet().toArray(new Aluno[0]);
    }

    public String[] getNomeAlunosEmerso()
    {
        Iterator<Aluno> alunos = emersos.keySet().iterator();
        String[] nomes = new String[emersos.size()];
        int i = 0;
        while (alunos.hasNext())
        {
            nomes[i++] = alunos.next().getNome();
        }
        return nomes;
    }
}
