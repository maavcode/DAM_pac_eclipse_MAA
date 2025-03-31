package Ejercicios;

public class Ejercicio1_MAA {

	public static void main(String[] args) {
		auditoriaEmpresa(2500, 1800, 1300, 10, true, 75000);
	}
	
	public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas, int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {
		boolean apto = false;
		// Comprobacion proyectos
		if (!proyectosTerminados) {
			System.out.println("No ha pasado la auditor�a ya que no ha terminado losproyectos acordados");
			return !apto;
		} else {
			double gastoAcumulado = salarioJefe + salarioEncargado + salarioOficinistas;
			if (gastoAcumulado > 20000) {
				System.out.println(" No ha pasado la auditor�a ya que el gasto en personal es de " + gastoAcumulado + " y excede el l�mite mensual de 20.000 euros");
				return !apto;
			} else {
				if (presupuestoEmpresa > 100000) {
					System.out.println(" No ha pasado la auditor�a ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el l�mite establecido en 100.000 euros");
					return !apto;
				} else {
					System.out.println("Enhorabuena!! Ha pasado la auditor�a, nos vemos el a�o que viene");
					return apto;
				}
			}
		} 
	}

}
