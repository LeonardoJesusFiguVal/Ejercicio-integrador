/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postnet;

/**
 *
 * @author Leonardo Jesús Figueroa Valdivia
 */
public class Main {
    public static void main(String[] args){
        Posnet posnet= new Posnet();
        Persona pers= new Persona("43249776M", "Pepe", "Gomez", "666666666", "pepe@gmail.com");
        
       TarjetaDeCredito tarj= new TarjetaDeCredito("Bamkiaaaaa", "44444444440", 15000, EntidadFinanciera.BIRZA, pers);
       
       System.out.println("Tarjeta:");
       System.out.println(tarj);
       
       System.out.println("Tiket:");
       Ticket ticket= posnet.efectuarPago(tarj, 10000, 5);
       System.out.println(ticket);
       
       System.out.println("Tarjeta post pago:");
       System.out.println(tarj);
}
}
