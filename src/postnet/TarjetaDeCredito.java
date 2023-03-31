/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postnet;

/**
 * Clase TarjetaDeCredito, guarda la informacion de las tarjeta de credito
 * 
 * @author Leonardo Jesús Figueroa Valdivia
 */
class TarjetaDeCredito {
    //Atributos
    private String entidadBancaria;
    private String nroTarjeta;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;
    
    //Constructres

    public TarjetaDeCredito(String entidadBancaria, String nroTarjeta, double saldo, EntidadFinanciera entidadFinanciera, Persona titular) {
        this.entidadBancaria = entidadBancaria;
        this.nroTarjeta = nroTarjeta;
        this.saldo = saldo;
        this.entidadFinanciera = entidadFinanciera;
        this.titular = titular;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public EntidadFinanciera getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setEntidadFinanciera(EntidadFinanciera entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    /**
     * Sobreescritura del metodo toString para mostrar la tarjeta de credito
     * 
     * @return todo los atributos de la tarjeta de credito como un String
     */
    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria=" + entidadBancaria + ", nroTarjeta=" + nroTarjeta + ", saldo=" + saldo + ", entidadFinanciera=" + entidadFinanciera + ", titular=" + titular + '}';
    }
    
    
}
