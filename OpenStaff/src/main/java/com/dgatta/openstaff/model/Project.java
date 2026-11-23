/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgatta.openstaff.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dgatta
 */
public class Project {
    private String nameProject;
    private int codeProject;
    private List<Employee> partecipanti = new ArrayList<>();

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public int getCodeProject() {
        return codeProject;
    }

    public void setCodeProject(int codeProject) {
        this.codeProject = codeProject;
    }

    public List<Employee> getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(List<Employee> partecipanti) {
        this.partecipanti = partecipanti;
    }

    @Override
    public String toString() {
        return "Progetto{" + "nameProject=" + nameProject + ", codeProject=" + codeProject + ", partecipanti=" + partecipanti + '}';
    }
    
    


    
    
}
