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
public class CadastroTest {
    
    public void CadastroTest() {
        System.out.println("Cadastro");
        String n = "Joaquim Lirio";                
        String end = ("RUA DAS FLORES");   
        String tel  = "9999-3262";
        String resultado;
        int num = 291301665;
        Cadastro instance = new Cadastro(n,end,tel,num);
          }   

    /**
     * Test of getNome method, of class Cadastro.
     */
    @Test
    public void testGetNome() {
    }

    /**
     * Test of getEndereco method, of class Cadastro.
     */
    @Test
    public void testGetEndereco() {
    }

    /**
     * Test of getTelefone method, of class Cadastro.
     */
    @Test
    public void testGetTelefone() {
    }

    /**
     * Test of getCpf method, of class Cadastro.
     */
    @Test
    public void testGetCpf() {
    }

    /**
     * Test of validarCadastro method, of class Cadastro.
     */
    @Test
    public void testValidarCadastro() {
        int num = 291301665;
    }

    /**
     * Test of incluir method, of class Cadastro.
     */
    @Test
    public void testIncluir() {
        int num = 291301665;
    }

    /**
     * Test of excluir method, of class Cadastro.
     */
    @Test
    public void testExcluir() {
        int num = 291301665;
    }

    /**
     * Test of alterar method, of class Cadastro.
     */
    @Test
    public void testAlterar() {
    }

    /**
     * Test of gerarSenha method, of class Cadastro.
     */
    @Test
    public void testGerarSenha() {
    }
    
}
