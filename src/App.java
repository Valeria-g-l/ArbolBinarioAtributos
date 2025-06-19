import Materia.Controllers.ArbolBinario;

public class App {
    public static void main(String[] args) {
        ArbolBinario ab = new ArbolBinario();

    
        ab.insert(50);
        ab.insert(17);
        ab.insert(76);
        ab.insert(9);
        ab.insert(23);
        ab.insert(54);
        ab.insert(14);
        ab.insert(19);

      
        System.out.println("Nombre: Valeria Guaman\n");

        System.out.println("Peso del arbol = " + ab.getSize());
        System.out.println("Altura es = " + ab.getHeight() + "\n");

      
        System.out.println("Arbol InOrder");
        ab.printInOrderSimple();

        System.out.println("Arbol InOrder con alturas");
        ab.printInOrderWithHeights();

        System.out.println("Arbol InOrder con factor de equilibrio");
        ab.printInOrderWithBalance();

      
        System.out.println("Arbol esta equilibrado = " + ab.estaEquilibrado());

        int nuevo = 15;
        System.out.println("Agregamos valor = " + nuevo);
        ab.insert(nuevo);

     
        System.out.println("Arbol InOrder con factor de equilibrio");
        ab.printInOrderWithBalance();

        System.out.print("Nodos desequilibrados ");
        ab.printNodosDesequilibrados();
    }
}
