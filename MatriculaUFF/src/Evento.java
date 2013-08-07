
/**
 *
 * @author Bruno
 */
public class Evento {
    private String      nome, descricao;
    private int         peso;
    private Turma       turma;
    private Avaliação   avaliacao;
    
    public Evento(String nome, String descricao, int peso, Turma turma) {
        setNome(nome);
        setDescricao(descricao);
        setPeso(peso);
        setTurma(turma);
        
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
    
    public Avaliação getAvaliacao() {
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
    
    public void setAvaliacao(Avaliação avaliacao) {
        this.avaliacao = avaliacao;
    }
}
