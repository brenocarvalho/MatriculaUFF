/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
import java.util.ArrayList;
import java.util.Iterator;
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

    public boolean login()
    {
        return isLogged;
    }
    
    public void setLogged(boolean logged)
    {
        this.isLogged = logged;
    }
    
    // TODO
    public Usuario buscaPorLogin(String login)
    {

        return null; // for while
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

    public void removeMensagemRecebida(Mensagem mensagem)
    {
        msgRecebidas.remove(mensagem);
    }

    public void removeMensagemEnviada(Mensagem mensagem)
    {
        msgEnviadas.remove(mensagem);
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
}
