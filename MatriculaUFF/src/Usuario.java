/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario
{

    private String login, senha;
    private List<Usuario> contatos;
    private List<Mensagem> msgRecebidas, msgEnviadas;
    private boolean isLogged;

    public Usuario(String login, String senha)
    {
        setLogin(login);
        setSenha(senha);

        contatos = new ArrayList<Usuario>();

        isLogged = false;
    }

    public String getLogin()
    {
        return login;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    public void setLogged(boolean logged)
    {
        this.isLogged = logged;
    }
    
    public boolean isLogged()
    {
        return isLogged;
    }

    // TODO
    public Mensagem criaMensagem(String titulo, String texto, Usuario destinatario)
    {
        Mensagem msg = new Mensagem(titulo, texto, this, destinatario);

        return msg;
    }

    public void addMensagemRecebida(Mensagem mensagem)
    {
        msgRecebidas.add(mensagem);
    }

    public void addMensagemEnviada(Mensagem mensagem)
    {
        msgEnviadas.add(mensagem);
    }
    
    public int getNumeroDeMensagensRecebidas() {
        return msgRecebidas.size();
    }
    
    public int getNumeroDeMensagensEnviadas() {
        return msgEnviadas.size();
    }
    
    public Mensagem getMensagemEnviada(int index) {
        try {
            return msgEnviadas.get(index); // achou
        } catch(IndexOutOfBoundsException e) {
            return null; // falhou
        }
    }
    
    public Mensagem getMensagemRecebida(int index) {
        try {
            return msgRecebidas.get(index); // deu certo
        } catch(IndexOutOfBoundsException e) {
            return null; // falhou
        }
    } 

    public void removeMensagemRecebida(Mensagem mensagem)
    {
        msgRecebidas.remove(mensagem);
    }

    public void removeMensagemEnviada(Mensagem mensagem)
    {
        msgEnviadas.remove(mensagem);
    }
    
    public void removerContato(String login)
    {
        for(Usuario u : contatos)
            if(u.getLogin().equalsIgnoreCase(login))
                contatos.remove(u);
    }
    
    public void addContato(Usuario usuario)
    {
        contatos.add(usuario);
    }
    
    public Usuario[] getContatos()
    {
        return (Usuario[]) contatos.toArray();
    }
}
