/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merit.calculator;

import java.util.ArrayList;
import java.util.Base64;

/**
 *
 * @author jesper.rudegran
 */
public class Student{
    ArrayList<Course> courses = new ArrayList<>();
    String SSN = "unknown";
    
    public Student(String SSN){
        this.SSN = SSN;
    }
    //låter mig skapa en student utan SSN för att kunna ha koll på kurser ändå
    public Student(){
    }
    
    String strSSN;
    String encSSN;
    
    //base64 enkrypterar personnummer för att man inte lika lätt ska se vem som har vilka betyg
    public void encodeSSN(){
        strSSN = SSN;
        encSSN = Base64.getEncoder().encodeToString(strSSN.getBytes());  
    }
   
    public String getEncSSN(){
        return encSSN;
    }
    
    public ArrayList<Course> getCourses(){
        return courses;
    }
}
