/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author
 */
public class Student extends Person {
    
    private int schoolYear;
    private double pensionValue;

    public Student() {
        super();
    }

    public Student(
            int id, String name, int age, String address, 
            int phone, int schoolYear, double pensionValue, 
            String schedule, String typeTransport
    ) {
        super(id, name, age, address, phone, schedule, typeTransport);
        this.schoolYear = schoolYear;
        this.pensionValue = pensionValue;
    }
    
    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public double getPensionValue() {
        return pensionValue;
    }

    public void setPensionValue(double pensionValue) {
        this.pensionValue = pensionValue;
    }

    
    public String imprimir() {
        return "Nombre: " + getName() 
                + "\n Edad: " + getAge()
                + "\n Dirección: " + getAddress()
                + "\n Telefono: " + getPhone()
                + "\n Año escolar: " + getSchoolYear()
                + "\n Valor de la pensión: " + getPensionValue();
    }
}
