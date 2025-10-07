/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package escolademusica.escolademusica;

/**
 *
 * @author maria.oliveira2024
 */
public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;
    
public InstrumentoMusical (String nome, String material) {
    this.nome = nome;
    this.material = material;
}
//Método abstrato qe deve ser implementado pelas subclasses
public abstract void tocar ();

//Dois Métodos concretos que pode ser usado por todas subclasses
public void afinar () {
    System.out.println("Afinando o " + nome + "...");
}

public void mostrarInformacoes() {
    System.out.println("Instrumento: " + nome);
    System.out.println("Material: " + material);
}
}
