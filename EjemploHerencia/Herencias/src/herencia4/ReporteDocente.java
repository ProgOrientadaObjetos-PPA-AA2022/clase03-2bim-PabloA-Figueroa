/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String c) {
        codigo = c;
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    public void setPromedioSueldos() {
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos = promedioSueldos
                    + lista.get(i).getSueldo();
        }
        promedioSueldos = promedioSueldos / lista.size();
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    public void setLista(ArrayList<Docente> lista) {
        this.lista = lista;
    }
     @Override
    public String toString() {
        String cadena = String.format("\nCodigo Docente: %s\n",
                codigo);
        for (int i = 0; i < obtenerLista().size(); i++) {          
            cadena = cadena + lista.get(i);           
        }
        setPromedioSueldos();
        cadena = String.format("%s\nEl total del promedio de Edades es: %.2f\n",cadena,
                obtenerPromedioSueldos());
        return cadena;
    }
}
