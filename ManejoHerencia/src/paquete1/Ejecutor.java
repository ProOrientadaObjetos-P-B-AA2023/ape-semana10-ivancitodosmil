package paquete1;

import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<PrestamoAutomovil>prestamoautomovil= new ArrayList<>();
        ArrayList<PrestamoEducativo>prestamoeducativo= new ArrayList<>();
        boolean interruptor=true;

        while (interruptor) {
            try {
                System.out.println("Digite 1: Para Ingresar Datos de un Préstamo Para Automóvil");
                System.out.println("Digite 2: Para Ingresar Datos de un Préstamo Educativo");
                System.out.println("Digite 3: Para Visualizar los Pagos Mensuales a Realizar y Para Salir del Programa");
                int opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        Persona persona;
                        Persona garante1;
                        System.out.println("Cliente: Nombre, Apellido, Usuario");
                        persona = new Persona(entrada.next(), entrada.next(), entrada.next());
                        System.out.println("Garante: Nombre, Apellido, Usuario");
                        garante1 = new Persona(entrada.next(), entrada.next(), entrada.next());
                        System.out.println("Digite: Tiempo del Préstamo, Ciudad Préstamo, Tipo de Auto, Marca del Auto, Valor del Auto");
                        prestamoautomovil.add(new PrestamoAutomovil(persona, entrada.nextInt(), entrada.next(), entrada.next(), entrada.next(), garante1, entrada.nextDouble()));
                        break;
                    case 2:
                        Persona personaN2;
                        InstitucionEducativa institucion;
                        System.out.println("Cliente: Nombre, Apellido, Usuario");
                        personaN2 = new Persona(entrada.next(), entrada.next(), entrada.next());
                        System.out.println("Digite: Nombre Institución; Siglas de la Institución");
                        institucion = new InstitucionEducativa(entrada.next(), entrada.next());
                        System.out.println("Digite: Tiempo Préstamo, Ciudad Préstamo, Nivel Estudio, Valor Carrera");
                        prestamoeducativo.add(new PrestamoEducativo(personaN2, entrada.nextInt(), entrada.next(), entrada.next(), institucion, entrada.nextDouble()));
                        break;
                    case 3:
                        System.out.println("Préstamos de Automóviles");
                        for (PrestamoAutomovil prestamoautos : prestamoautomovil) {
                            prestamoautos.CalcularValorMensualPagoPrestamoAutomovil();
                            System.out.println(prestamoautos);
                        }
                        System.out.println("Préstamo Educativos");
                        for (PrestamoEducativo prestamocarrera : prestamoeducativo) {
                            prestamocarrera.CalcularValorMensualPagoPrestamoCarrera();
                            System.out.println(prestamocarrera);
                        }
                        interruptor = false;
                        break;
                }
            }catch (Exception err){
                System.out.println("Error en la Digitación de datos");

            }
        }
    }
}




