/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postnet;

/**
 * Clase Ticket, tiene barios atributos referentes al pago que se realiza en la clase Posnet
 * 
 * @author Leonardo Jesús Figueroa Valdivia
 */
class Ticket {
    private String nombreApellido;
    private double monto;
    private double montoPorCuota;

    public Ticket(String nombreApellido, double monto, double montoPorCuota) {
        this.nombreApellido = nombreApellido;
        this.monto = monto;
        this.montoPorCuota = montoPorCuota;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public double getMonto() {
        return monto;
    }

    public double getMontoPorCuota() {
        return montoPorCuota;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setMontoPorCuota(double montoPorCuota) {
        this.montoPorCuota = montoPorCuota;
    }

    /**
     * Reescritura del metodo toString en la que muestra todos los atributos de la clase
     * 
     * @return Una concatenacion de los atributos para mostrar la informacion de una forma más bonita
     */
    @Override
    public String toString() {
        return "Ticket{" + "nombreApellido=" + nombreApellido + ", monto=" + monto + ", montoPorCuota=" + montoPorCuota + '}';
    }
    
    
}
