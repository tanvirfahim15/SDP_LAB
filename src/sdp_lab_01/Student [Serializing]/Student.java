/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdp_lab_01;

import java.util.Date;

/**
 *
 * @author student
 */
public class Student implements java.io.Serializable {
    private String name;
    private int roll;
    private Date dob;
    private int sem_start;
    private int sem_end;
    private String f_name;
    private String m_name;

    public Student(String name, int roll, Date dob, int sem_start, int sem_end, String f_name, String m_name) {
        this.name = name;
        this.roll = roll;
        this.dob = dob;
        this.sem_start = sem_start;
        this.sem_end = sem_end;
        this.f_name = f_name;
        this.m_name = m_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getSem_start() {
        return sem_start;
    }

    public void setSem_start(int sem_start) {
        this.sem_start = sem_start;
    }

    public int getSem_end() {
        return sem_end;
    }

    public void setSem_end(int sem_end) {
        this.sem_end = sem_end;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", roll=" + roll + ", dob=" + dob + ", sem_start=" + sem_start + ", sem_end=" + sem_end + ", f_name=" + f_name + ", m_name=" + m_name + '}';
    }
    
    
    
    
}
