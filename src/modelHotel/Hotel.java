package modelHotel;

import java.util.List;
import java.util.ArrayList;

public class Hotel {

    //Atributos de la clase Hotel
    public String nombre;
    public String NIT;
    public String direccion;
    public int telefono;
    public String paginaWeb;

    //Relcaiones de la clase Hotel
    private List<Huesped> listHotelHuesped;
    private List<Reserva> listHotelReserva;
    private List<Habitacion> listHotelHabitacion;

    /**
     * metodo constructor de la clase Hotel
     *
     * @param nombre    del hotel
     * @param NIT       del hotel
     * @param direccion del hotel
     * @param telefono  del hotel
     * @param paginaWeb del hotel
     */
    public Hotel(String nombre, String NIT, String direccion, int telefono, String paginaWeb) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;

        this.listHotelReserva = new ArrayList<>();
        this.listHotelHuesped = new ArrayList<>();
        this.listHotelHabitacion = new ArrayList<>();

    }

    /**
     * metodo para agregar un huesped
     *
     * @param nombre
     * @param identificacion
     * @param telefono
     * @param correoE
     * @param pais
     * @return
     */

    public boolean agregarHuesped(String nombre, int identificacion, int telefono, String correoE, String pais) {
        boolean existe = false;
        Huesped huesped = buscarHuesped(identificacion);
        if (huesped == null) {
            Huesped hues = new Huesped(nombre, identificacion, telefono, correoE, pais);
            listHotelHuesped.add(hues);
            existe = true;
        }
        return existe;

    }

    /**
     * metodo para buscar un huesped
     *
     * @param identificacion
     * @return
     */

    public Huesped buscarHuesped(int identificacion) {
        Huesped encontrado = null;
        for (int i = 0; i < listHotelHuesped.size(); i++) {
            Huesped huesped = listHotelHuesped.get(i);
            if (huesped.getIdentificacion() == identificacion) {
                encontrado = huesped;
                break;
            }
        }
        return encontrado;
    }

    /**
     * metodo para eliminar un huesped
     *
     * @param identificacion
     */
    public void eliminarHuesped(int identificacion) {
        Huesped huesped = buscarHuesped(identificacion);
        listHotelHuesped.remove(huesped);

    }

    /**
     * metodo para agregar una reserva
     *
     * @param codigo           de la reserva
     * @param fechaRealizacion de la reserva
     * @param fechaEntrada     reserva
     * @param fechaSalida      reserva
     * @param estado           reserva
     * @param metodoPago       reserva
     * @param valorTotal       reserva
     * @return
     */

    public String hacerReserva(int codigo, String fechaRealizacion, String fechaEntrada, String fechaSalida, String estado, String metodoPago, double valorTotal, String huespedFrecuente) {
        String reservaHecha = "";
        Reserva reserva = new Reserva(codigo, fechaRealizacion, fechaEntrada, fechaSalida, estado, metodoPago, valorTotal, huespedFrecuente);
        listHotelReserva.add(reserva);
        reservaHecha = "su reserva fue hecha exitosamente";
        return reservaHecha;
    }

    /**
     * metodo para buscar una reserva
     * @param codigo de la reserva
     * @return
     */

    public Reserva buscarReserva(int codigo) {

        Reserva encontrada = null;
        for (int i = 0; i < listHotelReserva.size(); i++) {

            Reserva reserva = listHotelReserva.get(i);
            if (reserva.getCodigo() == codigo) {
                encontrada = reserva;
                break;
            }

        }
        return encontrada;


    }

    /**
     * metodo para eliminar una reserva
     * @param codigo
     */

    public void eliminarReserva(int codigo){

        Reserva reserva= buscarReserva(codigo);
        listHotelReserva.remove(reserva);
    }

    /**
     * metodo parae crear una habitacion en el hotel
     * @param numHabitacion de la habitacion
     * @param tipo de la habitacion
     * @param capacidadMax dela habitacion
     * @param precioNoche de la habitacion
     * @param estaDisponible de la habitacion
     * @return
     */
    public boolean crearHabitacion(int numHabitacion, String tipo, int capacidadMax, double precioNoche, String estaDisponible){
        boolean existe = false;
        Habitacion habitacion = buscarHabitacion(numHabitacion);
        if (habitacion == null) {
            Habitacion habit = new Habitacion(numHabitacion,tipo,capacidadMax,precioNoche,estaDisponible);
            listHotelHabitacion.add(habit);
            existe = true;

        }
        return existe;
    }

    /**
     * metodo para buscar una habitacion en el hotel
     * @param numHabitacion de la habitacion
     * @return
     */
    public Habitacion buscarHabitacion(int numHabitacion) {
        Habitacion encontrada = null;
        for (int i = 0; i<listHotelHabitacion.size(); i++) {
            Habitacion habitacion = listHotelHabitacion.get(i);
            if (habitacion.getNumHabitacion() == numHabitacion) {
                encontrada = habitacion;
                break;
            }
        }
        return encontrada;
    }

    /**
     * metodo para eliminar una habitacion del registro del hotel
     * @param numHabitacion de la habitacion
     */
    public void eliminarHabitacion(int numHabitacion) {
        Habitacion habitacion = buscarHabitacion(numHabitacion);
        listHotelHabitacion.remove(habitacion);
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public List<Huesped> getListHotelHuesped() {
        return listHotelHuesped;
    }

    public void setListHotelHuesped(List<Huesped> listHotelHuesped) {
        this.listHotelHuesped = listHotelHuesped;
    }

    public List<Reserva> getListHotelReserva() {
        return listHotelReserva;
    }

    public void setListHotelReserva(List<Reserva> listHotelReserva) {
        this.listHotelReserva = listHotelReserva;
    }

    public List<Habitacion> getListHotelHabitacion() {
        return listHotelHabitacion;
    }

    public void setListHotelHabitacion(List<Habitacion> listHotelHabitacion) {
        this.listHotelHabitacion = listHotelHabitacion;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre =" + nombre + "\n" +
                "NIT =" + NIT + "\n" +
                "telefono =" + telefono + "\n" +
                "pagina web =" + paginaWeb + "\n" +
                "direccion = " + direccion + "\n" +
                "}";
    }
}


