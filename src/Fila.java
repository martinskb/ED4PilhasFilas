//Exercício 4
public class Pilha {
    int topo;
    int tamanho;
    int elementos[];

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        elementos = new int[tamanho];
        topo = -1;
    }

    public void push(int valor) {
        if (topo == tamanho - 1) {
            System.out.println("Pilha cheia!");
        } else {
            topo++;
            elementos[topo] = valor;
        }
    }

    public int pop() {
        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            int valor = elementos[topo];
            topo--;
            return valor;
        }
    }

    public void mostrarTopo() {
        if (topo == -1) {
            System.out.println("Pilha vazia!");
        } else {
            System.out.println("Topo: " + elementos[topo]);
        }
    }

    public boolean vazia() {
        return topo == -1;
    }

    public static void main(String[] args) {
        Pilha p = new Pilha(5);

        p.push(10);
        p.push(20);
        p.push(30);

        p.mostrarTopo();

        while (!p.vazia()) {
            System.out.println("Removendo: " + p.pop());
        }
    }
}
