/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons.Visitors;

import Lists.List;

/**
 *
 * @author Luisf
 */
public class VisitorList implements List <Visitor> {
    private Visitor List[];
    public VisitorList(){
        this.List = new Visitor[100];
    }
    @Override
    public void showAll() {
        for (int i = 0; i < List.length; i++) {
            if (List[i] != null) {
                System.out.println(List[i].toString());
            }
        }
    }
    @Override
    public boolean remove(Visitor t) {
        int max=List.length;
        for (int i = 0; i < max; i++) {
            if(List[i]==t){
               List[i]=null;
               return true;
            }
        }
        return false;
    }
    @Override
    public Visitor find(Object id) {
        int max = List.length;
        for (int i = 0; i < max; i++) {
            if (List[i] != null && List[i].getId().equals(id)) {
            return List[i];
            }
        }
        return null;
    }
    @Override
    public boolean add(Visitor t) {
        int max=List.length;
        for (int i = 0; i < max; i++) {
            if(List[i]==null){
               List[i]=t;
               return true;
            }
        }
        return false;
    }
}
