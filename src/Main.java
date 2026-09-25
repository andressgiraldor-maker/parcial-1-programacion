
import modelHotel.Huesped;
import modelHotel.Reserva;
import modelHotel.Habitacion;
import modelHotel.ServicioAdicional;
import modelHotel.Hotel;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Hotel hotel1 = new Hotel("Hiltom", "el NIT es: 888", "Cartagena 3N", 350480, "Hiltom.com");

        int opcion = 0;
        while (opcion != 10) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    
                    
                    1. Agregar un huesped
                    2. Buscar un huesped
                    3. Eliminar un huesped
                    4. Hacer una reserva
                    5. Buscar una reserva
                    6. Eliminar una reserva
                    7. agregar una habitacion
                    8. buscar una habitacion                
                    9. elimiar una habitacion
                    10.agregar un servicio adicional
                    11.buscar un servicio adicional
                    12.cancelar un servcio adicional
                    13.calcular el valor total de la reserva
                    """));


            if (opcion == 1) {
                String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre");
                int identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el número de identifiación"));
                int telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el número de telefono"));
                String correoE = JOptionPane.showInputDialog(null, "ingrese el correo electrónico");
                String pais = JOptionPane.showInputDialog(null, " ingrese el país de procedencia");
                hotel1.agregarHuesped(nombre, identificacion, telefono, correoE, pais);
                JOptionPane.showMessageDialog(null, "el huesped fue agreagdo exitosamente");
            } else if (opcion == 2) {
                int identificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrse el numero de identificación"));
                Huesped huesped = hotel1.buscarHuesped(identificacion);
                if (huesped != null) {
                    JOptionPane.showMessageDialog(null, "huesped encontrado" + "\n" + huesped.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "el huesped no existe");

                }

            } else if(opcion==3) {
                int identificacion= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la identificación"));
                 hotel1.eliminarHuesped(identificacion);
                JOptionPane.showMessageDialog(null, "el huesped fue eliminado");



            } else if(opcion==4) {
                int codigo= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el codigo"));
                String fechaRealizacion= JOptionPane.showInputDialog(null, " ingrese la fecha de realizacion");
                String fechaEntrada= JOptionPane.showInputDialog(null, " ingrese la fecha de entrada");
                String estado= JOptionPane.showInputDialog(null, " ingrese el estado");
                String metodoPago= JOptionPane.showInputDialog(null, " ingrese el metodo de pago");
                String fechaSalida= JOptionPane.showInputDialog(null, " ingrese la fecha de salida");
                double valorTotal = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor total"));
                String huespedFrecuente = JOptionPane.showInputDialog(null, "el huesped es fecuente");
                hotel1.hacerReserva(codigo, fechaRealizacion, fechaEntrada, estado, metodoPago, fechaSalida, valorTotal, huespedFrecuente);
                JOptionPane.showMessageDialog(null, " la reserva fue hecha exitosamente");


        } else if(opcion==5){
                int codigo= Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese el codigo"));
                Reserva reserva = hotel1.buscarReserva(codigo);
                if(reserva!=null){
                    JOptionPane.showMessageDialog(null, "reserva encontrada ");

                }else{
                    JOptionPane.showMessageDialog(null, "la reserva no existe");
                }
            } else if(opcion==6){
                int codigo= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el codigo"));
                hotel1.eliminarReserva(codigo);
                JOptionPane.showMessageDialog(null, "la reserva fue eliminada exitosamente ");
            }else if(opcion==7){
                int numHabitacion = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de la habitacion"));
                String tipo = JOptionPane.showInputDialog(null, "ingrese el tipo de la habitacion");
                int capacidadMax = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la capacidad maxima de la habitacion"));
                double precioNoche = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el precio por noche de la habitacion"));
                String estaDisponible = JOptionPane.showInputDialog(null,"la habiatacion esta disponible");
                hotel1.crearHabitacion(numHabitacion, tipo, capacidadMax, precioNoche, estaDisponible);
                JOptionPane.showMessageDialog(null, "la habitacion fue creada con exito");
            }else if(opcion == 8) {
                int numHabitacion = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrse el numero de habitacion"));
                Habitacion habitacion = hotel1.buscarHabitacion(numHabitacion);
                if (habitacion != null) {
                    JOptionPane.showMessageDialog(null, "habitacion encontrada" + "\n" + habitacion.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "la habitacion no existe");

                }
            }else if(opcion == 9){
                int numHabitacion= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero de habitacion que desea eliminar"));
                hotel1.eliminarHabitacion(numHabitacion);
                JOptionPane.showMessageDialog(null, "la habitacion fue eliminada exitosamente ");
            } else if (opcion == 10) {
                Reserva reserva = hotel1.buscarReserva(Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el codigo de la reserva")));
                int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el codigo del servcio"));
                String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del servicio");
                String descripcion = JOptionPane.showInputDialog(null, "ingrese la descripcion del servicio");
                double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el precio del servicio"));
                String disponibilidad = JOptionPane.showInputDialog(null, "el servcio esta disponible?");
                reserva.agregarServicioAdicional (codigo, nombre, descripcion, precio, disponibilidad);
                JOptionPane.showMessageDialog(null, "el servicio adicional fue agregado exitosamente");
            }else if(opcion == 11) {
                Reserva reserva = hotel1.buscarReserva(Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el codigo de la reserva")));
                int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrse el codigo del servicio"));
                reserva.buscarServicio(codigo);
                if (reserva != null) {
                    JOptionPane.showMessageDialog(null, "reserva encontrada" + "\n" + reserva.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "la reserva no existe");
                }

            }else if (opcion == 12) {
                Reserva reserva = hotel1.buscarReserva(Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el codigo de la reserva")));
                int codigo= Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el codigo del servicio"));
                reserva.cancelarServicioAdicional(codigo);
                JOptionPane.showMessageDialog(null, "el servicio fue eliminado exitosamente ");
            } else if (opcion == 13) {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo de la reserva"));
            Reserva reserva = hotel1.buscarReserva(codigo);

            if (reserva != null) {
                int cantidadNoches = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de noches"));
                String respuesta = JOptionPane.showInputDialog("es huesped frecuente? (si/no)");

                double total = reserva.calcularValorTotal(cantidadNoches, respuesta);
                JOptionPane.showMessageDialog(null, "el valor total de la reserva es: " + total);
            } else {
                JOptionPane.showMessageDialog(null, "la reserva no existe");
            }
        }



        }
}








}


