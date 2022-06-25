package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide cuando termina el proceso
        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador;
        boolean bandera = true;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        //Uso un ciclo while, con la variable "bandera" para que de esa forma 
        //poder controlar cuando el usuario quiera salir del programa

        while (bandera) {
            //Se pregunta al Usuario que el tipo de "Estudiante" que quiere Ingresar
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + "Ingrese (2) para Estudiante Distancia");
            tipoEstudiante = entrada.nextInt();
            entrada.nextLine();
            //Se pide que el usuario Ingrese los valores a asignar a Estudiante
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();
            
            //En caso De que ingrese 1, el programa realizara el siguiente proceso 
            //Porque tipoEstudiante es la variable que almacena el valor que 
            //ingreso el Usuario
            if (tipoEstudiante == 1) {
                
                //Se declara un Objeto de tipo EstudiantePresencial
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                //Se pide que el usuario Ingrese los valores a asignar a EstudiantePresencial
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                //Se envia atraves de los metodos de la super clase los valores 
                //obtenidos antes a sus respectivos atributos
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                //Se envia los valores a los atributos de la clase EstudiantePresencial
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                //Se agrega al ArrayList "estudiantes" el objeto estudianteP
                estudiantes.add(estudianteP);

            } else {
                //Se declara un Objeto de tipo EstudianteDistancia
                EstudianteDistancia estudianteD = new EstudianteDistancia();
                //Se pide que el usuario Ingrese los valores a asignar a EstudianteDistancia
                System.out.println("Ingrese el número de asignaturas");
                numeroAsigs = entrada.nextInt();
                System.out.println("Ingrese el costo de cada cada asignatura");
                costoAsig = entrada.nextDouble();
                //Se envia atraves de los metodos de la super clase los valores 
                //obtenidos antes a sus respectivos atributos
                estudianteD.establecerNombresEstudiante(nombresEst);
                estudianteD.establecerApellidoEstudiante(apellidosEst);
                estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                estudianteD.establecerEdadEstudiante(edadEst);
                //Se envia los valores a los atributos de la clase EstudiantePresencial
                estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                estudianteD.establecerCostoAsignatura(costoAsig);
                //Se agrega al ArrayList "estudiantes" el objeto estudianteD
                estudiantes.add(estudianteD);

            }
            //Metodo para controlar cuando el usuario quiera dejar de ingresar datos
            entrada.nextLine();
            System.out.println("Ingrese Si para seguir ingresando Datos");
            String condi = entrada.nextLine();
            if (condi.equals("S")||condi.equals("s")) {
                bandera = false; // Si "bandera" es falso, entonces sale del programa
            }
        }
        //Metodo para presentar los valores almacenados dentro del ArrayList
        for (int i = 0; i < estudiantes.size(); i++) {
            
            estudiantes.get(i).calcularMatricula();/* LLama al metodo 
            calcularMatricula de la clase del objeto que este almacenada dentro del arrayList
            en ese momento, es decir si en la posicion 1 esta un onjeto de tipo 
            EstudiantePresencial, su metodo calcularMatricula realizara el proceso
            de la multiplicacion de numeroCreditos x costoCredito, en cambio, 
            si en la posicion 1 se encuentra un objeto del tipo EstudianteDistancia
            relizara la multiplicacion de numeroAsignaturas x costoAsignatura.
            */
            System.out.printf("Datos Estudiante\n"
                    + "%s\n", 
                    estudiantes.get(i));/*Presenta el toString del objeto en la
            posicion de (i).
            */
        }
    }

}
