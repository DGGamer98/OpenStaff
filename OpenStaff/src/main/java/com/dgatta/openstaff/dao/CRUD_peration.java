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
import java.util.List;

/**
 *
 * @author dgatta
 */
public class CRUD_peration {
    //Uso delle liste per simulare un database(provvisorio)
    private List <Employee> dbEmployee = new ArrayList<>();
    private List <Project> dbProject = new ArrayList<>();
    
    
    //Operation add
    public void addEmploye(Employee imp) throws ImpiegatoPresente{
        for (Employee employee : dbEmployee) {
            if(employee.getName().equals(imp.getName())) {
                throw new ImpiegatoPresente("L'impiegato" + imp.getName() + "è già presente ");
            }
        }
        
        dbEmployee.add(imp);
        System.out.println("[LOG] impiegato aggiunto");
    }
    
    public void addProject(Project prj) throws ProgettoEsistente{
        for (Project project : dbProject) {
            if(project.getNameProject().equals(prj.getNameProject())) {
                throw new ProgettoEsistente("Progetto esistente");
            }
        }
        
        dbProject.add(prj);
        System.out.println("[LOG] progetto inserito");
    }
    
    
    
    
}
