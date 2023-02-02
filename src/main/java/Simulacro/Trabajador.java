/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulacro;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author samue
 */
public class Trabajador {

    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private CategoriaEmpleado categoria;
   

    public Trabajador(String nombre, String apellidos, LocalDate fechaNacimiento, CategoriaEmpleado categoria) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        //metodo para controlar la edad con la expecion
        try {
            if (ChronoUnit.YEARS.between(fechaNacimiento,LocalDate.now() ) <= 16) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException iae) {

            System.out.println("No se puede poner un trabajador menor de 16 años");
        }

        this.categoria = categoria;
    }
    //Constructor Copia
    public Trabajador(Trabajador origen) {
        this.nombre =origen.nombre;
        this.apellidos = origen.apellidos;
        this.fechaNacimiento = origen.fechaNacimiento;
        //metodo para controlar la edad con la expecion
        try {
            if (ChronoUnit.YEARS.between(fechaNacimiento,LocalDate.now() ) <= 16) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException iae) {

            System.out.println("No se puede poner un trabajador menor de 16 años");
        }

        this.categoria =origen. categoria;
        
    }

    public Trabajador() {
    }
     
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public CategoriaEmpleado getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEmpleado categoria) {
        this.categoria = categoria;
    }

   

     //Metodo para calcular el suledo en bas ea su complemento
    public double calcularSueldo() {

        double sueldoBase = 1707;
        return sueldoBase + this.categoria.getComplemento();

    }
    
    public static LocalDate fechaJubilacion(Trabajador trabajador){
        //Scao su edad actual
         int fechaActual = LocalDate.now().getDayOfYear();
         int edad;
         int anioParaJugilarse;
        
        edad=LocalDate.now().getYear() - trabajador.getFechaNacimiento().getDayOfYear();//Objeto su uedad
        anioParaJugilarse = 66-edad;
        LocalDate jubilacion = trabajador.getFechaNacimiento().plusYears(edad+anioParaJugilarse);
         
        return jubilacion;
       
        
        
        
    }
    
    
     @Override
    public String toString() {
        return nombre + " " + apellidos + "\t F.Nac: " + fechaNacimiento + "\nCategoría: " + categoria +
               "\nFecha Jubilación: " + fechaJubilacion(this) + "\nSueldo actual: " + calcularSueldo();
    }
    
}
