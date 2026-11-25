/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.dgatta.openstaff;

import com.dgatta.openstaff.Exception.ImpiegatoPresente;
import com.dgatta.openstaff.Exception.ProgettoEsistente;
import com.dgatta.openstaff.dao.CRUD_Operation;
import com.dgatta.openstaff.model.Employee;
import com.dgatta.openstaff.model.Project;

/**
 *
 * @author dgatta
 */
public class OpenStaff {

    public static void main(String[] args) throws ImpiegatoPresente {
        Employee employ = new Employee("Davide", "Gatta", 23, 2234, false);
        Employee employ1 = new Employee("Giacomo", "Bianchi", 34, 3342, false);
        
        Project prj = new Project();
        prj.setNameProject("OpenStaff");
        prj.setCodeProject(2213);
        
        CRUD_Operation operation = new CRUD_Operation();

        //Gestione eccezzioni
        try {
            operation.addEmploy(1, employ);
            operation.addEmploy(2, employ1);
            
            operation.addProject(1, prj);
            
        } catch(ImpiegatoPresente e) {
            e.printStackTrace();
        } catch (ProgettoEsistente ex) {
            ex.printStackTrace();
        }
        
        operation.aggregaEmployeProject(prj, employ);
        
        operation.printEmployee();
        operation.printProject();

    }
}
