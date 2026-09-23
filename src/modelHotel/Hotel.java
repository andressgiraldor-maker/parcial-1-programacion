package modelHotel;

import java.util.List;

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
     * @param nombre del hotel
     * @param NIT del hotel
     * @param direccion del hotel
     * @param telefono del hotel
     * @param paginaWeb del hotel
     */
    public Hotel (String nombre, String NIT, String direccion, int telefono, String paginaWeb){
        this.nombre = nombre;
        this.NIT = NIT;
        this.direccion = direccion;
        this.telefono = telefono;
        this.paginaWeb = paginaWeb;

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
    public String toString(){
        return "Hotel{" +
                "nombre =" + nombre + "\n" +
                "NIT =" + NIT + "\n" +
                "telefono =" + telefono + "\n" +
                "pagina web =" + paginaWeb + "\n" +
                "direccion = " + direccion + "\n" +
                "}";
    }
}
