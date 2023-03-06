/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package merit.calculator;

import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 *
 * @author jesper.rudegran
 */
public class MeritCalculator {

       
   // räknar ut merit och returnerar svaret med max 2 decimaler
   public String calculateMerit(ArrayList<Course> courses){
       int totalCoursePoints = 0;
       double extraMerit = 0;
       double meritTimesPoints = 0;
       
       for(Course course : courses){
           totalCoursePoints += course.getPoints();
           extraMerit += course.getExtraMerit();
           meritTimesPoints += course.getPoints() * course.getGradeMerit();           
       }
       
       double calculatedMerit = 0;
       
       calculatedMerit = (meritTimesPoints / totalCoursePoints) + extraMerit;
       DecimalFormat df = new DecimalFormat("#.##");
       return df.format(calculatedMerit);
   }    
}
