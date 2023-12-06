package Arbol;

public class ArbolBinarioBusqueda {
    Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierda = insertarRec(raiz.izquierda, valor);
        } else if (valor > raiz.valor) {
            raiz.derecha = insertarRec(raiz.derecha, valor);
        }

        return raiz;
    }

    public void inorder() {
        inorderRec(raiz);
    }

    private void inorderRec(Nodo raiz) {
        if (raiz != null) {
            inorderRec(raiz.izquierda);
            System.out.print(raiz.valor + " ");
            inorderRec(raiz.derecha);
        }
    }
}
