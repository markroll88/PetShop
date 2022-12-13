package tienda;
import tienda.productos.Accesorios;
import tienda.productos.AlimentoHumedo;
import tienda.productos.AlimentoSeco;
import tienda.productos.Producto;
import tienda.read.Read;



public class Main {



        public static void main(String[] args) {
            /*
             * Sólo se debe añadir métodos para establecer los valores de los atributos, poder imprimirlos datos en pantalla y calcular cantidad a pagar según el precio de venta. De momento, no hace falta gestionar el almacén con los artículos que quedan, sólo se pedirá la cantidad de artículos que lleva el cliente y se dará el precio a pagar según esa cantidad.
             */

            System.out.println("Bienvenido a la tienda de las mascotas, Alimento Seco, Alimentos Humedo y Accesorios "+
                    "El programa simula una tienda que vende alimentos para perros, gatos, aves y reptiles "+
                    "Los artículos só1" +
                    "lo se pueden vender si están disponibles en el petshop "+
                    "El usuario puede: n"+
                    "t Comprar productos de los existentes.n"+
                    "t Añadir nuevos productos a la cesta.n"+
                    "t Consultar el importe de la cuenta.");

            boolean continuar = true;
            int lecturaProducto, lecturaCantidad; //Variables para seleccionar el producto y la cantidad que se quiere comprar

            //Se instancian y cargan los productos
            Producto seco1 = new AlimentoSeco("Royal Canin 1", 18000.50, 6, true, "Perro");
            Producto seco2 = new AlimentoSeco("Excellent Senior", 9589.89, 20, true, "Gato");
            Producto seco3 = new AlimentoSeco("Embuche 15/9", 3449.99, 20, true, "Aves");
            Producto humedo1  = new AlimentoHumedo("Pedrigree 3", 30.2, 5, true, "Perro");
            Producto humedo2 = new AlimentoHumedo("ProPlan 2", 1200.50, 5, true, "Gato");
            Producto humedo3 = new AlimentoHumedo("Papilla", 210.45, 20, true, "Reptil, Roedores");
            Producto accesorio1 = new Accesorios("Collar T/nro", 2300.11, 0, false, "Perro_Gato");
            Producto accesorio2 = new Accesorios("Pelota T/nro", 300.00, 20, true, "Toda categoria");
            Producto accesorio3 = new Accesorios("Jaula", 3800.00, 5, true, "Aves_Roedores");
            Producto accesorio4 = new Accesorios("Pecera", 1800.99, 6, true, "Peces_Roedores_Reptiles");

            //Se crea el array "catálogo" para contener los productos. Su dimensión viene del número de veces que se
            //instancia el contructor de Producto
            Producto catalogo[] = new Producto[Producto.dimesionArray];
            //Se crea el objeto gestion para trabajar (mostrar y vender productos, y mostrar caja)
            GestionTienda gestion = new GestionTienda();

            //Se rellena el array catálogo
            catalogo[0] = seco1;
            catalogo[1] = seco2;
            catalogo[2] = seco3;
            catalogo[3] = humedo1;
            catalogo[4] = humedo2;
            catalogo[5] = humedo3;
            catalogo[6] = accesorio1;
            catalogo[7] = accesorio2;
            catalogo[8] = accesorio3;
            catalogo[9] = accesorio4;
            do {
                System.out.println(" Introduzca la opción que desea realizar: "
                        +"1. Ver productos  "
                        +"2. Comprar productos  "
                        +"3. Mostrar caja  "
                        +".SALIR --> Pulse cualquier otro número. Gracias"
                );
                switch (Read.datoInt()) {
                    case 1:
                        gestion.mostrarProductos(catalogo);
                        break;
                    case 2:
                        System.out.println(" ¿Que producto desea comprar? ");
                        gestion.mostrarNombreProductos(catalogo);
                        lecturaProducto= Read.datoInt();
                        System.out.println(" ¿Cuánta cantidad desea comprar? ");
                        lecturaCantidad=Read.datoInt();
                        //Se carga el producto y la cantidad solicitada por el usuario
                        gestion.comprarProducto(catalogo, lecturaProducto, lecturaCantidad);
                        break;
                    case 3:
                        System.out.println(gestion.mostrarCaja());
                        break;
                    default:
                        //Se sale del programa
                        continuar=false;
                }

            } while(continuar);

            System.out.println("---- Gracias por usar la aplicación. ----");

        }
    }

