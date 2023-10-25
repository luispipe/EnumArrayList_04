package com.example.enum_arraylist_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

     enum Curso{
        NIVEL_BASICO,
        NIVEL_INTERMEDIO,
        NIVEL_AVANZADO;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  MedioPago pago= MedioPago.EFECTIVO;

        switch (pago){
            case EFECTIVO:
                System.out.println("El medio de pago es con dinero en efectivo");
                break;
            case TARJETA_CREDITO:
            case TARJETA_DEBITO:
                System.out.println("El medio de pago es con tarjeta");
                break;
            case TRANSFERENCIA:
                System.out.println("El medio de pago es por transferencia");
                break;
            case BONO_REGALO:
                System.out.println("El medio de pago fue con un bono");
                break;
            default:
                System.out.println("El medio de pago fue otro");
        }

        /*Foreach es un ciclo for que permite que el elemento iterador
          es decir el elemento que recorre la estructura, se ubique en cada
          posición y extrae su valor
    */
      /*  for (Curso i:Curso.values()){
            System.out.println(i);
        }*/


        //ArrayList
        ArrayList<String> nombres= new ArrayList<>();

        //Agregar elementos a la lista
        nombres.add("Alejandra");
        nombres.add("Aleyda");
        nombres.add("Angelica");
        nombres.add("Angie");
        nombres.add("Brayan");
        nombres.add(1,"Freddy");


        System.out.println(nombres.toString());

        //Tamaño lista
        int size= nombres.size();
        System.out.println(size);

        //Buscar un elemento
        String nombre= nombres.get(2);
        System.out.println(nombre);

        //Modificar un elemento
        nombres.set(0,"Hans");
        System.out.println(nombres.toString());

        //Generar una copia de la lista
        ArrayList<String> copiaNombres= new ArrayList<>();
        copiaNombres.addAll(nombres);

        System.out.println("copia de la lista: "+copiaNombres.toString());

        //Vaciar la lista o limpiarla
        copiaNombres.clear();

        //Verificar si la lista esta vacia
        boolean vacia= copiaNombres.isEmpty();
        System.out.println(vacia);

        //Eliminar un elemento dada su posición
        nombres.remove(3);

        nombres.add(0,"Luis");
        nombres.add("Luis");
        nombres.add(3,"Luis");
        nombres.add(5,"luis");
        System.out.println(nombres.toString());

        //Eliminar en un elemento por su valor
        nombres.remove("Luis");
        System.out.println(nombres.toString());

        //La posición donde se encuentra por primera vez un valor
        int primero= nombres.indexOf("Luis");
        System.out.println(primero);

        //La última posición donde se encuentra un valor
        int ultima= nombres.lastIndexOf("Luis");
        System.out.println(ultima);

        //Recorrer una lista
        /*En un foreach el elemento iterador (i) recorre todas las posiciones
          de la estructura (lista,arreglo,enum,etc) y extrae el valor que hay
          en dicha posición
        *
        * */

        for(String i:nombres){
            System.out.println(i);
        }

        for (int i=0;i<nombres.size();i++){
            System.out.println(nombres.get(i));
        }
        System.out.println(nombres.toString());

        //["Luis","Hans","Aleyda","Luis","Angelica","luis","Angie","Brayan","Luis"]

        //["Aleyda","Angelica","Angie","Brayan","Hans","luis","Luis","Luis"]

        //Ordenar una lista
        Collections.sort(nombres);

        System.out.println(nombres.toString());

        ArrayList<Producto> productos= new ArrayList<>();
        Producto galletas= new Producto("Ducales",7500,2);
        Producto gaseosa= new Producto("Coca cola",4500,1);
        Producto arroz= new Producto("Arroz Diana 1KG",4500,3);

        productos.add(galletas);
        productos.add(gaseosa);
        productos.add(arroz);

        for (int i=0;i<productos.size();i++){
            int valorTotal= productos.get(i).getPrecio()*productos.get(i).getCantidad();
            System.out.println(
                productos.get(i).getNombre()+" "+productos.get(i).getCantidad()
                +" "+ valorTotal
            );
        }

        for (Producto i: productos){
            int valorTotal= i.getPrecio()*i.getCantidad();
            System.out.println(
                 i.getNombre()+" "+i.getCantidad()+" "+valorTotal
            );
        }



    }
}