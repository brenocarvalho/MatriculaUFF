/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author breno
 */
public abstract class EstadoMenuAbstrato {
    private String msg;
    private Menu menu;

    public String getMsg(){ return this.msg;}
    public void setMsg(String msg){ this.msg = msg;}

    public void mostraOpcoes(){
	System.out.println(this.msg);
   }

   public abstract void selecionaOpcao(int opt);

   public void proximoEstadoMenu(EstadoMenuAbstrato estado){
       this.menu.setProxEstado(estado);
   }
}
