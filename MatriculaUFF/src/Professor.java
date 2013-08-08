
/**
 *
 * @author Bruno
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professor {
    private String      nome, CPF, departamento, titulacao;
    private List<Turma> turmas;
    
    public Professor(String nome, String CPF, String departamento, String titulacao) {
        setNome(nome);
        setCPF(CPF);
        setDepartamento(departamento);
        setTitulacao(titulacao);
        
        turmas = new ArrayList();
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCPF() {
        return CPF;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public String getTitulacao() {
        return titulacao;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    public int getNumeroDeTurmas() {
        return turmas.size();
    }
    
    public Turma getTurmaByIndex(int index) {
        return turmas.get(index);
    }
    
    public Turma getTurma(String codigo)
    {
        for(Turma t : turmas)
            if(t.getCodigo().equalsIgnoreCase(codigo))
                return t;
        return null;
    }
    
    public void addTurma(Turma turma) {
        turmas.add(turma);
    }
    
    public void removeTurma(int index) {
        turmas.remove(index);
    }
    
    public void removeTurma(Turma turma) {
        turmas.remove(turma);
    }
    
    public Evento criaEvento(Date data, String nome, String descricao, int peso, Turma turma) 
    {
       return new Evento(nome, descricao, peso, turma, data);
    }
}
