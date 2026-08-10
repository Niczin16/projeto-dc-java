/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetodc;

/**
 *
 * @author Aluno
 */
public class Heroi {
    private String nome;
    private String poder;
    private int vida;
    private double velocidade;

    //Para criar os getters e o setters automáticamente: alt + insert
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public String apresentarHeroi(){
        return( 
                "Nome: " + nome + "\n" +
                "Vida: " + String.valueOf(vida) + "\n"+
                "Poder: "  + poder + "\n" +
                "Velocidade: " + String.valueOf(velocidade) + "\n"               
               );
    }
    
   
    
}
