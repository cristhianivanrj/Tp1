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

public class ProfDiscDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ProfDiscDao
	 */
	public static ProfDiscDao create()
	{
		return new ProfDiscDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ProfDiscDao
	 */
	public static ProfDiscDao create(Connection conn)
	{
		return new ProfDiscDaoImpl( conn );
	}

}
