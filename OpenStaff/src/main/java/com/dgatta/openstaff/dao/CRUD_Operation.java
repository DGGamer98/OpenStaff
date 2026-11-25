/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgatta.openstaff.dao;

import com.dgatta.openstaff.Exception.ImpiegatoPresente;
import com.dgatta.openstaff.Exception.ProgettoEsistente;
import com.dgatta.openstaff.model.Employee;
import com.dgatta.openstaff.model.Project;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author dgatta
 */
public class CRUD_Operation {
    //Uso delle Mappe per simulare un database(provvisorio)
    private Map <Integer, Employee> dbEmployee = new HashMap<>();
    private Map <Integer, Project> dbProject = new HashMap<>();
    
    //Metodi add
    public Employee addEmploy(int id, Employee impl) throws ImpiegatoPresente {
        if(dbEmployee.containsKey(id)) {
            throw new ImpiegatoPresente("Impiegato già presente nel database"); //Ovviamente per essere univoco uso per adesso la chiave. Con il database uso il codice fiscale
        }
        
        dbEmployee.put(id, impl);
        System.out.println("[LOG] impiergato aggiunto con sucesso");
        return impl;
    }
    
    public Project addProject(int id, Project prj) throws ProgettoEsistente{
        if(dbProject.containsKey(id)) {
            throw new ProgettoEsistente("Progetto già esistente in OpenStaff");
        }
        dbProject.put(id, prj);
        System.out.println("[LOG] progetto agginto con sucesso");
        return prj;
    }
    
    //TODO Davide --> Creare la logica per non inserire duplicati
    public void aggregaEmployeProject(Project prj, Employee impl) {
        prj.getPartecipanti().add(impl);
        System.out.println("[LOG] impiegato associato con sucesso");
    }
    
    public void printEmployee() {
        for (Integer key : dbEmployee.keySet()) {
            System.out.println("key: " + key + "value: " + dbEmployee.get(key)); //dbEmployee.get(key) ogni iterazione stampo il valore di key con get
        }
    }
    public void printProject() {
        for (Integer key : dbProject.keySet()) {
            System.out.println("Key: " + key + "value: " + dbProject.get(key));
        }
    }
    
    
    
    
    
}
