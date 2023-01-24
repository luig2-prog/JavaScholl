/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author
 */
public class PublicWorkers extends Person {
    
    private String wordArea;
    private String typeOfContract;

    public PublicWorkers(String wordArea, String typeOfContract) {
        this.wordArea = wordArea;
        this.typeOfContract = typeOfContract;
    }

    public PublicWorkers(
            int id, String name, int age, String address, int phone,
            String wordArea, String typeOfContract,
            String schedule, String typeTransport
    ) {
        super(id, name, age, address, phone, schedule, typeTransport);
        this.wordArea = wordArea;
        this.typeOfContract = typeOfContract;
    }

    public String getWordArea() {
        return wordArea;
    }

    public void setWordArea(String wordArea) {
        this.wordArea = wordArea;
    }

    public String getTypeOfContract() {
        return typeOfContract;
    }

    public void setTypeOfContract(String typeOfContract) {
        this.typeOfContract = typeOfContract;
    }
    
    public String imprimir() {
        return "Nombre: " + getName() 
                + "\n Edad: " + getAge()
                + "\n Dirección: " + getAddress()
                + "\n Telefono: " + getPhone()
                + "\n Área de trabajo: " + getWordArea()
                + "\n Tipo de contrato: " + getTypeOfContract();
    }

}
