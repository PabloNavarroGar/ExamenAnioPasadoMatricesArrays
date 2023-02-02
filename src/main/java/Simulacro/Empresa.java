/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulacro;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author samue
 */
public class Empresa {
    //atributos

    private ArrayList<Trabajador> trabajadores;
    private final String nombre;
    private final String cif;

    public Empresa(String nombre, String cif) {

        this.nombre = nombre;
        this.cif = cif;
        this.trabajadores = new ArrayList<>();
    }

    public  void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("CIF: " + cif);
        System.out.println("Trabajadores: ");
        for (Trabajador trabajador : trabajadores) {
            System.out.println(trabajador.toString());
        }
    }

    public void contratar(Trabajador t) {
        trabajadores.add(t);
    }

    public boolean despedir(Trabajador t) {
        int indice = trabajadores.indexOf(t);
        if (indice != -1) {
            trabajadores.remove(indice);
            return true;
        } else {
            return false;
        }
    }

    public int[] buscarTodosNombre(String nombre) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < trabajadores.size(); i++) {
            if (trabajadores.get(i).getNombre().equals(nombre)) {
                indices.add(i);
            }
        }
        if (!indices.isEmpty()) {
            int[] result = new int[indices.size()];
            for (int i = 0; i < indices.size(); i++) {
                result[i] = indices.get(i);
            }
            return result;
        } else {
            return null;
        }
    }

    public void ordenarNombre() {
        trabajadores.sort((Trabajador t1, Trabajador t2) -> t1.getNombre().compareTo(t2.getNombre()));
    }

    public int buscarNombre(Trabajador t) {
        ordenarNombre();
        int derecha = 0;
        int izquierda = trabajadores.size() - 1;
        while (izquierda <= derecha) {
            int buscador = (izquierda + derecha) / 2;
            if (trabajadores.get(buscador).getNombre().equals(t.getNombre())) {
                return buscador;
            } else if (trabajadores.get(buscador).getNombre().compareTo(t.getNombre()) < 0) {
                izquierda = buscador + 1;
            }
      
        }
        return izquierda;
        
    
    }
     
}
