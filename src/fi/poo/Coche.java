/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author halley Mendoza
 * clase que construye coches
 */
public class Coche {
    private String color;
    private String marca;
    private String placa;
    
    /**
     * Constructor vacio 
     */
    public Coche(){
    }
    /**
     * 
     * @param color  color del coche
     * @param marca  marca del coche
     * @param placa  placa del coche  
     */
    public Coche (String color, String marca, String placa) {
       this.color = color ;
       this. marca = marca;
       this. placa = placa;
    }
    /**
     * Metodo que establece el color del coche
     * @return color
     */

    public String getColor() {
        return color;
    }
    /**
     * Metodo que establece el color
     * @param color nuevo color del coche
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Metodo que devuelve la marca del coche
     * @return marca
     */
    public String getMarca() {
        return marca;
    }
    /**
    * Establece la marca del coche 
    *@param marca nueva marca del coche 
    */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
    *Obtiene la placa del coche
    *@ return placa del coche
    */

    public String getPlaca() {
        return placa;
    }
    /**
     * establece la placa del coche
     * @param placa del coche
     */

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    /**
     * Metodo que simula la accion de acelerar el coche 
     */
    public void acelerar (){
        System.out.println("acelerar");
    }
    /**
     * Metodo que simula la accion de frenar el coche
     */
    public void frenar(){
        System.out.println("frenar");
    }
    /**
     * Metodo que simula cargar cosas en el coche
     * @param tipo de carga y cantidad
     * @param carga que el coche transporta
     */
    public String carga (String cosa){
        System.out.println("cargando" + cosa);
        return cosa;
    }
    /**
     * Sobreescritura del metodo toString para mostrar los atributos del coche
     * @return Representacion en forma de cadena del coche
     */
    @Override 
    public String toString(){
        return "Coche{"+" color = "+ color +", marca= "+ marca +", placa= "+ placa +"}"; 
    
} }
