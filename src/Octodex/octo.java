package Octodex;

//Modelado de objetos.

/*Metodo void cuando no va a retornar nada */
public class octo {
    private String nombre;
    private String id;
    private String accion;
    private String ropa;
    private String accesorios;

    public octo(){

    }


    public octo(String nombre, String id, String accion, String ropa ,String accesorios){
        this.nombre = nombre;
        this.id = id;
        this.accion = accion;
        this.ropa = ropa;
        this.accesorios = accesorios;
    }

    //GETTER Y SETTERS

    public String getnombre(){
        return nombre;
    }
    public String getid(){
        return id;
    }
    public  String getaccion(){
        return accion;
    }
    public String getropa(){
        return ropa;
    }

    public String getaccesorios() {
        return accesorios;
    }

    //Set
    public boolean setnombre(String nombre){
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setid(String id){
        if(!id.isEmpty()) {
            this.id = id;
            return true;
        }else
            return false;
    }
    public boolean setaccion(String accion){
        if(!accion.isEmpty()){
            this.accion = accion;
            return true;
        }else
            return false;
    }

    public boolean setropa(String ropa){
        if(!ropa.isEmpty()){
            this.ropa = ropa;
            return true;
        }else
            return false;

    }

    public boolean setaccesorios(String accesorios){
        if(!accesorios.isEmpty()){
            this.accesorios =  accesorios;
            return true;
        }else
            return false;
    }

    public String showMessage() {
        return "\nNombre: " + nombre +
                "\nId:  " + id +
                "\naccion: " + accion +
                "\nropa: " + ropa +
                "\naccesorios" + accesorios;
    }
}
