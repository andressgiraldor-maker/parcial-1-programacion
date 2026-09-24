package modelHotel;

import java.util.ArrayList;
import java.util.List;

public class Huesped {

    //Atrubitos de la clase Huesped
    public String nombre;
    public int identificacion;
    public int telefono;
    public String correoE;
    public String pais;

    //Relaciones de la clase Huesped
    private Hotel hotel;
    private List<Reserva> listHuespedReserva;

    /**
     * metodo constructor para la clase Huesped
     * @param nombre del huesped
     * @param identificacion del huesped
     * @param telefono del huesped
     * @param correoE del huesped
     * @param pais del huesped
     */
    public Huesped (String nombre, int identificacion, int telefono, String correoE, String pais){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.correoE = correoE;
        this.pais = pais;

        this.listHuespedReserva= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Reserva> getListHuespedReserva() {
        return listHuespedReserva;
    }

    public void setListHuespedReserva(List<Reserva> listHuespedReserva) {
        this.listHuespedReserva = listHuespedReserva;
    }

    @Override
    public String toString(){
        return "Huesped{" +
                "nombre =" + nombre + "\n" +
                "identificacion =" + identificacion + "\n" +
                "telefono =" + telefono + "\n" +
                "correoE =" + correoE + "\n" +
                "pais = " + pais + "\n" +
                "}";
    }
}
