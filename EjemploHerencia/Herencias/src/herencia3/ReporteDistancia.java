/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class ReporteDistancia extends Reporte {

    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;

    public ReporteDistancia(String nombre, String carrera, String ciclo) {
        super(nombre, carrera, ciclo);

    }

    public void establecerLista(ArrayList<EstudianteDistancia> listado) {
        lista = listado;
    }

    public void establecerTotalMatriculasDistancia() {

        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia
                    + lista.get(i).obtenerMatriculaDistancia();
        }
    }

    public ArrayList<EstudianteDistancia> obtenerLista() {
        return lista;
    }

    public double obtenerTotalMatriculasDistancia() {
        return totalMatriculaDistancia;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\nCarrera: %s \n"
                + "Ciclo: %s\n",
                nombre,
                carrera,
                ciclo);
        for (int i = 0; i < obtenerLista().size(); i++) {
            lista.get(i).calcularMatriculaDistancia();
            cadena = cadena + lista.get(i);
            /*cadena = String.format("%s\n%d)\nNombre: %s\n"
                    + "Apellido: %s\n"
                    + "Identificación: %s\n"
                    + "Edad: %s\n"
                    + "Numero de Asignaturas: %d\n"
                    + "Costo de Asignaturas: %.2f\n"
                    + "Valor de la Matricula: %.2f\n",
                    cadena, i + 1,
                    obtenerLista().get(i).obtenerNombresEstudiante(),
                    obtenerLista().get(i).obtenerApellidoEstudiante(),
                    obtenerLista().get(i).obtenerIdentificacionEstudiante(),
                    obtenerLista().get(i).obtenerEdadEstudiante(),
                    obtenerLista().get(i).obtenerNumeroAsignaturas(),
                    obtenerLista().get(i).obtenerCostoAsignatura(),
                    obtenerLista().get(i).obtenerMatriculaDistancia());
*/
        }
        cadena = String.format("%s\nEl total de matriculas es: %.2f\n",cadena,
                obtenerTotalMatriculasDistancia());
        return cadena;
    }

}
