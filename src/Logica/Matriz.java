/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.ArrayList;


/**
 *
 * @author Kristhal
 */
public class Matriz {
    NodoMatriz mBase = new NodoMatriz();
    String postOrden="";
    ArrayList<String> correos= new ArrayList();
    
    public String getCantidad(){
        int cuenta=0;
        NodoMatriz auxiliar= new NodoMatriz();
        auxiliar=mBase.getmAbajo();
        String sale="";
        
        while(auxiliar!=null){
            cuenta=cuenta+1;
            sale+=auxiliar.getmAbecedario() +",";
            auxiliar=auxiliar.getmAbajo();
            
        }
        String hola="La cuenta es de:" + String.valueOf(cuenta) + sale;
        return hola;
    }
    
    public String dPrint(){
        NodoMatriz temp = mBase.getmAbajo();
        NodoMatriz temp2 = null;
        String salida2 ="\n";
        while(temp != null){
			salida2 += ("FILA[ Abecedario = " + temp.getmAbecedario() + " ]");
			temp2 = temp.getmDerecha();
			//while de recorrido de las marcas
			while(temp2 != null){
				salida2+=("COLUMNA[ Dominio = " + temp2.getmDominio() + " ]");
				salida2+=temp2.ToString();
				salida2+=("FINCOLUMNA[ Dominio = " + temp2.getmDominio() + " ]\n" );
				temp2 = temp2.getmDerecha();
			}
			salida2+=("FINFILA[ Abecedario = " + temp.getmAbecedario() + " ]\n" );
			temp = temp.getmAbajo();
		}
        System.out.println(salida2);
        return salida2;
    }
   
    public void insertarMatriz(Datos pdato){
        String fila= pdato.getFila();
        String columna=pdato.getColumna();
        NodoMatriz temp = mBase;
        
        
        if (temp.getmDerecha()==null && temp.getmAbajo()==null){
            NodoMatriz nodoFila = new NodoMatriz();
            NodoMatriz nodoColumna = new NodoMatriz();
            NodoMatriz nodoElemento = new NodoMatriz();
            
            nodoFila.setmAbecedario(fila);
            nodoColumna.setmDominio(columna);
            nodoElemento.agregarDato(pdato);
            
            nodoFila.setmDerecha(nodoElemento);
            nodoFila.setmArriba(temp);
           
            nodoColumna.setmAbajo(nodoElemento);
            nodoColumna.setmIzquierda(temp);
            
            nodoElemento.setmArriba(nodoColumna);
            nodoElemento.setmIzquierda(nodoFila);
           
            temp.setmDerecha(nodoColumna);
            temp.setmAbajo(nodoFila);
        
        }
        
        else{
            temp= mBase.getmAbajo();
            Boolean hayFila=false;
            Boolean hayColumna=false;
            while(temp!=null){
                if(temp.getmAbecedario().compareTo(fila)==0){
                    hayFila=true;
                    break;
                }
                
                temp=temp.getmAbajo();
                
            }
            
            if(hayFila==true){
                temp=temp.getmDerecha();
                hayColumna=false;
                
                while(temp!=null){
                    if(temp.getmDominio().compareTo(columna)==0){
                        hayColumna=true;
                        break;
                    }
                    temp=temp.getmDerecha();
                }
                
                if (hayColumna==true){
                    temp.agregarDato(pdato);
                }
                else{
                    NodoMatriz temp2 = mBase.getmDerecha();
                    NodoMatriz nodoColumna = new NodoMatriz();
                    nodoColumna.setmDominio(columna);
                    NodoMatriz nodoElemento = new NodoMatriz();
                    nodoElemento.agregarDato(pdato);

                    while(temp2!=null){
                            if(temp2.getmDerecha()!=null){
                                    nodoColumna.setmAbajo(nodoElemento);
                                    nodoColumna.setmIzquierda(temp2);
                                    nodoElemento.setmArriba(nodoColumna);
                                    temp2.setmDerecha(nodoColumna);
                                    break;
                            }
                        temp2 = temp2.getmDerecha();
                    }
                    
                    temp = mBase.getmAbajo();
                    boolean hayFila2 = false;
                    NodoMatriz tempo = mBase.getmAbajo();
                    
                    while(tempo != null){
			if(tempo.getmAbecedario().compareTo(fila)==0){
				hayFila2 = true;
				break;		
			}
			tempo = tempo.getmAbajo();
                    }
                    if(hayFila2==true){
                            NodoMatriz tempo2 = tempo.getmDerecha();
                            while(tempo2 != null){
                                    if(tempo2.getmDerecha() == null){
                                            tempo2.setmDerecha(nodoElemento);
                                            nodoElemento.setmIzquierda(tempo2);
                                            break;
                                    }
                                tempo2 = tempo2.getmDerecha();
                            }
                    }
                }    
            }   
            else{
                    NodoMatriz tempy = mBase.getmAbajo();
                    NodoMatriz nodoFila = new NodoMatriz();
                    nodoFila.setmAbecedario(fila);
                    NodoMatriz nodoElemento = new NodoMatriz();
                    nodoElemento.agregarDato(pdato);		
                    while(tempy != null){
			//caso5
			if(tempy.getmAbecedario().compareTo(fila)>0){
				NodoMatriz antetempy = tempy.getmArriba();
				nodoFila.setmAbajo(tempy);
				nodoFila.setmArriba(antetempy);
				nodoElemento.setmIzquierda(nodoFila);
				nodoFila.setmDerecha(nodoElemento);
				tempy.setmArriba(nodoFila);
				antetempy.setmAbajo(nodoFila);
				break;
			}
                        else{
			//caso4
                            if(tempy.getmAbajo() == null){
				tempy.setmAbajo(nodoFila);
				nodoFila.setmArriba(tempy);
				nodoFila.setmDerecha(nodoElemento);
				nodoElemento.setmIzquierda(nodoFila);
				break;		
                            }
			}
			tempy = tempy.getmAbajo();
                    }
                    NodoMatriz tempo = mBase.getmDerecha();
                    while(tempo!=null){
                        if(tempo.getmDominio().compareTo(columna)==0){
                            NodoMatriz tempus = tempo.getmAbajo();
                            if(tempus!=null){
                                while(tempus!=null){
                                    if(tempy.getmAbecedario().compareTo(fila)>0){
					NodoMatriz antetemp = tempus.getmArriba();
					nodoElemento.setmAbajo(tempus);
					nodoElemento.setmArriba(antetemp);
					antetemp.setmAbajo(nodoElemento);
					tempus.setmArriba(nodoElemento);
					break;
                                    }
                                    tempus = tempus.getmAbajo();
				}
				break;
                            }
                            else{
				nodoElemento.setmArriba(tempus);
				tempus.setmAbajo(nodoElemento);
				break;
                            }
			}else{
				//caso6
                            if(tempo.getmDerecha()==null){
				NodoMatriz nodoColumna = new NodoMatriz();
				nodoColumna.setmDominio(columna);
				tempo.setmDerecha(nodoColumna);
				nodoColumna.setmIzquierda(tempo);
				nodoColumna.setmAbajo(nodoElemento);					
                                nodoElemento.setmArriba(nodoColumna);
                            }
			}
			tempo = tempo.getmDerecha();
                    }
                }
            }
        
             
    }
    
    public Datos buscarUserGmail(String bInicial, String bCorreo){
        NodoMatriz bAux=mBase;
        NodoMatriz bFila=bAux.getmAbajo();
            while(bFila!=null){
                if(bFila.getmAbecedario()== bInicial){
                    NodoMatriz bCol= bFila.getmDerecha();
                    while(bCol!=null){
                        NodeListaDatos bElem= bCol.getmElementos().mBase;
                            while(bElem!=null){
                                if(bElem.getDato().getEmail()== bCorreo){
                                    System.out.println("INGRESO");
                                    return bElem.getDato();
                                }    
                                else{
                                    System.out.println("INGRESO");
                                    bElem=bElem.getmSiguiente();
                                }
                                bCol=bCol.getmDerecha();
                            }
                    }
                }
                else{
                    bFila=bFila.getmAbajo();
                }
            }
    return null;        
    }
    
  
}
    
