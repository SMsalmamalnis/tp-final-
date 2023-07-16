/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author salma
 */
public class Sede {
      private int idSede; 
    private String nombreSede;
    private String contactoSede;
    
    public int getIdSede(){
        return idSede;
    }
    public void SetIdSede(int idNuevo){
        this.idSede = idNuevo;
        
                   }
            
     public String getNombreSede(){
        return nombreSede;
    }
    public void SetNombreSede( String NombreNuevo){
        this.nombreSede = NombreNuevo;
               
    }
      public String getContactoSede(){
        return contactoSede;
    }
    public void SetContactoSede (String contactoNuevo){
      this.contactoSede = contactoNuevo;
       
               
    }
}

