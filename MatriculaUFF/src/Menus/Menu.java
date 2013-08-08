/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<String> opcs; // Opções
    
    public Menu() {
        opcs = new ArrayList();
    }
    
    public void addOpcao(String opc) {
        opcs.add(opc);
    }
    
    public int getNumeroDeOpcs() {
        return opcs.size();
    }
    
    public void removeOpcao(int index) {
        opcs.remove(index);
    }
    
    public void removeOpcao(String opc) {
        opcs.remove(opc);
    }
    
    // Executa o menu e retorna a índice da opção escolhida
    // retorna -1 caso não haja opções no menu
    public int run() {
        if(opcs.size() > 0)
            return loop();
        else
            return -1;
    }
    
    private int loop() {
        Scanner input = new Scanner(System.in);
        int opc;
        
        while(true) {
            showOpcoes();
            
            try {
                System.out.print("\n-> ");
                opc = input.nextInt();
                
                if(opc >= 0 && opc < opcs.size())
                    return opc;
                else
                    System.out.print("\nErro: Opção inválida\n\n");
            } catch(InputMismatchException e) {
                System.out.print("\nErro: Entrada inválida\n\n");
                
                input.next();
            }
        }
    }
    
    private void showOpcoes() {
        Iterator    it  = opcs.iterator();
        int         i   = 0;
        
        while(it.hasNext()) {
            System.out.print((i++) + " - " + it.next() + "\n");
        }
    }
}
