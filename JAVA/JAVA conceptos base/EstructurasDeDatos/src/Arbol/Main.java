package Arbol;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        // Insertar valores en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        // Realizar un recorrido inorder para imprimir los valores ordenados
        System.out.println("Recorrido inorder:");
        arbol.inorder();
    }
}

