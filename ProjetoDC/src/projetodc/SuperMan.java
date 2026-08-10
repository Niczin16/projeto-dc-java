/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetodc;

/**
 *
 * @author Aluno
 */
public class SuperMan extends Heroi{
    private int nivelSuperForca;
    
    
//    public String Especialidade(){
//        nivelSuperForca = 10000;
//        
//        return("Super força: " + String.valueOf(nivelSuperForca));
//    }

    public int getNivelSuperForca() {
        return nivelSuperForca;
    }

    public void setNivelSuperForca(int nivelSuperForca) {
        this.nivelSuperForca = nivelSuperForca;
    }
    
    public String ApresentarSuperMan(){
        String valor = apresentarHeroi();
        
        return(
                valor + "\n"
                + "Nível de super força: " + String.valueOf(nivelSuperForca) + "\n"
              );
    }
    
}
