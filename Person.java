
	/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Fadilah Nurjaman
 */
public class Person {
    private String name;
    private String address;
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setName(String address){
        this.address = address;
    }
    
    public String toString(){
        return  "Nama    : " + getName() +
        "\nAlamat : " + getAddress();
    }
}