/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Employees;

import Lists.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author oscar
 */
public class EmployeeList implements List <Employee>{
    private Employee List[];
    public EmployeeList(){
        this.List = new Employee[100];
    }

    public void showAll() {
        System.out.println(Arrays.toString(List));
    }

    @Override
    public boolean remove(Employee t) {
        int max = List.length;
        for (int i = 0; i < max; i++) {
            if(List[i]==t){
                List[i]=null;
            }
            return true;
        }
        return false; 
    }

    @Override
    public Employee find(Object id) {
        int max = List.length;
        for (int i = 0; i < max; i++) {
            if(List[i]==id){
                List[i]=null;
            }
            return List[i];
        }
        return null;  
    }

    @Override
    public boolean add(Employee t) {
        int max = List.length;
        for (int i = 0; i < max; i++) {
            if(List[i]==t){
                List[i]=null;
                return true;
            }
        }
        return false;   
    }
    
    
    
}
