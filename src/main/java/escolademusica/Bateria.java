/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escolademusica;

/**
 *
 * @author maria.oliveira2024
 */
public class Bateria extends InstrumentoMusical{
    private int numeroPecas;
    
public Bateria(String nome, String material, int numeroPecas) {
    super(nome, material);
    this.numeroPecas = numeroPecas;
}

@Override
public void tocar() {
    System.out.println("Marcando o ritmo  na " + nome + " com " + this.getNumeroPecas() + " peças:");
    System.out.println("Boom! Tss! Boom! Tss! ");
}

@Override
public void afinar() {
    super.afinar();
    System.out.println("Ajustando a tensão das peles dos tambores");
}

@Override
public void mostrarInformacoes() {
    super.mostrarInformacoes();
}
    
}
