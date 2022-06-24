/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c) {
        codigo = c; 
    }
   
    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public void setPromedioMatriculas() {
       for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas = promedioMatriculas
                    + lista.get(i).getMatricula();
        }
       promedioMatriculas = promedioMatriculas / lista.size();
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public void setLista(ArrayList<Estudiante> lista) {
        this.lista = lista;
    }
    @Override
    public String toString() {
        String cadena = String.format("\nCodigo: %s\n",
                codigo);
        for (int i = 0; i < obtenerLista().size(); i++) {          
            cadena = cadena + lista.get(i);           
        }
        setPromedioMatriculas();
        cadena = String.format("%s\nEl total del promedio matriculas es: %.2f\n",cadena,
                obtenerPromedioMatriculas());
        return cadena;
    }
}
