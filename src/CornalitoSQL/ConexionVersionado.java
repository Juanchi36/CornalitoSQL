/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CornalitoSQL;

/**
 *
 * @author juanm
 */
public class ConexionVersionado {
     private String url, nombre, clave;
    public ConexionVersionado (){
        this.url = "jdbc:mysql://localhost/estudiantes";
        this.nombre="root";
        this.clave="";
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public java.sql.Connection conectar (){
        java.sql.Connection conec=null;
        try{
            conec=java.sql.DriverManager.getConnection(url, nombre, clave);
        }
        catch(java.sql.SQLException ex){
            System.out.println(ex);
            
        }
        return conec;
    }
}

