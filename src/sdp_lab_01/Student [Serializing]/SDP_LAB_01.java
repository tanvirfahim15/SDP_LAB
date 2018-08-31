/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdp_lab_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
/**
 *
 * @author student
 */
public class SDP_LAB_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        Date d = new Date();
        Student s1 = new Student("bob",99,d,2017,2018,"jobs","alice");
        
        try(FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);    ){
            o.writeObject(s1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    
}
