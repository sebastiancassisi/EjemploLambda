/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.mapfre.ejemplolambda;

import java.util.ArrayList;
import java.util.Collections;

public class Lambda {

    public static void main(String[] args) {

        ArrayList<Persona> milista = new ArrayList<>();
        milista.add(new Persona("Pedro"));
        milista.add(new Persona("Juan"));
        milista.add(new Persona("Miguel"));
        milista.add(new Persona("Alicia"));

        Collections.sort(milista, (Persona p1, Persona p2) -> p1.getNombre().compareTo(p2.getNombre()));

        milista.stream().forEach((p) -> {System.out.println(p.getNombre());});
    }

}
