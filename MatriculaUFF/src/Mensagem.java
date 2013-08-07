
/**
 *
 * @author Bruno
 */
public class Mensagem
{

    private String titulo, mensagem;
    private Usuario remetente, destinatario;

    public Mensagem(String titulo, String mensagem, Usuario remetente, Usuario destinatario)
    {
        setTitulo(titulo);
        setMensagem(mensagem);
        setRemetente(remetente);
        setDestinatario(destinatario);
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getMensagem()
    {
        return mensagem;
    }

    public Usuario getRemetente()
    {
        return remetente;
    }

    public Usuario getDestinatario()
    {
        return destinatario;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }

    public void setRemetente(Usuario remetente)
    {
        this.remetente = remetente;
    }

    public void setDestinatario(Usuario destinatario)
    {
        this.destinatario = destinatario;
    }

    // TODO
    public void responder(Mensagem mensagem)
    {
    }

    public void deletar()
    {
        destinatario.removeMensagemRecebida(this);

        remetente.removeMensagemEnviada(this);
    }

}
