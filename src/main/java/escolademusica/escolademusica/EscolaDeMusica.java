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
}
