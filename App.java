import java.util.Scanner;

public class totallote {
    public static void main(String[] args) {
     
        double costoProducto;
        int cantidadProductos;
        String nombreProducto;
        double total;
        int contCategoriaAlta = 0;
        System.out.println("total de productos que se ingresaran al lote?");
        Scanner loi = new Scanner(System.in);
        cantidadProductos = loi.nextInt();
        loi.nextLine();
        int contador = 1;
        total = 0;

        
        while (contador <= cantidadProductos) {
            System.out.println("cuales productos comprara?");
            nombreProducto = loi.nextLine();
            System.out.println(" ");
            System.out.println("ingrese costo base producto");
            costoProducto = loi.nextDouble();
            loi.nextLine();
            if (costoProducto < 10000) {
                System.out.println("Categoria Baja");
            } else if (costoProducto >= 10000 && costoProducto <= 50000) {
                System.out.println("Categoria Media");
            } else if (costoProducto > 50000) {
                System.out.println("Categoria Alta");
                contCategoriaAlta++;
            }
          
            total += costoProducto;
            contador++;
        }

       
        System.out.println(
                "El costo promedio de los productos ingresados en el lote es de: " + total / cantidadProductos);
        System.out.println("Productos de categoria alta: " + contCategoriaAlta);
    }

}