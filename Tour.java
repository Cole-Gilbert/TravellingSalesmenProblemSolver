/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author colegilbert
 */
public class Tour {
    private State[] path;
    private double length;
    
    public Tour(State[] path, double length){
        this.path = path;
        this.length = length;
    }
    
    public double getLength(){
        return this.length;
    }
    
    @Override
    public String toString(){
        String s = "";
        s += "Tour Length: " + length + "\n";
        s += "Tour: ";
        for(State state: path){
            s += state.capital().toString() + " --> ";
        }
        return s;
    }
}
