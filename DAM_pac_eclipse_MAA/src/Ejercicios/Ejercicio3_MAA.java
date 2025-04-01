package Ejercicios;

import java.util.*;

public class Ejercicio3_MAA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		double peso;
		double altura;
		String sexo;
		double velocidadInicial;
		double distanciaInicial;
		double caloriasQuemadasIniciales;
		// Preguntas iniciales
		System.out.println("Nombre y apellidos: ");
		nombre = sc.nextLine();
		System.out.println("Edad: ");
		edad = sc.nextInt();
		System.out.println("Peso: ");
		peso = sc.nextDouble();
		System.out.println("Altura: ");
		altura = sc.nextDouble();
		System.out.println("Sexo: ");
		sc.nextLine();
		sexo = sc.nextLine();
		System.out.println("Velocidad inicial: ");
		sc.nextLine();
		velocidadInicial = sc.nextDouble();
		System.out.println("Distancia inicial: ");
		distanciaInicial = sc.nextDouble();
		System.out.println("Calorias quemadas iniciales: ");
		caloriasQuemadasIniciales = sc.nextDouble();
		int caloriasTotales = 0;
		int distanciaTotal = 0;
		int velocidadTotal = 0;
		double indiceMasaCorporal = peso / altura;
		int velocidad;
		int distancia;
		int caloriasQuemadas;
		int velocidadMaxima = 0;
		int distanciaMaxima = 0;
		int caloriasMaxima = 0;
		// Sesiones
		for (int i = 0; i < 10; i++) {
			System.out.println("Velocidad en la sesion " + (i + 1));
			velocidad = sc.nextInt();
			velocidadTotal += velocidad;
			if (velocidad > velocidadMaxima) {
				velocidadMaxima = velocidad;
			}
			System.out.println("Distancia en la sesion " + (i + 1));
			distancia = sc.nextInt();
			distanciaTotal += distancia;
			if (distancia > distanciaMaxima) {
				distanciaMaxima = distancia;
			}
			System.out.println("Calorias en la sesion " + (i + 1));
			caloriasQuemadas = sc.nextInt();
			caloriasTotales += caloriasQuemadas;
			if (caloriasQuemadas > caloriasMaxima) {
				caloriasMaxima = caloriasQuemadas;
			}
		}
		// Ficha
		System.out.println("Hola " + nombre + " ,te presentamos la ficha de seguimiento de entrenamiento.");
		System.out.println("Edad: " + edad);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);
		System.out.println("Indice de masa corporal: " + indiceMasaCorporal);
		System.out.println("La media de entrenamiento en 10 sesiones es:");
		double velocidadMedia = velocidadTotal / 10;
		if (velocidadMedia > velocidadInicial) {
			System.out.println("Enhorabuena, tu velocidad es mayor a la inicial");
		}
		System.out.println("Velocidad media: " + velocidadMedia);
		double distanciaMedia = distanciaTotal / 10;
		if (distanciaMedia > distanciaInicial) {
			System.out.println("Enhorabuena, tu distancia es mayor a la inicial");
		}
		System.out.println("Velocidad media: " + distanciaMedia);
		double caloriasMedia = caloriasTotales / 10;
		if (caloriasMedia > caloriasQuemadasIniciales) {
			System.out.println("Enhorabuena, tus calorias son mayorores a las iniciales");
		}
		System.out.println("Velocidad media: " + caloriasMedia);
	}

}
