/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuelajava;

import datos.Estudiante;
import datos.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class Metodos {
    
    private Estudiante student;
    private Funcionario funcionario;

    public Metodos() {
        student = null;
        funcionario = null;
    }
    
    
    
    public Estudiante getStudent() {
        return this.student;
    }

    public void setStudent(Estudiante student) {
        this.student = student;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String horario(int studentOrFuncionario){
        if(studentOrFuncionario == 1){
           return getStudent().getSchedule();
        } else {
            return getFuncionario().getSchedule();
        }
    }

    public String transport(int studentOrFuncionario){
        if(studentOrFuncionario == 1){
           return getStudent().getTypeTransport();
        } else {
            return getFuncionario().getTypeTransport();
        }
    }
    
    public String imprimir(int studentOrFuncionario){
        if(studentOrFuncionario == 1){
           return getStudent().imprimir();
        } else {
            return getFuncionario().imprimir();
        }
    }
    
}
