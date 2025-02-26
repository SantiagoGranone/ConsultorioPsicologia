package Modelo;

import java.util.Objects;

/**
 * La clase Sesion representa una sesión con un turno y un resumen.
 */
public class Sesion {
    private Turno turno;
    private String resumenSesion;

    /**
     * Crea una nueva instancia de Sesion sin argumentos.
     */
    public Sesion(){

    }

    /**
     * Crea una nueva instancia de Sesion con el turno y resumen especificados.
     *
     * @param turno El turno de la sesión.
     * @param resumenSesion El resumen de la sesión.
     */
    public Sesion(Turno turno, String resumenSesion){
        this.turno = turno;
        this.resumenSesion = resumenSesion;
    }
    public String getResumenSesion() {
        return resumenSesion;
    }
    public void setResumenSesion(String resumenSesion) {
        this.resumenSesion = resumenSesion;
    }
    public Turno getTurno() {
        return turno;
    }
    @Override
    public String toString() {
        return "Sesion{" +
                "turno=" + turno +
                ", resumenSesion='" + resumenSesion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sesion sesion = (Sesion) o;
        return Objects.equals(turno, sesion.turno) && Objects.equals(resumenSesion, sesion.resumenSesion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turno, resumenSesion);
    }
}
