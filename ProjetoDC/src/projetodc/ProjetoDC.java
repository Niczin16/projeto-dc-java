/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetodc;

import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class ProjetoDC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        
        /*Bibliotecas necessárias*/
        Scanner scanner = new Scanner(System.in);
        
        /*SuperMan*/
        /* SuperMan GSuperman = new SuperMan();
        
        String VidaSuperMan = String.valueOf(GSuperman.ConsultarVida());
        System.out.println( GSuperman.Apresentacao() + "\n" + "Vida do super homem: " + VidaSuperMan);
        System.out.println(" \n Quer saber a especialidade do " + GSuperman.Apresentacao() + "?" );
        String opcao = scanner.nextLine();
        
        if ("S".equals(opcao)) {
            System.out.println("\n A especialidade do super home é - " + GSuperman.Especialidade());       
        }else{
            System.out.println("O superMan saiu chorando!");                   
        }
        */  
        
        /*BATMAN (EXEMPLO DE INSTANCIAÇÃO)*/
//        Heroi batman = new Heroi();
//        
//        batman.nome = "Willian Wonkan";
//        batman.vida = 900;
//        batman.velocidade = 9.3;
//        batman.poder = "Dinheiro";
//        
//        System.out.println(batman.apresentarHeroi());
        
        /*Superman*/
        SuperMan superMan = new SuperMan();
        
        superMan.setNome("Clark Kent");
        superMan.setPoder("Corpo de Aço");
        superMan.setVelocidade(9.999); //10 é o máximo
        superMan.setVida(1000); //1000 é o máximo
        superMan.setNivelSuperForca(9000);//9000 é o máximo
        
        System.out.println(superMan.ApresentarSuperMan());;
        
    }
    
}
