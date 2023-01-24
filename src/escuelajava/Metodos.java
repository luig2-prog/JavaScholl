/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuelajava;

import models.Student;
import models.PublicWorkers;

/**
 *
 * @author
 */
public class Metodos {
    
    private Student student;
    private PublicWorkers funcionario;

    public Metodos() {
        student = null;
        funcionario = null;
    }
    
    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public PublicWorkers getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(PublicWorkers funcionario) {
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
