
/**
 *
 * @author Bruno
 */
public class Material {
    private String  nome, descricao, filePath;
    private Turma   turma;
    
    public Material(String nome, String descricao, String filePath, Turma turma) {
        setNome(nome);
        setDescricao(descricao);
        setFilePath(filePath);
        setTurma(turma);
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public Turma getTurma() {
        return turma;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setFilePath(String filepath) {
        this.filePath = filepath;
    }
    
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public boolean eviar() {
        // TODO
        return false;
    }
    
    public boolean excluir() {
        // TODO
        return false;
    }
    
    public void download() {
        // TODO
    }
    
    public boolean abrir() {
        // TODO
        return false;
    }
}
