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
    private String huepedFrecuente;

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
     * @param huespedFrecuente de la reserva
     */
    public Reserva (int codigo,String fechaRealizacion, String fechaEntrada, String fechaSalida, String estado, String metodoPago, double valorTotal, String huespedFrecuente){
        this.codigo = codigo;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.metodoPago = metodoPago;
        this.valorTotal = valorTotal;
        this.huepedFrecuente = huespedFrecuente;

        this.listReservaHabitacion= new ArrayList<>();
        this.listReservaServicioAdicional= new ArrayList<>();
    }

    /**
     * metodo para agregar un servicio adicional
     * @param codigo del servicio
     * @param nombre del servicio
     * @param descripcion del servicio
     * @param precio del servicio
     * @param disponibilidad del servicio
     * @return
     */
    public String agregarServicioAdicional(int codigo, String nombre, String descripcion, double precio, String disponibilidad) {
        String servicioAgregado;
        ServicioAdicional servicio = new ServicioAdicional(codigo,nombre, descripcion, precio, disponibilidad);
        listReservaServicioAdicional.add(servicio);
        servicioAgregado = "el servicio fue agregado exitosamente";
        return servicioAgregado;
    }

    /**
     * metodo para cancelar un servicio adicional
     * @param codigo del servicio adicional
     */
    public void cancelarServicioAdicional(int codigo) {
        ServicioAdicional servicio = buscarServicio(codigo);
        listReservaServicioAdicional.remove(servicio);
    }

    /**
     * metodo para buscar un servicio adicional
     * @param codigo del servicio
     * @return
     */
    public ServicioAdicional buscarServicio (int codigo) {
        ServicioAdicional encontrado = null;
        for(int i = 0; i < listReservaServicioAdicional.size(); i++) {
            ServicioAdicional servicio = listReservaServicioAdicional.get(i);
            if(servicio.getCodigo() == codigo) {
                encontrado = servicio;
                break;
            }
        }
        return encontrado;
    }

    /**
     * metodo para calcular el valor total de una reserva
     * @param cantidadNoches de la reserva
     * @param huespedFrecuente de la reserva
     * @return
     */
    public double calcularValorTotal(int cantidadNoches, String huespedFrecuente) {
        double total = 0;

        // 1. Precio de las habitaciones seleccionadas
        for (int i = 0; i < listReservaHabitacion.size(); i++) {
            Habitacion habitacion = listReservaHabitacion.get(i);
            total = total + (habitacion.getPrecioNoche() * cantidadNoches);
        }

        // 2. Servicios adicionales utilizados
        for (int i = 0; i < listReservaServicioAdicional.size(); i++) {
            ServicioAdicional servicio = listReservaServicioAdicional.get(i);
            total = total + servicio.getPrecio();
        }

        // 3. Descuento si es huésped frecuente (ejemplo: 10%)
        if (huespedFrecuente.equalsIgnoreCase("si")) {
            total = total - (total * 0.10);
        }

        this.valorTotal = total;
        return total;
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

    public String getHuepedFrecuente() {
        return huepedFrecuente;
    }

    public void setHuepedFrecuente(String huepedFrecuente) {
        this.huepedFrecuente = huepedFrecuente;
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
