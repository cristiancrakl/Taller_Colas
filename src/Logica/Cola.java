package Logica;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que representa una cola de mensajes con límite.
 */
public class Cola {
    private Queue<Node> cola;
    private int limite;
    private int segundos; // tiempo en segundos para auto atender

    public Cola(int limite) {
        this.cola = new LinkedList<>();
        this.limite = limite;
        this.segundos = 0; // de fabrica 0, pa que no se atienda solo
    }

    // metodo para encolar un mensaje
    public boolean enqueue(Node node) {
        if (cola.size() < limite) {
            cola.add(node);
            return true;
        } else {
            return false; // Cola llena
        }
    }

    // metodo para desencolar un mensaje
    public Node dequeue() {
        if (!cola.isEmpty()) {
            return cola.poll();
        } else {
            return null; // Cola vacía
        }
    }

    // verificar si la cola esta llena
    public boolean isFull() {
        return cola.size() >= limite;
    }

    // verificar si la cola esta vacia
    public boolean isEmpty() {
        return cola.isEmpty();
    }

    // obtener el primer elemento sin removerlo
    public Node getFirst() {
        return cola.peek();
    }

    // obtener el ultimo elemento en la cola
    public Node getLast() {
        if (!cola.isEmpty()) {
            // en una queue el ultimo es el ultimo agregado, pero no hay método directo
            Object[] array = cola.toArray();
            return (Node) array[array.length - 1];
        }
        return null;
    }

    // establecer el limite de la cola
    public void setLimit(int limite) {
        this.limite = limite;
    }

    // establecer los segundos para auto-atender
    public void setSeconds(int segundos) {
        this.segundos = segundos;
    }

    // obtener los segundos
    public int getSeconds() {
        return segundos;
    }

    // obtener el tamaño actual
    public int size() {
        return cola.size();
    }

    // obtener lista de nodos para mostrar en tabla
    public java.util.List<Node> getNodos() {
        return new java.util.ArrayList<>(cola);
    }
}
