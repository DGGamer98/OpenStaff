/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dgatta.openstaff.Exception;

/**
 *
 * @author dgatta
 */
public class MinoreDiciotto extends Exception{
    
    public MinoreDiciotto (String messaggio) {
        super(messaggio);
    }
    
    public MinoreDiciotto(String messaggio, Throwable causa) {
        super(messaggio, causa);
    }
    
}
