/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgatta.openstaff.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author dgatta
 */
public class Project {

    private String nameProject;
    private int codeProject;
    private Set<Employee> partecipanti = new HashSet<>();

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

    public Set<Employee> getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(Set<Employee> partecipanti) {
        this.partecipanti = partecipanti;
    }

    /*
    public List<Employee> getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(List<Employee> partecipanti) {
        this.partecipanti = partecipanti;
    }
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nameProject);
        hash = 97 * hash + this.codeProject;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Project other = (Project) obj;
        if (this.codeProject != other.codeProject) {
            return false;
        }
        return Objects.equals(this.nameProject, other.nameProject);
    }

    @Override
    public String toString() {
        return "Progetto{" + "nameProject=" + nameProject + ", codeProject=" + codeProject + ", partecipanti=" + partecipanti + '}';
    }

}
