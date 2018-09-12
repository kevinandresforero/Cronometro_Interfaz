/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Estudiantes
 */
public class Formato extends UnidadTiempo{
 public String cadenah;
 public String cadenam;
 public String cadenas;
    public String Formato(int h,int m,int s)
    {
        if (h < 10){
            this.cadenah = "0"+h ;
        }else{
            this.cadenah = ""+h ;
        }
        if (m < 10){
            this.cadenam = "0"+m ;
        }else{
            this.cadenam = ""+m ;
        }
        if (s<10){
            this.cadenas = "0"+s ;
        }else{
            this.cadenas = ""+s ;
        }
    return cadenah+" : "+cadenam+" : "+cadenas;
    }
}
