package modelHotel;
import java.util.List;

public class Habitacion {

    // atributos de la clase

    private int numHabitacion;
    private String tipo;
    private int capacidadMax;
    private double precioNoche;
    private String estaDisponible;

    // relaciones
    private Hotel hotel;
    private Reserva reserva;

    /**
     * metodo constructor de la clase Habitacion
     * @param numHabitacion
     * @param tipo
     * @param capacidadMax
     * @param precioNoche
     * @param estaDisponible
     */

    public Habitacion(int numHabitacion, String tipo, int capacidadMax, double precioNoche, String estaDisponible){

        this.numHabitacion= numHabitacion;
        this.tipo= tipo;
        this.capacidadMax= capacidadMax;
        this.precioNoche= precioNoche;
        this.estaDisponible= estaDisponible;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public String getEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(String estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }



    @Override

    public String toString() {
        return "Habitacion{" +
                "numHabitacion =" + numHabitacion + "\n" +
                "tipo =" + tipo + "\n" +
                "capacidadMax =" + capacidadMax + "\n" +
                "precioNoche = " + precioNoche + "\n" +
                "estaDispoible =" + estaDisponible + "\n" ;
    }
}
