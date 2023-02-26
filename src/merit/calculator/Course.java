/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merit.calculator;

import java.io.Serializable;

/**
 *
 * @author jesper.rudegran
 */ 
public class Course implements Serializable{
    String course = "undefined";
    String grade = "unknown";
    double points = 0;
    double extraMerit = 0;
    
    public Course (String course, double points, String grade, double extraMerit) {
        this.course = course;
        this.points = points;
        this.grade = grade;
        this.extraMerit = extraMerit;
    }
    
    public String getCourse (){
        return course;
    }
    
    public double getPoints (){
        return points;
    }
    
    public String getGrade (){
        return grade;
    }
    
    public double getGradeMerit(){
        switch(grade){
            case "A":
                return 20;
            case "B":
                return 17.5;
            case "C":
                return 15;
            case "D":
                return 12.5;
            case "E":
                return 10;
            case "-":
                return 0;
            default:
                return 0;
        }
    }
    
    public double getExtraMerit (){
        return extraMerit;
    }
    
    public String getCourseInformation (){
        return course + " | " + points + " | " + grade + " | " + extraMerit;
    }
}
