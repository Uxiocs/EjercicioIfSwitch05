package Ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		System.out.println("Escriba la presión (baja, media alta o muy alta)");
		String presion=entrada.nextLine();
		System.out.println("Escriba la humedad (baja, media alta o muy alta)");
		String humedad= entrada.nextLine();
		System.out.println("Escriba la probabilidad de lluvia (baja, media alta o muy alta)");
		String probabilidad= entrada.nextLine();

		if(presion.equals("baja")&& humedad.equals("alta")&&probabilidad.equals("muy alta")) {
			System.out.println("Lloverá");
		}else if(presion.equals("baja")&& humedad.equals("media")&&probabilidad.equals("alta")) {
			System.out.println("Lloverá");
		}else if(presion.equals("baja")&& humedad.equals("baja")&&probabilidad.equals("media")) {
			System.out.println("Lloverá");
		}else if(presion.equals("media")&& humedad.equals("media")&&probabilidad.equals("media")) {
			System.out.println("Día tormentoso, lloverá, hará sol e incluso hará frío");
		}else if(probabilidad.equals("baja")) {
			System.out.println("Lloverá y hará frío");
		}else if(presion.equals("baja")&& humedad.equals("alta")&&probabilidad.equals("baja")) {
			System.out.println("Hará sol");	
		}else if(presion.equals("baja")&& humedad.equals("media")&&probabilidad.equals("media")) {
			System.out.println("Hará sol");
		}else if(presion.equals("baja")&& humedad.equals("alta")&&probabilidad.equals("media")) {
			System.out.println("Hará sol");
		}else if(probabilidad.equals("alta")) {
			System.out.println("Hará sol");
		}else if(presion.equals("baja")&& humedad.equals("alta")&&probabilidad.equals("alta")) {
			System.out.println("Hará frío");
		}else if(presion.equals("baja")&& humedad.equals("media")&&probabilidad.equals("alta")) {
			System.out.println("Hará frío");
		}else if(presion.equals("media")&& humedad.equals("alta")&&probabilidad.equals("alta")) {
			System.out.println("Hará frío");
		}else {
			System.out.println("Algún dato erróneo");
		}
	}
}
