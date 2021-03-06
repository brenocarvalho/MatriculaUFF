package Dominio;

import java.util.Date;


/**
 *
 * @author Breno W. Carvalho, C. Bruno Garcia, Ian Villar, Rafael Grillo
 */

public class Evento {
    private String      nome, descricao;
    private int         peso;
    private Turma       turma;
    private Avaliacao   avaliacao;
    private Date data;
    
    public Evento(String nome, String descricao, int peso, Turma turma, Date data) {
        setNome(nome);
        setDescricao(descricao);
        setPeso(peso);
        setTurma(turma);
        setDate(data);
        
        avaliacao = null;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public Turma getTurma() {
        return turma;
    }
    
    public Avaliacao getAvaliacao() {
        return avaliacao;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    public void setDate(Date data)
    {
        this.data = data;
    }
    
    public Date getDate()
    {
        return data;
    }
}
