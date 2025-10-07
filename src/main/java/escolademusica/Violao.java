/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escolademusica;

/**
 *
 * @author maria.oliveira2024
 */
public class Violao extends InstrumentoMusical{
    private int numeroCordas;
    
public Violao (String nome, String material, int numeroCordas) {
    super(nome, material);
    this.numeroCordas = numeroCordas;
}

@Override
public void tocar () {
    System.out.println("Tocando notas suaves no " + super.getNome() + " com " + numeroCordas + " cordas...");
    System.out.println("Dedilhando uma melodia romântica no violão");
    
}

@Override
public void afinar() {
    super.afinar();
    System.out.println("Ajustnado a tensão das " + numeroCordas + " cordas ");
}

@Override
public void mostrarInfomacoes (){
    super.mostrarInformacoes();
        System.out.println("Numero de cordas: " + numeroCordas);
}
}
