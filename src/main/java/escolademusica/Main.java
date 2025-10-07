/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escolademusica;

/**
 *
 * @author maria.oliveira2024
 */
public class Main {
    public static void main(String[] args) {

        InstrumentoMusical[] orquestra = new InstrumentoMusical[4];

        orquestra[0] = new Violao("Violão Clássico", "Madeira", 6);
        orquestra[1] = new Piano("Piano de Cauda", "Madeira e Metal", 88);
        orquestra[2] = new Bateria("Bateria Acústica", "Madeira", 5);
        orquestra[3] = new Saxofone("Saxofone", "Latão", "Alto");
        
        /*
        Instância dda própria classe Principa EscolaMusica new
        Objeto: escola
        */
        EscolaDeMusica escola = new EscolaDeMusica();
        
        escola.apresentar(banda);
        escola.contarInstrumentosPorTipo(banda);
        
    
        System.out.println("Informações dos instrumentos:");
        for (InstrumentoMusical instrumento : orquestra) {
            instrumento.mostrarInformacoes();
        }
        
        System.out.println("Afinando os instrumentos...");
        for (InstrumentoMusical instrumento : orquestra) {
            instrumento.afinar();
        }

        System.out.println("A orquestra está começando a tocar!");
        for (InstrumentoMusical instrumento : orquestra) {
            instrumento.tocar();
        }

    }
}

