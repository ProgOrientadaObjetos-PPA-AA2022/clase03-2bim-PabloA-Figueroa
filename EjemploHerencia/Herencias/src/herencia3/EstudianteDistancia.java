
package herencia3;

public class EstudianteDistancia extends Estudiante{
    
    int numeroAsignaturas;
    double costoAsignatura;
    double matriculaDistancia;
    
    public EstudianteDistancia(String n, String ap, String iden, int e,
            int numAsg, double costoAsg){
        super(n, ap, iden, e);
        numeroAsignaturas = numAsg;
        costoAsignatura = costoAsg;
    }
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsignatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroAsignaturas * costoAsignatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsignatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }
    
    @Override
    public String toString(){
        String cadenaFinal = String.format("%s", super.toString());
        cadenaFinal = String.format("%s"
                + "Costo Asignatura: %.2f\n"
                + "Número de Asignaturas: %d\n"
                + "Total Matricula: %.2f\n",
                cadenaFinal,
                obtenerCostoAsignatura(),
                obtenerNumeroAsignaturas(),
                obtenerMatriculaDistancia());
        
        return cadenaFinal;
    }
    /* salida
----------------------
Reporte Distancia
Carrera: Derecho 
Ciclo: Sexto

Lista de Estudiantes

Nombre: Mario
Apellido: Mills
Identificación: 212233
Edad: 23
Costo Asignatura: 100,20
Número de Asignaturas: 1
Total Matricula: 100,20

Nombre: Joseph
Apellido: White
Identificación: 212234
Edad: 24
Costo Asignatura: 100,20
Número de Asignaturas: 5
Total Matricula: 501,00

Nombre: Catherine
Apellido: Reyes
Identificación: 212235
Edad: 25
Costo Asignatura: 100,20
Número de Asignaturas: 8
Total Matricula: 801,60


El total de matriculas es: 1402,80
*/

}
