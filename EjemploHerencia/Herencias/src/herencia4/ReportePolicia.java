/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String c) {
        codigo = c; 
    }
   
    public double obtenerPromedioMatriculas() {
        return promedioEdades;
    }

    public void setPromedioMatriculas() {
       for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades
                    + lista.get(i).getEdad();
        }
       promedioEdades = promedioEdades / lista.size();
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public void setLista(ArrayList<Policia> lista) {
        this.lista = lista;
    }
    @Override
    public String toString() {
        String cadena = String.format("\nCodigo Policia: %s\n",
                codigo);
        for (int i = 0; i < obtenerLista().size(); i++) {          
            cadena = cadena + lista.get(i);           
        }
        setPromedioMatriculas();
        cadena = String.format("%s\nEl total del promedio de Edades es: %.2f\n",cadena,
                obtenerPromedioMatriculas());
        return cadena;
    }
}
