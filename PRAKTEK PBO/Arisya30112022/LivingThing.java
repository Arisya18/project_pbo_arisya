/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arisya30112022;

/**
 *
 * @author ASUS
 */
public abstract class LivingThing {
    public void breath(){ 
    System.out.println("Living Thing breathing..."); 
 } 
    public void eat(){ 
    System.out.println("Living Thing eating..."); 
 } 
/** 
 * abstract method walk 
 * Kita ingin method ini di-overridden oleh subclasses 
 */ 
    public abstract void walk();
}
