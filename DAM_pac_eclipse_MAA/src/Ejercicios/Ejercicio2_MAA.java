package Ejercicios;

import java.util.*;

public class Ejercicio2_MAA {
	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		if (procesoSeleccion()) {
			System.out.println("Enhorabuena, pasaste la seleccion");
		} else {
			System.out.println("Quedas descartado del proceso de seleccion");
		}
	}
	
	public static boolean procesoSeleccion() {
		boolean apto = true;
		System.out.println("Indica tu edad:");
		int edad = sc.nextInt();
		if (edad > 40) {
			return !apto;
		} else {
			System.out.println("Indica tu nombre:");
			String nombre = sc.nextLine();
			sc.nextLine();
			System.out.println("Indica los anyos trabajados");
			int anyosTrabajados = sc.nextInt();
			System.out.println("Indica tu sueldo bruto anual anterior");
			double sueldoBruto = sc.nextDouble();
			if (sueldoBruto > 30000) {
				return !apto;
			} else {
				System.out.println("Introduce el importe de tus ultimas 5 nominas");
				double sumaNominas = 0;
				for (int i = 0; i < 5; i++) {
					System.out.println("Nomina " + (i+1)+ ":");
					sumaNominas += sc.nextDouble();
				}
				if (sumaNominas / 5 > 2500) {
					double sueldoBrutoNuevo = sueldoBruto + (0.05 * sueldoBruto);
					System.out.println("Se ha subido el sueldo a: " + sueldoBrutoNuevo);
				} else {
					double sueldoBrutoNuevo = sueldoBruto + (0.10 * sueldoBruto);
					System.out.println("Se ha subido el sueldo a: " + sueldoBrutoNuevo);
				}
				return apto;
			}
		}
	}

}
