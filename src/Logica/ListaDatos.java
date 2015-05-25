/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;
import Logica.Datos;
import Logica.NodeListaDatos;
/**
 *
 * @author Kristhal
 */
public class ListaDatos {
    NodeListaDatos mBase = new NodeListaDatos();
    int conteo=0;
    
    public void insertarDatos(Datos datos){
        if (datos==null){
        }
        NodeListaDatos temporal = new NodeListaDatos();
        temporal.setDato(datos);
            
            if(mBase==null){
                mBase=temporal;
            }
            
            temporal.setmSiguiente(mBase);
            mBase=temporal;
            conteo=conteo+1;

    }

    public NodeListaDatos getPrincipal() {
        return mBase;
    }

    public int getConteo() {
        return conteo;
    }
    
   
    public void dPrint(){
	NodeListaDatos temp = mBase;
	System.out.println("ListaCorreos[ \n");
	while(temp != null){
            System.out.println(temp.getDato().getEmail());
            temp = temp.getmSiguiente();
	}
	System.out.println( "]" );
		
    }
   
    
}
