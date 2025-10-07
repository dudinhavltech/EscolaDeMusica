/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escolademusica;

/**
 *
 * @author maria.oliveira2024
 */
public class Piano extends InstrumentoMusical {
    
    public Piano(String material, String nome) {
        super(material, nome);
    }

    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando o piano");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando lindamente o " +  nome + "...");
    }
}

