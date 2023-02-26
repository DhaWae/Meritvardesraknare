/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package merit.calculator;

import java.util.ArrayList;

/**
 *
 * @author jesper.rudegran
 */
public class MeritCalculator {

    public MeritCalculator() {
       
    }
    

   
   
   public double calculateMerit(ArrayList<Course> courses){
       double totalMerit = 0;
       int totalCoursePoints = 0;
       double extraMerit = 0;
       double meritTimesPoints = 0;
       
       for (int i=0; i<courses.size();i++){
           
           totalCoursePoints += courses.get(i).getPoints();
           totalMerit += courses.get(i).getGradeMerit();
           extraMerit += courses.get(i).getExtraMerit();
           meritTimesPoints += courses.get(i).getPoints() * courses.get(i).getGradeMerit();
       }
       double calculatedMerit = 0;
       
       calculatedMerit = (meritTimesPoints / totalCoursePoints) + extraMerit;
       System.out.print(calculatedMerit);
       return calculatedMerit;

   }

    
}
