/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Simulacro;

/**
 *
 * @author samue
 */
public enum CategoriaEmpleado {
    
    //CLase Enum con su categoria y su complemento
    INICIAL("Categoria Básica",50),MEDIA("Categoria Media",70),AVANZADA("Categoría Profesional",100);
    
    
    
      private String categoria;
      private int complemento;

    private CategoriaEmpleado(String categoria, int complemento) {
        this.categoria = categoria;
        this.complemento = complemento;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getComplemento() {
        return complemento;
    }
      
      
      
}
