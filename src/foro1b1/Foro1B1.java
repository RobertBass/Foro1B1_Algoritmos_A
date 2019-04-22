package foro1b1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Foro1B1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();

        String fecha = sdf.format(date);
        int unidades;
        double precio = 1200.0, importe_venta, dolar_euro = 0.89, dolar_sol = 3.30, dolar_pesoColombiano = 3151.80, venta_euros, venta_soles, venta_pesoColombiano;
        // El valor de cambio de las divisas fue tomado el 21 de abril de 2019

        System.out.println("Fecha: " + fecha);
        System.out.println("Ingresa la cantidad de computadoras vendidas");
        unidades = teclado.nextInt();

        importe_venta = unidades * precio;
        venta_euros = importe_venta * dolar_euro;
        venta_soles = importe_venta * dolar_sol;
        venta_pesoColombiano = importe_venta * dolar_pesoColombiano;

        System.out.println("El importe de la venta es de US$ " + importe_venta + " dolares");
        System.out.println("El importe de venta en euros es de $ " + venta_euros + " euros");
        System.out.println("El importe de venta en soles es de $ " + venta_soles + " soles");
        System.out.println("El importe de venta en pesos colombianos es de $ " + venta_pesoColombiano + " pesos");

        System.gc();
    }
}
