/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo10;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

    public EmpleadoAsalariado(double salarioSemanal, String primerNombre, String spellidoPaterno, String numeroSeguroSocial) {
        super(primerNombre, spellidoPaterno, numeroSeguroSocial);
        
        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("el salario semanal debe ser mayor a 0");
        }
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("Salario debe ser > 0.0");
        }
        this.salarioSemanal = salarioSemanal;
    }
    
    //calcula ingresos: sobreescribe el metodo abstracto ingreso en empleado
    //modificamos para implementar la 
    /*
    @Override
    public double ingresos(){
        return getSalarioSemanal();
    }
    */
    @Override
    public double obtenerMontoPago(){
        return getSalarioSemanal();
    }
    
    //devuelve representacion string de un objeto EmpleadoAsalariado
    @Override
    public String toString(){
        return String.format("Empleado asalariado: %s%n%s: $%,.2f", 
                super.toString(), "salario semanal", getSalarioSemanal());//obtenemos nombre apellido y etc de la clase empleado
    }
    
}
