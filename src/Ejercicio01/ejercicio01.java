package Ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		System.out.println("Escriba la presi�n (baja, media alta o muy alta)");
		String presion=entrada.nextLine();
		System.out.println("Escriba la humedad (baja, media alta o muy alta)");
		String humedad= entrada.nextLine();
		System.out.println("Escriba la probabilidad de lluvia (baja, media alta o muy alta)");
		String probabilidad= entrada.nextLine();

		if(presion.equals("baja")&& humedad.equals("alta")&&probabilidad.equals("muy alta")) {
			System.out.println("Llover�");
		}else if(presion.equals("baja")&& humedad.equals("media")&&probabilidad.equals("alta")) {
			System.out.println("Llover�");
		}else if(presion.equals("baja")&& humedad.equals("baja")&&probabilidad.equals("media")) {
			System.out.println("Llover�");
		}else if(presion.equals("media")&& humedad.equals("media")&&probabilidad.equals("media")) {
			System.out.println("D�a tormentoso, llover�, har� sol e incluso har� fr�o");
		}else if(probabilidad.equals("baja")) {
			System.out.println("Llover� y har� fr�o");
		}else if(presion.equals("baja")&& humedad.equals("alta")&&probabilidad.equals("baja")) {
			System.out.println("Har� sol");	
		}else if(presion.equals("baja")&& humedad.equals("media")&&probabilidad.equals("media")) {
			System.out.println("Har� sol");
		}else if(presion.equals("baja")&& humedad.equals("alta")&&probabilidad.equals("media")) {
			System.out.println("Har� sol");
		}else if(probabilidad.equals("alta")) {
			System.out.println("Har� sol");
		}else if(presion.equals("baja")&& humedad.equals("alta")&&probabilidad.equals("alta")) {
			System.out.println("Har� fr�o");
		}else if(presion.equals("baja")&& humedad.equals("media")&&probabilidad.equals("alta")) {
			System.out.println("Har� fr�o");
		}else if(presion.equals("media")&& humedad.equals("alta")&&probabilidad.equals("alta")) {
			System.out.println("Har� fr�o");
		}else {
			System.out.println("Alg�n dato err�neo");
		}
	}
}
