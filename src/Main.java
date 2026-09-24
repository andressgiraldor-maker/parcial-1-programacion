
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
                    7. 
                    8. 
                    9. 
                    10.
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
                hotel1.hacerReserva(codigo, fechaRealizacion, fechaEntrada, estado, metodoPago, fechaSalida, valorTotal);
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
            }
    }
}








}


