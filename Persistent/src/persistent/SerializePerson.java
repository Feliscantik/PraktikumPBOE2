/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistent;
import java.io.*;
/**
 *
 * @author eveli
 */
class Person implements Serializable{
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Felis"); 
        try {
            FileOutputStream f = new FileOutputStream("person.ser"); 
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            s.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

