package Artista;

public class Artista {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;

    //Constructor
    public Artista(String nombre,String apellido,int edad,String nacionalidad){
        if(edad > 0){
            this.nombre = nombre; //Verificaciones para solo cargar letras y espacios
            this.apellido = apellido;
            this.edad = edad;
            this.nacionalidad = nacionalidad;
        }else{
            System.out.println("La edad ingresada es menor a 0.");
        }
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
            return edad;
    }

    //Setters
    public void setNombre(String nombre) {//Aca debo llamar de nuevo a las verificaciones
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
        }
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


}
