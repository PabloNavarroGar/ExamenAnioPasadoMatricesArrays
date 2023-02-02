/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Simulacro;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author samue
 */
public class RepasoSimulacroExamenMatricesArrarays {

    public static void main(String[] args) {
        Empresa e1 = new Empresa("Mercadona", "12345678");
        Empresa e2 = new Empresa("Lidl", "87654321");

        Trabajador t1 = new Trabajador("Pablo", "Navarro", LocalDate.of(2000, 1, 1), CategoriaEmpleado.INICIAL);
        Trabajador t2 = new Trabajador("Pepe", "Palomo", LocalDate.of(1999, 1, 1), CategoriaEmpleado.MEDIA);
        Trabajador t3 = new Trabajador("Obi-wan", "Laser", LocalDate.of(1998, 1, 1), CategoriaEmpleado.AVANZADA);
        Trabajador t4 = new Trabajador("Juan", "Alberto", LocalDate.of(1997, 1, 1), CategoriaEmpleado.MEDIA);
        Trabajador t5 = new Trabajador("Mario", "Vaquerizo", LocalDate.of(1996, 1, 1), CategoriaEmpleado.AVANZADA);
        Trabajador t6 = new Trabajador();
        
        t6 = new Trabajador(t3);
        
        
        //Contratacion de empresas 1 2 3 a A, 4 5 6 a B
        
        e1.contratar(t1);
        e1.contratar(t2);
        e1.contratar(t3);
        
        e2.contratar(t4);
        e2.contratar(t5);
        e2.contratar(t6);
        
        
            System.out.println("-----Empresa A----------");
        e1.imprimir();
        System.out.println("-----Empresa B--------");
        e2.imprimir();
        
        e2.despedir(t5);
        e1.contratar(t5);
        System.out.println("Depues de despedir a t5 y lo contranto en A....");
        e1.imprimir();
        //Ordenadcion de nombres
        e1.ordenarNombre();
        e2.ordenarNombre();
        System.out.println("Las listas estan ordenadas");
        System.out.println("-------------------");
        e1.imprimir();
        e2.imprimir();
        System.out.println("-----------------------");
       int posicion = e1.buscarNombre(t3);
       
        System.out.println("El trabajador "+t3.getNombre()+" esta en la posicion :"+posicion);
    }
}
