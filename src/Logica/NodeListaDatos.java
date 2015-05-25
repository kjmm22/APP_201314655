/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import Logica.Datos;

/**
 *
 * @author Kristhal
 */
public class NodeListaDatos {
    Datos mdato= new Datos();
    NodeListaDatos mSiguiente=null;
    NodeListaDatos mAnterior=null;

    public NodeListaDatos getmSiguiente() {
        return mSiguiente;
    }

    public void setmSiguiente(NodeListaDatos mSiguiente) {
        this.mSiguiente = mSiguiente;
    }

    public NodeListaDatos getmAnterior() {
        return mAnterior;
    }

    public void setmAnterior(NodeListaDatos mAnterior) {
        this.mAnterior = mAnterior;
    }

    public String getmDatos(){
        return mdato.getEmail().toString();
    } 
    
    public Datos getDato(){
        return mdato;
    }
    
     public Datos setDato(Datos datos){
        return mdato=datos;
    }
    
    
}
