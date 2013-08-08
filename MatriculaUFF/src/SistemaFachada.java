
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
}