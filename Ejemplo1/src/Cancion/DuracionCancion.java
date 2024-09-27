package Cancion;

public class DuracionCancion {
    //Atributos
    private int minutos;
    private int segundos;

    //Constructor
    public DuracionCancion(int minutos, int segundos) {
        if (minutos >= 0 && segundos > 0 && segundos < 60) {
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            System.out.println("Duracion invalida.");
        }
    }

    //Getters
    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    //Setters
    public void setMinutos(int minutos) {
        if(minutos >= 0){
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if(segundos > 0 && segundos < 60){
            this.segundos = segundos;
        }else{
            System.out.println("Los segundos deben ser entre 1 y 59.");
        }
    }

    //Metodo para obtener la duracion de la cancion enn formato mm:ss
    public String getDuracion(){
        return String.format("%02d:%02d",minutos,segundos);
    }
}

