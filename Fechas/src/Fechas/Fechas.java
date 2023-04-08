package Fechas;


import java.util.Scanner;
import java.lang.*;

public class Fechas {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner(System.in);
		Scanner teclado1= new Scanner(System.in);
		String fecha1 = "20/10/2016";
		String fecha2 = "20/10/2016";
		 boolean correcto = false;
		 int dia1 = 0;
		 int mes1 = 0;
		 int ano1 = 0;
		 int dia2 = 0;
		 int mes2 = 0;
		 int ano2 = 0;
		 		 
	       do{
	    	    System.out.println("Ingresar fechas de nacimiento de dos pesonas");
	   		
	  		    System.out.println("Ingrese Fecha en este formato 20/10/2016 Persona 1: ");
	  		    fecha1=teclado.next();
	  		   // Validando que el largo del string sea de 10 caracteres
	  		    // y que las posiciones que no tiene / sean numeros y el otro sea /
	 	       if (fecha1.length() == 10)
	 	       	    if ((fecha1.substring(0,2)).matches("[0-9]*") & (fecha1.substring(2,3)).matches("/") & (fecha1.substring(3,5)).matches("[0-9]*") & (fecha1.substring(5,6)).matches("/") & (fecha1.substring(6,10)).matches("[0-9]*")) {
	 	    	        correcto=true;
	 	    	        } else {
	 	    	        correcto=false;
	 	    	       //System.out.println("El número introducido es " + fecha1.substring(0,2) + fecha1.substring(3,5) + fecha1.substring(6,10));
	 	    	        System.out.println("Repite de nuevo");
	 	    	    }

	 	    	    }while(correcto==false);
	            
	      	   
	    // se guarda en variables numericos cada substring
 	       String sSubCadena = fecha1.substring(0,2);
 	       dia1 = Integer.parseInt(sSubCadena); 
 	      
 	       String sSubCadena1 = fecha1.substring(3,5);
 	       mes1 = Integer.parseInt(sSubCadena1); 
 	    
 	       String sSubCadena2 = fecha1.substring(6,10);
 	       ano1 = Integer.parseInt(sSubCadena2); 
 	      
	    
 	      boolean correcto2 = false;
	 		 
	       do{
	    	     		
	  		    System.out.println("Ingrese Fecha en este formato 20/10/2016 Persona 2: ");
	  		    fecha2=teclado1.next();
	  		   
	  		  if (fecha2.length() == 10)
	 	       	    if ((fecha2.substring(0,2)).matches("[0-9]*") & (fecha2.substring(2,3)).matches("/") & (fecha2.substring(3,5)).matches("[0-9]*") & (fecha2.substring(5,6)).matches("/") & (fecha2.substring(6,10)).matches("[0-9]*")) {
	 	    	        correcto2=true;
	 	    	        } else {
	 	    	        correcto2=false;
	 	    	       System.out.println("El número introducido es " + fecha2.substring(0,2) + fecha2.substring(3,5) + fecha2.substring(6,10));
	 	    	        System.out.println("Repite de nuevo");
	 	    	    }

	 	    	    }while(correcto2==false);
	       
	      	   
	    // extrae de string el dia
	       String sSubCadena3 = fecha2.substring(0,2);
	       dia2 = Integer.parseInt(sSubCadena3); 
	      
	       String sSubCadena4 = fecha2.substring(3,5);
	       mes2 = Integer.parseInt(sSubCadena4); 
	    
	       String sSubCadena5 = fecha2.substring(6,10);
	       ano2 = Integer.parseInt(sSubCadena5); 
	       
	      // se comparan los años, luego meses y dias
	       
	      if(ano1==ano2 &&	mes1==mes2 && dia1==dia2)
	    	  	System.out.print("Tienen la misma edad.");
	      else 
	    	  if(ano1>ano2)
	    	      System.out.print("Persona 2 es mayor  ");
	    	  else
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




    

