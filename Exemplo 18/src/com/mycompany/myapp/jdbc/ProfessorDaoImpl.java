/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mycompany.myapp.jdbc;

import com.mycompany.myapp.dao.*;
import com.mycompany.myapp.factory.*;
import com.mycompany.myapp.dto.*;
import com.mycompany.myapp.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ProfessorDaoImpl extends AbstractDAO implements ProfessorDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT idProfessor, Professor FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( idProfessor, Professor ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET idProfessor = ?, Professor = ? WHERE idProfessor = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE idProfessor = ?";

	/** 
	 * Index of column idProfessor
	 */
	protected static final int COLUMN_ID_PROFESSOR = 1;

	/** 
	 * Index of column Professor
	 */
	protected static final int COLUMN_PROFESSOR = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column idProfessor
	 */
	protected static final int PK_COLUMN_ID_PROFESSOR = 1;

	/** 
	 * Inserts a new row in the professor table.
	 */
	public ProfessorPk insert(Professor dto) throws ProfessorDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT, Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			stmt.setInt( index++, dto.getIdProfessor() );
			stmt.setString( index++, dto.getProfessor() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdProfessor( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProfessorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the professor table.
	 */
	public void update(ProfessorPk pk, Professor dto) throws ProfessorDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getIdProfessor() );
			stmt.setString( index++, dto.getProfessor() );
			stmt.setInt( 3, pk.getIdProfessor() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProfessorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the professor table.
	 */
	public void delete(ProfessorPk pk) throws ProfessorDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdProfessor() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProfessorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the professor table that matches the specified primary-key value.
	 */
	public Professor findByPrimaryKey(ProfessorPk pk) throws ProfessorDaoException
	{
		return findByPrimaryKey( pk.getIdProfessor() );
	}

	/** 
	 * Returns all rows from the professor table that match the criteria 'idProfessor = :idProfessor'.
	 */
	public Professor findByPrimaryKey(int idProfessor) throws ProfessorDaoException
	{
		Professor ret[] = findByDynamicSelect( SQL_SELECT + " WHERE idProfessor = ?", new Object[] {  new Integer(idProfessor) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the professor table that match the criteria ''.
	 */
	public Professor[] findAll() throws ProfessorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY idProfessor", null );
	}

	/** 
	 * Returns all rows from the professor table that match the criteria 'idProfessor = :idProfessor'.
	 */
	public Professor[] findWhereIdProfessorEquals(int idProfessor) throws ProfessorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE idProfessor = ? ORDER BY idProfessor", new Object[] {  new Integer(idProfessor) } );
	}

	/** 
	 * Returns all rows from the professor table that match the criteria 'Professor = :professor'.
	 */
	public Professor[] findWhereProfessorEquals(String professor) throws ProfessorDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE Professor = ? ORDER BY Professor", new Object[] { professor } );
	}

	/**
	 * Method 'ProfessorDaoImpl'
	 * 
	 */
	public ProfessorDaoImpl()
	{
	}

	/**
	 * Method 'ProfessorDaoImpl'
	 * 
	 * @param userConn
	 */
	public ProfessorDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "exemplo.professor";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Professor fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Professor dto = new Professor();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Professor[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Professor dto = new Professor();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Professor ret[] = new Professor[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Professor dto, ResultSet rs) throws SQLException
	{
		dto.setIdProfessor( rs.getInt( COLUMN_ID_PROFESSOR ) );
		dto.setProfessor( rs.getString( COLUMN_PROFESSOR ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Professor dto)
	{
	}

	/** 
	 * Returns all rows from the professor table that match the specified arbitrary SQL statement
	 */
	public Professor[] findByDynamicSelect(String sql, Object[] sqlParams) throws ProfessorDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProfessorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the professor table that match the specified arbitrary SQL statement
	 */
	public Professor[] findByDynamicWhere(String sql, Object[] sqlParams) throws ProfessorDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ProfessorDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
