package dados;
import domain.Pessoa;
import java.sql.*;
import java.util.*;

/**
 * Classe que contém os métodos SELECT, INSERT, UPDATE y DELETE para a 
 * tabela pessoa no MYSQL
 */

public class PessoaJDBC {
	
    private final String SQL_INSERT = "INSERT INTO pessoa(nome, sobrenome) VALUES(?,?)";
    
    private final String SQL_UPDATE = "UPDATE pessoa SET nome=?, sobrenome=? WHERE id_pessoa=?";
        
    private final String SQL_DELETE = "DELETE FROM pessoa WHERE id_pessoa = ?";
    
    private final String SQL_SELECT = "SELECT id_pessoa, nome, sobrenome FROM pessoa ORDER BY id_pessoa";
	

    /**
     * Método para inserir um registro na tabela pessoa.
     * @param nome
     * @param sobrenome
     */
    public int insert(String nome, String sobrenome) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//Sem uso em este exercicio		
        int rows = 0; //registros modificados
        try {
            conn = Conexao.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;//contador de columnas
            stmt.setString(index++, nome);//param 1 => ?
            stmt.setString(index++, sobrenome);//param 2 => ?
            System.out.println("Executar query:" + SQL_INSERT);
            rows = stmt.executeUpdate();//no. registros afectados
            System.out.println("Registros afectados:" + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.close(stmt);
            Conexao.close(conn);
        }
        return rows;
    }
    
    
    

    /**
     * Método que atualiza um registro existente
     *
     * @param id_pessoa - Chave primaria
     * @param nome - Novo Valor
     * @param sobrenome - Novo Valor
     * @return int No. de registros modificados
     */
    public int update(int id_persona, String nombre, String apellido) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexao.getConnection();
            System.out.println("Execucao  query:" + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            stmt.setInt(index, id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Registros atualizados:" + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.close(stmt);
            Conexao.close(conn);
        }
        return rows;
    }
    
    /**
     * Método que exclui um registro existente
     *
     * @param id_persona - Chave primaria
     * @return int No. - registros modificcados
     */
    public int delete(int id_persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexao.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.close(stmt);
            Conexao.close(conn);
        }
        return rows;
    }
    
    
    /**
     * Método que retorna o conteúdo da tabela de pessoa
     */
    public List<Pessoa> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pessoa pessoa = null;
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        try {
            conn = Conexao.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_pessoa = rs.getInt(1);
                String nome = rs.getString(2);
                String sobrenome = rs.getString(3);
                /*System.out.print(" " + id_persona);
                 System.out.print(" " + nombre);
                 System.out.print(" " + apellido);
                 System.out.println();
                 */
                pessoa = new Pessoa();
                pessoa.setId_pessoa(id_pessoa);
           
                pessoa.setNome(nome);
                pessoa.setSobrenome(sobrenome);
               
                pessoas.add(pessoa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexao.close(rs);
            Conexao.close(stmt);
            Conexao.close(conn);
        }
        return pessoas;
    }
    
    
    
}