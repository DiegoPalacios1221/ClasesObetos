package ObejotJava;
public class Persona {
    String nombre;
    String apellido;
    String pais;
    int documentoIdentidad;
    int anioNaciomiento;
    char genero;
    public Persona(String nombre, String apellido,  int documentoIdentidad, int anioNaciomiento, String pais, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.anioNaciomiento = anioNaciomiento;
        this.pais = pais;
        this.genero =  genero;
    }
    void imprimir(){
        System.out.println("Nombre = " +nombre);
        System.out.println("Apellido = " +apellido);
        System.out.println("Documento de identidad = " +documentoIdentidad);
        System.out.println("Año de nacimiento = "+anioNaciomiento);
        System.out.println("Pais de nacimiento :" + pais);
        System.out.println("Genero: " + genero);
    }


    public int calcularEdad(){
        return 2024-anioNaciomiento;
    }

    
}