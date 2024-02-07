package org.example;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {
    float[] v1 = {1.0f, 2.0f, 3.0f, 4.0f};
    float[] v2 = {5.0f, 5.0f, 5.0f, 5.0f};

    @org.junit.jupiter.api.Test
    void media() {
        Estadistica c = new Estadistica(v1);
        assertEquals(2.5f, c.media());
    }

    @org.junit.jupiter.api.Test
    void varianza() {
        Estadistica c = new Estadistica(v1);
        assertEquals(1.25f, c.varianza());
    }

    @org.junit.jupiter.api.Test
    void desviacionTipica() {
        Estadistica c = new Estadistica(v1);
        assertEquals(1.118f, c.desviacionTipica());
    }
}