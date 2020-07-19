package com.teste;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

    @Test
    public void testSomar() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar("1+2+3");
        assertEquals(6, soma);
    }

    @Test
    public void testSomarComMock(){
        Calculadora calculadora = mock(Calculadora.class);
        when(calculadora.somar("1+2")).thenReturn(10);
        int resultado = calculadora.somar("1+2");
        assertEquals(10, resultado);
    }

}