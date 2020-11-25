/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Reinaldo Reis
 */
public class ColetaTest {
    
    public ColetaTest() {
        System.out.println("Coleta");
        int numColeta = 10254;                
        String tipoColeta = ("Avulsa");   
        String empresaResponsavel  = "Oleo e CIA";
        Coleta instance = new Coleta(numColeta,tipoColeta,empresaResponsavel);
        int resultado = instance.getNumColeta();  
      }

    /**
     * Test of getNumColeta method, of class Coleta.
     */
    @Test
    public void testGetNumColeta() {
        String tipoColeta = ("Avulsa");  
    }

    /**
     * Test of setNumColeta method, of class Coleta.
     */
    @Test
    public void testSetNumColeta() {
        String tipoColeta = ("Avulsa");  
    }

    /**
     * Test of getTipoColeta method, of class Coleta.
     */
    @Test
    public void testGetTipoColeta() {
        String tipoColeta = ("Avulsa");  
    }

    /**
     * Test of setTipoColeta method, of class Coleta.
     */
    @Test
    public void testSetTipoColeta() {
    }

    /**
     * Test of getEmpresaResponsavel method, of class Coleta.
     */
    @Test
    public void testGetEmpresaResponsavel() {
    }

    /**
     * Test of setEmpresaResponsavel method, of class Coleta.
     */
    @Test
    public void testSetEmpresaResponsavel() {
    }
    
}
