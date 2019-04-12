package main;

import entidades.AcessoDados;
import entidades.AcessoDadosException;
import entidades.ImplementacaoMySql;
import entidades.LerDadosException;

public class ManejoExcecoes1 {

	public static void main(String[] args) {
		
		ImplementacaoMySql dados = new ImplementacaoMySql(true);
        executar(dados, "listar");
        executar(dados, "inserir");
        System.out.println("\nMudar condicao simular:false \n ");
        dados.setSimularErro(false);
        executar(dados, "listar");
        executar(dados, "inserir");
    }

    private static void executar(AcessoDados dados, String tarefa) {
        if ("listar".equals(tarefa)) {
            try {
                dados.listar();
                System.out.println("Listar: finaliza bloco try sem exceções ");
            } 
            catch (LerDadosException ex) {
               System.out.println("Tratado executar: Erro tipo LecturaDatosEx para tarefa listar");
        	} catch (AcessoDadosException ex) {
                System.out.println("Tratado executar: Erro tipo AccesoDatosEx para tarefa listar");
            } catch (Exception ex) {
                System.out.println("Tratado executar: Erro tipo  Exception para tarefa listar");
            }
            finally {
                System.out.println("Finally en tarefa listar");
            }
        } else if ("inserir".equals(tarefa)) {
            try {
                dados.inserir();
                System.out.println("Inserir: finaliza bloco try sin execciones ");
            } catch (AcessoDadosException ex) {
                System.out.println("Tratado em executar: Erro tipo AccesoDatosEx para tarefa inserir");
            }catch (Exception ex) {
                System.out.println("Tratado em executar: Erro tipo  Exception para tarefa inserir");
            }
            
            finally{
                System.out.println("Finally em tarefa inserir");
            }
        }
        else
            System.out.println("Não se reconhece tarefa");

	}

}
