package com.amil.amil_parcial;

import java.util.ArrayList;

public class GeneradorCalificaciones {

    public static void generarCalificaciones() {
        ArrayList<Evaluacion> evaluacion = new ArrayList<Evaluacion>();
        Evaluacion e1 = new Evaluacion("Petra", (float) 5.8);
        Evaluacion e2 = new Evaluacion("José", (float) 7.4);
        Evaluacion e3 = new Evaluacion("Roberta", (float) 8.6);
        evaluacion.add(e1);
        evaluacion.add(e2);
        evaluacion.add(e3);
    }
}