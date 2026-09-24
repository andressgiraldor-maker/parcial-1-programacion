package modelHotel;

public class ServicioAdicional {

    // atributos de la clase

    public int codigo;
    public String nombre;
    public String descripcion;
    public double precio;
    public String disponibilidad;

    // relaciones
    private Reserva reserva;

    /**
     * metodo constructor de la clase ServicioAdicional
     *
     * @param codigo
     * @param nombre
     * @param descripcion
     * @param precio
     * @param disponibilidad
     */

    public ServicioAdicional(int codigo, String nombre, String descripcion, double precio, String disponibilidad) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public String toString() {
        return "ServicioAdicional{" +
                "codigo =" + codigo + "\n" +
                "nombre =" + nombre + "\n" +
                "descripcion =" + descripcion + "\n" +
                "precio = " + precio + "\n" +
                "disponibilidad =" + disponibilidad + "\n";
    }

}


