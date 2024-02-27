/**
 * @author Rodrigo Ramirez Y Dilary Cruz 
 * @description Implementación de una pila utilizando ArrayList
 * @param <T> El tipo de dato de la pila
 */

package src;
import java.util.ArrayList;


public class ArrayListStack <T> implements IStack<T> {
    private ArrayList<T> stack;

    /**
     * @description Constructor de la clase
     */
    public ArrayListStack() {
        stack = new ArrayList<>();
    }

    /**
     * @description Método encargado de agregar un elemento a la parte superior de la pila
     * @param value El valor a agregar
     */
    public void push(T value) {
        stack.add(value);
    }

    /**
     * @description Elimina y devuelve el elemento de la parte superior de la pila
     * @return El elemento en la parte superior de la pila o null si está se encuentra vacía
     */
    public T pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    /**
     * @description Retorna el elemento que se encuentra en la parte superior de la pila sin eliminarlo
     * @return El elemento en la parte superior de la pila o null si está se encuentra vacía
     */
    public T peek() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }
}
