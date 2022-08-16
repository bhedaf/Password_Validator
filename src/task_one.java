/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Freya
 */

//hello this is password validator project!!
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_one {
    public static void main(String[] args){
        System.out.println("Enter password: ");
        Scanner input = new Scanner(System.in);
       // String password = input.next();
        //password length is 8
        
        while(true){
            //System.out.println("Enter password: ");
            String password = input.next();
            if(checkLength(password) && checkUpperCase(password) && checkSpecialCharacter(password)){
                System.out.println("Valid Password. ");
                break;
            }
            else{
                System.out.println("Not Valid Password. ");
                System.out.println("Enter password again: ");
            }
        }
    }    
    
    public static boolean checkLength(String pass){
        if(pass.length()>=8){
            return true;
        }
        return false;
    }
    
    public static boolean checkSpecialCharacter(String pass){   
        Pattern specCharPat = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher specCharMat = specCharPat.matcher(pass);
        boolean checkSpecChar = specCharMat.find();
        if(checkSpecChar){
            return true;
        }
        return false;
    }
    
    public static boolean checkUpperCase(String pass){
        for(int i=0; i<pass.length(); i++){
            if(Character.isUpperCase(pass.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
