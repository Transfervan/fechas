package Fechas;


import java.util.Scanner;

public class Fechas {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner(System.in);
		String fecha1 = "20-10-2016";
		String fecha2 = "20-10-2016";
		   System.out.println("Ingresar fechas de nacimiento de dos pesonas");
		
		    System.out.println("Ingrese Fecha en este formato 20-10-2016 Persona 1: ");
	       fecha1=teclado.next();
	        
	      	   
	       
	       // extrae de string el dia
	       String sSubCadena = fecha1.substring(0,2);
	    // convierte string en integro
	       int dia1 = Integer.parseInt(sSubCadena); 
	      
	       String sSubCadena1 = fecha1.substring(3,5);
	     
	       int mes1 = Integer.parseInt(sSubCadena1); 
	       String sSubCadena2 = fecha1.substring(6,10);
	      
	       int ano1 = Integer.parseInt(sSubCadena2); 
	       
	       System.out.println("Ingrese Fecha en este formato 20-10-2016 Persona 2: ");
	       fecha2=teclado.next();
	       
	       // extrae de string el dia
	       String sSubCadena3 = fecha2.substring(0,2);
	    // convierte string en integro
	       int dia2 = Integer.parseInt(sSubCadena3); 
	       
	       String sSubCadena4 = fecha2.substring(3,5);
	       
	       int mes2 = Integer.parseInt(sSubCadena4); 
	       String sSubCadena5 = fecha2.substring(6,10);
	       
	       int ano2 = Integer.parseInt(sSubCadena5); 
	       
	      if(ano1==ano2 &&	mes1==mes2 && dia1==dia2)
	    	  	System.out.print("Tienen la misma edad");
	      else 
	    	  if(ano1>ano2)
	    	      System.out.print("Persona 2 es mayor  ");
	    	  if(ano2>ano1)   
	    	      System.out.print("Persona 1 es mayor  ");     
	    	  		if(mes1>mes2)
		    	      System.out.print("Persona 2 es mayor  ");
	      			if(mes2>mes1)   
		    	      System.out.print("Persona 1 es mayor  ");
	      			if(dia1>dia2)
		    	      System.out.print("Persona 2 es mayor  ");
	      			if(dia2>dia1)   
		    	      System.out.print("Persona 1 es mayor  ");
	      			
	    	 
}


    }

