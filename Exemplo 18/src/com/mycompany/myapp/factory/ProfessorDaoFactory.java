/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mycompany.myapp.factory;

import java.sql.Connection;
import com.mycompany.myapp.dao.*;
import com.mycompany.myapp.jdbc.*;

public class ProfessorDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ProfessorDao
	 */
	public static ProfessorDao create()
	{
		return new ProfessorDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ProfessorDao
	 */
	public static ProfessorDao create(Connection conn)
	{
		return new ProfessorDaoImpl( conn );
	}

}
