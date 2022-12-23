/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escuelajava;

import datos.Estudiante;
import datos.Funcionario;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class EscuelaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos metodos = new Metodos();
        boolean menu = true;
        String option = null;
        String name = null, address = null;
        String schedule = null, typeTransport = null;
        String wordArea = null, typeOfContract = null;
        int age = 0, phone = 0, schoolYear = 0; 
        int posInsertStudent = 0, studentId = 1;
        int posInsertFuncionario = 0, funcionarioId = 1;
        double pensionValue = 0;
        while(menu) {
            option = JOptionPane.showInputDialog(
                    null, 
                    "************************"
                    + "\nElige opción:"
                    + "\n1.- Insertar un alumno" 
                    + "\n2.- Insertar un funcionario"
                    + "\n3.- Ver horario y medio de transporte de un usuario"
                    + "\n4.- Imprimir()"
                    + "\n0.- Salir "
                    + "\n************************"
            );
           
            switch(option) {
                case "0":
                    menu = false;
                break;
                case "1":
                    name = JOptionPane.showInputDialog(null, "Ingrese el nombre del alumno");
                    age = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del alumno"));
                    address = JOptionPane.showInputDialog(null, "Ingrese la dirección del alumno");
                    phone = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el teléfono del alumno"));
                    schoolYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año escolar del alumno"));
                    pensionValue = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese valor de la pensión del alumno"));
                    schedule = JOptionPane.showInputDialog(null, "Ingrese el horario del alumno");
                    typeTransport = JOptionPane.showInputDialog(null, "Ingrese el tipo de transporte del alumno");
                    Estudiante estudiante = new Estudiante(
                            studentId, name, age, address, phone, schoolYear, pensionValue, schedule, typeTransport
                    );
                    metodos.setStudent(estudiante);
                    break;
                case "2":
                    name = JOptionPane.showInputDialog(null, "Ingrese el nombre del funcionario");
                    age = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del funcionario"));
                    address = JOptionPane.showInputDialog(null, "Ingrese la dirección del funcionario");
                    phone = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el teléfono del funcionario"));
                    wordArea = JOptionPane.showInputDialog(null, "Ingrese el area de trabajo del funcionario");
                    typeOfContract = JOptionPane.showInputDialog(null, "Ingrese el tipo de contrato del funcionario");
                    schedule = JOptionPane.showInputDialog(null, "Ingrese el horario del funcionario");
                    typeTransport = JOptionPane.showInputDialog(null, "Ingrese el tipo de transporte del funcionario");
                    Funcionario funcionario = new Funcionario(
                            funcionarioId, name, age, address, phone, wordArea, typeOfContract, schedule, typeTransport
                    );
                    metodos.setFuncionario(funcionario);
                    break;
                case "3":
                    String studentOrAdmin = JOptionPane.showInputDialog(null, "Que tipo de usuario desea consultar?"
                            + "\n1. estudiantes"
                            + "\n2. Administrativos");
                    boolean valid = true;
                    String horario = null, transport;
                    switch(studentOrAdmin){
                        case "1":
                            if(metodos.getStudent() != null){
                                horario = metodos.horario(Integer.parseInt(studentOrAdmin));
                                transport = metodos.transport(Integer.parseInt(studentOrAdmin));
                                JOptionPane.showMessageDialog(
                                    null, 
                                    "El tipo de usuario es estudiante"
                                    + "\nEl horario del alumno es: " + horario + ""
                                    + "\nEl medio de transporte con el que cuenta es: " + transport
                                );
                            } else {
                                JOptionPane.showMessageDialog(null, "No hay estudiantes registrados");
                            }
                            break;
                        case "2":
                            if(metodos.getFuncionario() != null){
                                horario = metodos.horario(Integer.parseInt(studentOrAdmin));
                                transport = metodos.transport(Integer.parseInt(studentOrAdmin));
                                JOptionPane.showMessageDialog(
                                    null, 
                                    "El tipo de usuario es administrativo"
                                    + "\nEl horario del funcionario es: " + horario + ""
                                    + "\nEl medio de transporte con el que cuenta es: " + transport
                                );
                            } else {
                                JOptionPane.showMessageDialog(null, "No hay ningun administrados registrado");
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No ha seleccionado una opción valida");
                            valid = false;
                            break;
                    }
                    break;
                case "4":
                    studentOrAdmin = JOptionPane.showInputDialog(null, "Que tipo de usuario desea consultar?"
                            + "\n1. estudiantes"
                            + "\n2. Administrativos");
//                    boolean valid = true;
                    String mensaje = null;
                    switch(studentOrAdmin){
                        case "1":
                            if(metodos.getStudent() != null){
                                mensaje = metodos.imprimir(Integer.parseInt(studentOrAdmin));
                                JOptionPane.showMessageDialog(
                                    null, 
                                    "Los datos de del estudiante son: " + mensaje
                                );
                            } else {
                                JOptionPane.showMessageDialog(null, "No hay estudiantes registrados");
                            }
                            break;
                        case "2":
                            if(metodos.getFuncionario() != null){
                                mensaje = metodos.imprimir(Integer.parseInt(studentOrAdmin));
                                JOptionPane.showMessageDialog(
                                    null, 
                                    "Los datos de del funcionario son: " + mensaje
                                );
                            } else {
                                JOptionPane.showMessageDialog(null, "No hay ningun administrados registrado");
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No ha seleccionado una opción valida");
                            valid = false;
                            break;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No ha seleccionado una opción valida");
                    break;
            }
        }
         
    }
    
}
