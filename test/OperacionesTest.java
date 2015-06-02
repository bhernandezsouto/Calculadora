/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Operaciones;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bea
 */
public class OperacionesTest {
    Operaciones op;
    
   @Test
   public void  probarSuma (){
       op = new Operaciones();
       System.out.println("Verificar Suma");
       assertEquals(op.suma(0, 0), 0);
       assertTrue(op.suma(1, 0) == 1);
       assertTrue(op.suma(1, 1) == 2);
   }
   @Test
   public void  probarResta (){
       op = new Operaciones();
       System.out.println("Verificar Resta");
       assertEquals(op.resta(0, 0), 0);
       assertTrue(op.resta(1, 0) == 1);
       assertTrue(op.resta(1, 1) == 0);
   }
   @Test
   public void  probarMultiplicacion (){
       op = new Operaciones();
       System.out.println("Verificar Multiplicacion");
       assertEquals(op.multiplicacion(0, 0), 0);
       assertTrue(op.multiplicacion(25, 2) == 50);
       assertTrue(op.multiplicacion(10, 10) == 100);
   }
   @Test
   public void  probarDivision (){
       op = new Operaciones();
       System.out.println("Verificar Division");
       assertEquals(op.division(6, 3), 2);
       assertTrue(op.division(25, 2) == 12);
       assertTrue(op.division(2, 4) == 0);
   }
}
