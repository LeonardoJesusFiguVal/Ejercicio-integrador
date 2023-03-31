package postnet;


/**
 * Clase Posnet, se usa para verificar los pagos del datafono.
 *
 * @author Leonardo Jesús Figueroa Valdivia
 * @version 1.0
 */
public class Posnet {
    public static final double RECARGO_POR_CUOTA= 0.03;
    public static final int MIN_CANT_CUOTA= 1;
    public static final int MAX_CANT_CUOTA= 6;
    
/**
 * Metodo para efectuar el pago del Postnet
 * @param tarjeta de la clase TarjetaDeCredito
 * @param montoAbonar de la clase Double
 * @param cantCuota de la clase Integer
 * @return ticket de la clase Ticket, si hay algun fallo se devolvera null
 */
    public Ticket efectuarPago (TarjetaDeCredito tarjeta, double montoAbonar, int cantCuota){
       
        Ticket ticket= null;
        if (datosValidos(tarjeta, montoAbonar, cantCuota)){
            double montoTotal= montoAbonar+ montoAbonar* recargoCuota(cantCuota);
        }
        return ticket;
    }
    
/**
 * Metodo privado para comprobar si los datos ingresados son validos
 * @param tarjeta de la clase TarjetaDeCredito
 * @param montoAbonar de la clase Double
 * @param cantCuota de la clase Integer
 * @return un boolean "true" si todos los datos son validos, y en caso contrario "false"
 */
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, int cuota){
        boolean tarjetaValida= tarjeta!=null;
        boolean montoValido= monto>0;
        boolean cuotaValida= cuota >= MIN_CANT_CUOTA && cuota <= MAX_CANT_CUOTA;
        return tarjetaValida&&montoValido&&cuotaValida;
    }
    
/**
 * Metodo para calcular el recargo por cuotas
 * @param cantCuota de la clase Integer
 * @return la cantidad de recargo por las cuotas especificadas
 */
    private double recargoCuota(int cantCuota){
        return ((cantCuota-1)*RECARGO_POR_CUOTA) ;
    }
}
