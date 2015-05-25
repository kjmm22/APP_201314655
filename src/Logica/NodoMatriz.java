/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import Logica.ListaDatos;
/**
 *
 * @author Kristhal
 */
public class NodoMatriz {
    
    NodoMatriz mArriba= null;
    NodoMatriz mAbajo= null;
    NodoMatriz mDerecha= null;
    NodoMatriz mIzquierda= null;
    String mDominio="";
    String mAbecedario="";
    ListaDatos mElementos= null;

    public String getmDominio() {
        return mDominio;
    }

    public void setmDominio(String mDominio) {
        this.mDominio = mDominio;
    }

    public String getmAbecedario() {
        return mAbecedario;
    }

    public void setmAbecedario(String mAbecedario) {
        this.mAbecedario = mAbecedario;
    }

    public NodoMatriz getmArriba() {
        return mArriba;
    }

    public void setmArriba(NodoMatriz mArriba) {
        this.mArriba = mArriba;
    }

    public NodoMatriz getmAbajo() {
        return mAbajo;
    }

    public void setmAbajo(NodoMatriz mAbajo) {
        this.mAbajo = mAbajo;
    }

    public NodoMatriz getmDerecha() {
        return mDerecha;
    }

    public void setmDerecha(NodoMatriz mDerecha) {
        this.mDerecha = mDerecha;
    }

    public NodoMatriz getmIzquierda() {
        return mIzquierda;
    }

    public void setmIzquierda(NodoMatriz mIzquierda) {
        this.mIzquierda = mIzquierda;
    }

    public ListaDatos getmElementos() {
        return mElementos;
    }

    public void setmElementos(ListaDatos mElementos) {
        this.mElementos = mElementos;
    }
    
    public void agregarDato(Datos datos){
            if (datos==null){
            
            }
            if(mElementos==null){
                mDominio=datos.getColumna();
                mAbecedario=datos.getFila();
                mElementos=new ListaDatos();
            }
            mElementos.insertarDatos(datos);
        
    }
    
    public String ToString(){
        String salida="\n";
        ListaDatos temp3=mElementos;
        NodeListaDatos temp5=temp3.getPrincipal();
        
        while(temp5!=null){
            salida+= temp5.getmDatos();
            salida+=",\n";
            temp5=null;
        }
        return salida;
    }
    
   
  
}
