/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author camilo.rodriguez
 */
public class Empleado extends Persona implements Serializable{
    
    private String codigoEmpleado;

    private String departamento;

    /**
     * Get the value of departamento
     *
     * @return the value of departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Set the value of departamento
     *
     * @param departamento new value of departamento
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Get the value of codigoEmpleado
     *
     * @return the value of codigoEmpleado
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Set the value of codigoEmpleado
     *
     * @param codigoEmpleado new value of codigoEmpleado
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public Empleado(String codigoEmpleado, String departamento, String Nombre, String direccion, int edad) {
        super(Nombre, direccion, edad);
        this.codigoEmpleado = codigoEmpleado;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "codigoEmpleado=" + codigoEmpleado + super.toString() + ", departamento=" + departamento;
    }

}
