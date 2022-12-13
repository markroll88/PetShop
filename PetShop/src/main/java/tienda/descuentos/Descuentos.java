package tienda.descuentos;
import java.io.*;

public class Descuentos {

        public static void main(String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int i, n, rubro;
            double descuento, impuesto, caja, pago_total;
            System.out.print("Ingresa el valor de n: ");
            n = Integer.parseInt(in.readLine());
            for (i=1; i<=n; i++) {
                System.out.print("PROCESO " + i);
                System.out.print("Ingresa el valor de monto de compra: ");
                caja = Double.parseDouble(in.readLine());
                descuento=0;
                impuesto=0;
                System.out.println("Selecciona el valor de rubro.");
                System.out.println("\t1.- Alimento Seco");
                System.out.println("\t2.- Alimento Humedo");
                System.out.println("\t3.- Accesorios");
                System.out.println("\t4.- Salud");
                System.out.print("\t: ");
                do {
                    rubro = Integer.parseInt(in.readLine());
                    if (rubro<1||rubro>4)
                        System.out.print("Valor incorrecto. Ingresalo nuevamente.: ");
                } while (rubro<1||rubro>4);
                if(caja>250&&caja<=1999)
                    descuento=caja*0.05;
                if(caja>2000&&caja<=4000)
                    descuento=caja*0.1;
                if(caja>4000)
                    descuento=caja*0.15;
                if(rubro==1)
                    impuesto=(caja-descuento)*0.15;
                if(rubro==2)
                    impuesto=(caja-descuento)*0.2;
                if(rubro==3)
                    impuesto=(caja-descuento)*0.1;
                if(rubro==4)
                    impuesto=(caja-descuento)*0.05;
                pago_total=caja-descuento+impuesto;
                System.out.println("Valor de descuento: " + descuento);
                System.out.println("Valor de impuesto: " + impuesto);
                System.out.println("Valor de pago total: " + pago_total);
                System.out.println();
            }
            in.close();
        }

    }




