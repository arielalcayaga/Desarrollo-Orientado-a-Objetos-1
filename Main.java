package app;


import model.Direccion;
import model.Empleado;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Juan Soto", 44, true, "12345678-9",
                new Direccion("Los Pinos", 1234, "Maipú", "Santiago"),
                "Contador", "Jefe de Contabilidad", 1234567 );

        System.out.println(empleado1);


        Empleado empleado2 = new Empleado("María Retamal", 28, false, "23456789-k",
                new Direccion("El Conquistador", 2468, "Independencia", "Santiago"),
                "Guardia", "Sub alterno", 246812 );

        System.out.println(empleado2);


        Empleado empleado3 = new Empleado("Pedro Pascal", 60, true, "34567891-3",
                new Direccion("Caupolicán", 9876, "Cerrillos", "Santiago"),
                "Programador", "Jefe de desarrollo de software", 4789012 );

        System.out.println(empleado3);
    }
}