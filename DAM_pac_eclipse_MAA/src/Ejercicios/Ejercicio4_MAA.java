package Ejercicios;

import java.util.*;

public class Ejercicio4_MAA {
	private static Random r = new Random();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String [] nombreEquipos = new String [20];
		int [] puntuacionEquipos = new int [20];
		String equipoGanador = "";
		String equipoPerdedor = "";
		int puntuacionMayor = 0;
		int puntuacionMenor = 0;
		int puntuacionTotal = 0;
		for (int i = 0; i < nombreEquipos.length; i++) {
			System.out.println("Nombre " + (i+1) + ":");
			String nombre = sc.nextLine();
			nombreEquipos[i] = nombre;
			puntuacionEquipos[i] = r.nextInt(65) + 35;
			puntuacionTotal += puntuacionEquipos[i];
			if (puntuacionMayor < puntuacionEquipos[i]) {
				equipoGanador = nombreEquipos[i];
				puntuacionMayor = puntuacionEquipos[i];
			}
			if (puntuacionMayor > puntuacionEquipos[i]) {
				equipoPerdedor = nombreEquipos[i];
				puntuacionMenor = puntuacionEquipos[i];
			}
		}
		for (int i = 0; i < puntuacionEquipos.length; i++) {
		System.out.println("Equipo " + nombreEquipos[i] + " con puntuacion " + puntuacionEquipos[i]);	
		}
		System.out.println("El equipo ganador es " + equipoGanador + " con una puntuacion de " + puntuacionMayor);
		System.out.println("El equipo perdedor es " + equipoPerdedor + " con una puntuacion de " + puntuacionMenor);
		System.out.println("La puntuacion media es de " + (puntuacionTotal/20));
	}

}
