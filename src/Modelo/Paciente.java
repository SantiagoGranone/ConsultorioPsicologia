package Modelo;

import java.util.Objects;


public abstract class Paciente extends Persona {

    public Paciente() {
    }
    public Paciente(String nombreUsuario , String email, String dni) {super(nombreUsuario, email, dni);}
    @Override
    public String toString() {
        return super.toString();
    }
}