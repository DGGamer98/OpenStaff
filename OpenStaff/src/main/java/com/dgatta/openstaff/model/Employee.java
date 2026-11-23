/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgatta.openstaff.model;

import com.dgatta.openstaff.Exception.MinoreDiciotto;

/**
 *
 * @author dgatta
 */
public class Employee extends Person {

    private int employee_id_number;
    public boolean isDirigente;

    public Employee(String name, String surname, int age, int employee_id_number, boolean isDirigente) {
        super(name, surname, age);
        this.employee_id_number = employee_id_number;
        this.isDirigente = isDirigente;
    }

    public int getEmployee_id_number() {
        return employee_id_number;
    }

    public void setEmployee_id_number(int employee_id_number) {
        this.employee_id_number = employee_id_number;
    }

    public boolean isDirigente(String dirigente) {
        if ("yes".equals(dirigente)) {
            this.isDirigente = true;
        }
        return false;
    }

    @Override
    public void controlAGe() throws MinoreDiciotto {
        if (this.getAge() > 18) {
            System.out.println("OK");
        } else {
            throw new MinoreDiciotto("Allerta Dipendente minorenne");
        }
    }

}
