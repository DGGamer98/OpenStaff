/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgatta.openstaff.Exception;

/**
 *
 * @author dgatta
 */
public class ProgettoEsistente extends Exception{
    public ProgettoEsistente(String message) {
        super(message);
    }
    
    public ProgettoEsistente(String message, Throwable cause) {
        super(message, cause);
    }
}
