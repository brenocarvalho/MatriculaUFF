
import java.util.HashMap;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian
 */
public class SistemaFachada 
{
    public static SistemaFachada uniqueInstance = null;
    private Map<String, Usuario> usuarios;
    
    private SistemaFachada()
    {
        usuarios = new HashMap<String, Usuario>();
    }
    
    public static synchronized SistemaFachada getInstance()
    {
        if(uniqueInstance == null)
            uniqueInstance = new SistemaFachada();
        return uniqueInstance;
    }
    
    public Usuario logarSistema(String usuario, String senha)
    {
        if(!estaCadastrado(usuario))
        {
            System.out.println("Usuário não cadastrado no sistema!!");
            return null;
        }
            
        Usuario resp = usuarios.get(usuario);
        
        if(resp.getSenha().equals(senha))
        {
            resp.setLogged(true);
            return resp;
        }
        
        System.out.println("Senha digitada está incorreta!!");
        return null;
    }
    
    public boolean estaCadastrado(String usuario)
    {
        return usuarios.containsKey(usuario);
    }
    
    public void visualizarInfo(Usuario usuario)
    {
        
    }
    
    public boolean enviarMensagem(String titulo, String texto, String destinatario) {
        Usuario remet = getUsuarioLogado(),
                dest = buscaUsuarioPeloLogin(destinatario);
        
        if(dest == null)
            return false; // Falhou ao enviar, login não encontrado
        else {
            Mensagem msg = remet.criaMensagem(titulo, texto, dest);
            
            remet.addMensagemEnviada(msg);
            dest.addMensagemRecebida(msg);
            
            return true;
        }
    }
    
    public void visualizarListaDeMensagens() {
        Usuario user = getUsuarioLogado();
        
        for(int i = 0; i < user.getNumeroDeMensagensRecebidas(); ++i) {
            Mensagem msg = user.getMensagemRecebida(i);
            
            if(msg != null) {
                System.out.print((i + 1) + " - " + msg.getTitulo() + " (de " + msg.getRemetente().getLogin() + "\n" + msg.getMensagem() + "\n\n");
            }
        }
    }
    
    public Usuario getUsuarioLogado() {
        // Implementar este método
        return null;
    }
    
    // Retorna null caso não seja encontrado
    public Usuario buscaUsuarioPeloLogin(String login) {
        // Implementar este método
        return null;
    }
}