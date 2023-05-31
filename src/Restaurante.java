import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {

        String respuesta = "1";

        Scanner sc = new Scanner(System.in);

        System.out.println("Desea comprar una hamburguesa? \n 1 es si \n 0 es no");
        respuesta = sc.nextLine();

        List<Hamburguesa> hamburguesasVendidas = new ArrayList<>();
        List<Venta> ventas = new ArrayList<>();

        for(;respuesta.equals("1");) {

            System.out.println("que tipo de hamburguesa desea comprar?");
            System.out.println("tipo A = 12000, escriba \"A\" para elegir esta opción");
            System.out.println("tipo B = 15000, escriba \"B\" para elegir esta opción");
            System.out.println("tipo C = 18000, escriba \"C\" para elegir esta opción");
            String tipo = sc.nextLine();

            if(tipo.equals(Precio.A.getTipo())){
                agregarHamburguesa(Precio.A, hamburguesasVendidas);
            } else if(tipo.equals(Precio.B.getTipo())) {
                agregarHamburguesa(Precio.B, hamburguesasVendidas);
            } else if(tipo.equals(Precio.C.getTipo())) {
                agregarHamburguesa(Precio.C, hamburguesasVendidas);
            } else {
                System.out.println("-------");
                System.out.println("la opción ingresada no es correcta");
                System.out.println("INGRESE CUALQUIER VALOR PARA CONTINUAR");
                System.out.println("-------");
                sc.nextLine();
                continue;
            }

            System.out.println("-------");
            System.out.println("Desea comprar otra hamburguesa? \n 1 es si \n 0 es no");
            System.out.println("-------");
            respuesta = sc.nextLine();

        }



        System.out.println("Vuelva pronto");

    }

    public static void agregarHamburguesa(Precio precio, List<Hamburguesa> hamburguesas) {
        hamburguesas.add(new Hamburguesa(precio));
        System.out.println("Se ha agregado correctamente su hamburguesa tipo " + precio.getTipo());
    }
}
