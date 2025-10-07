/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escolademusica;

/**
 *
 * @author maria.oliveira2024
 */
public class Saxofone extends InstrumentoMusical {
    private String tipo;
    
public Saxofone(String nome, String material, String tipo){
    super(nome, material);
    this.tipo = tipo;
}

@Override
public void tocar(){
    System.out.println("Tocando jazz suave no " + super.getNome() + " " + tipo + "...");
    System.out.println("Melodia envolvente de saxofone ");
}

@Override
}
