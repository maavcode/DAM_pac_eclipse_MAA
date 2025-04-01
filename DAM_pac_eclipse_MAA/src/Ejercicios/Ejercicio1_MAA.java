package Ejercicios;

import java.util.*;

public class Ejercicio1_MAA {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Pregunta los datos
		System.out.println("Dime el salario del jefe:");
		double salarioJefe = sc.nextDouble();
		System.out.println("Dime el salario del encargado:");
		double salarioEncargado = sc.nextDouble();
		System.out.println("Dime el salario de los oficinistas:");
		double salarioOficinistas = sc.nextDouble();
		System.out.println("Dime el numero de oficinistas:");
		int numeroOficinistas = sc.nextInt();
		sc.nextLine(); // Salto de linea
		System.out.println("Estan los proyectos terminados? (s / n)");
		String respuesta = sc.nextLine();
		boolean proyectosTerminados = false;
		if (respuesta.toLowerCase().equals("s")) {
			proyectosTerminados = true;
		} else {
			System.out.println("Me lo tomare como un no");
			proyectosTerminados = false;
		}
		System.out.println("Dime el presupuesto de la empresa:");
		double presupuestoEmpresa = sc.nextDouble();
		// Empieza el programa
		auditoriaEmpresa(salarioJefe, salarioEncargado, salarioOficinistas, numeroOficinistas, proyectosTerminados, presupuestoEmpresa);
	}
	
	public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinistas, int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {
		boolean apto = true;
		// Comprobacion proyectos
		if (!proyectosTerminados) {
			System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
			return !apto;
		} else {
			double gastoAcumulado = salarioJefe + salarioEncargado + salarioOficinistas;
			if (gastoAcumulado > 20000) {
				System.out.println(" No ha pasado la auditoría ya que el gasto en personal es de " + gastoAcumulado + " y excede el límite mensual de 20.000 euros");
				return !apto;
			} else {
				if (presupuestoEmpresa > 100000) {
					System.out.println(" No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el límite establecido en 100.000 euros");
					return !apto;
				} else {
					System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
					return apto;
				}
			}
		} 
	}

}
