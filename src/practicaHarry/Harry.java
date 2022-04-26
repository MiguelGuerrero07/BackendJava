package practicaHarry;

public class Harry {

    private String Genero;
    private String Nombre;
    private String Casa;
    private String Boggart;
    private String Patronus;

    public Harry(){

    }

    public Harry( String Genero, String Nombre, String Casa , String Boggart , String Patronus){
        this.Genero = Genero;
        this.Nombre= Nombre;
        this.Casa = Casa;
        this.Boggart = Boggart;
        this.Patronus = Patronus;

    }


    public String getGenero() {
        return Genero;
    }
    public String getNombre(){
        return Nombre;
    }
    public String getCasa(){
        return Casa;
    }
    public String getBoggart(){
        return Boggart;
    }
    public String getPatronus(){
        return Patronus;
    }

    public boolean setGenero(String Genero) {
        if (!Genero.isEmpty()) {
            this.Genero = Genero;
            return true;
        } else
            return false;
    }
    public boolean setNombre(String Nombre) {
        if (!Nombre.isEmpty()) {
            this.Nombre = Nombre;
            return true;
        } else
            return false;
    }
    public boolean setCasa(String Casa){
        if(!Casa.isEmpty()){
            this.Casa = Casa;
            return true;
        }else
            return false;
    }
    public boolean setBoggart(){
        if(!Boggart.isEmpty()){
            this.Boggart = Boggart;
            return true;
        }else
            return false;
    }
    public boolean setPatronus(){
        if(!Boggart.isEmpty()){
            this.Patronus = Patronus;
            return true;
        }else
            return false;
    }

    public String showMessage() {
        return "Genero:" + Genero +
                "\nNombre: " + Nombre +
                "\nCasa:" + Casa +
                "\nBoggart" + Boggart+
                "\nPatronus" + Patronus;
    }

}
