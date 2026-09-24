package modelHotel;
import java.util.ArrayList;
import java.util.List;

public class Reserva {

    //Atributos de la clase Reserva
    private int codigo;
    private String fechaRealizacion;
    private String fechaEntrada;
    private String fechaSalida;
    private String estado;
    private String metodoPago;
    private double valorTotal;

    //Relaciones de la clase Reserva
    private Hotel hotel;
    private Huesped huesped;
    private List<Habitacion> listReservaHabitacion;
    private List<ServicioAdicional> listReservaServicioAdicional;

    /**
     * metodo constructor de la clase Reserva
     * @param codigo de la reserva
     * @param fechaRealizacion de la reserva
     * @param fechaEntrada de la reserva
     * @param fechaSalida de la reserva
     * @param estado de la reserva
     * @param metodoPago de la reserva
     * @param valorTotal de la reserva
     */
    public Reserva (int codigo,String fechaRealizacion, String fechaEntrada, String fechaSalida, String estado, String metodoPago, double valorTotal){
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;

        this.listReservaHabitacion= new ArrayList<>();
        this.listReservaServicioAdicional= new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public List<Habitacion> getListReservaHabitacion() {
        return listReservaHabitacion;
    }

    public void setListReservaHabitacion(List<Habitacion> listReservaHabitacion) {
        this.listReservaHabitacion = listReservaHabitacion;
    }

    public List<ServicioAdicional> getListReservaServicioAdicional() {
        return listReservaServicioAdicional;
    }

    public void setListReservaServicioAdicional(List<ServicioAdicional> listReservaServicioAdicional) {
        this.listReservaServicioAdicional = listReservaServicioAdicional;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codgio =" + codigo + "\n" +
                "fecha de realizacion =" + fechaRealizacion + "\n" +
                "fecha de entrada =" + fechaEntrada + "\n" +
                "fecha de salida = " + fechaSalida + "\n" +
                "estado =" + estado + "\n" +
                "metodo de pago = " + metodoPago + "\n" +
                "valor total = " + valorTotal + "\n" +
                "}";
    }
}
