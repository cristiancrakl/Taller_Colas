package Logica;

import java.time.LocalDateTime;

/**
 * Clase que representa un nodo en la cola de mensajes.
 */
public class Node {
    private String nombre;
    private String mensaje;
    private LocalDateTime fechaHoraEnvio;

    public Node(String nombre, String mensaje) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.fechaHoraEnvio = LocalDateTime.now();
    }

    public String getNombre() {
        return nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getFechaHoraEnvio() {
        return fechaHoraEnvio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setFechaHoraEnvio(LocalDateTime fechaHoraEnvio) {
        this.fechaHoraEnvio = fechaHoraEnvio;
    }

    @Override
    public String toString() {
        return "Node{" +
                "nombre='" + nombre + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", fechaHoraEnvio=" + fechaHoraEnvio +
                '}';
    }
}
