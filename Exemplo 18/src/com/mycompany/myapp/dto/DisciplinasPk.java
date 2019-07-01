/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mycompany.myapp.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the disciplinas table.
 */
public class DisciplinasPk implements Serializable
{
	protected int idDisciplina;

	/** 
	 * This attribute represents whether the primitive attribute idDisciplina is null.
	 */
	protected boolean idDisciplinaNull;

	/** 
	 * Sets the value of idDisciplina
	 */
	public void setIdDisciplina(int idDisciplina)
	{
		this.idDisciplina = idDisciplina;
	}

	/** 
	 * Gets the value of idDisciplina
	 */
	public int getIdDisciplina()
	{
		return idDisciplina;
	}

	/**
	 * Method 'DisciplinasPk'
	 * 
	 */
	public DisciplinasPk()
	{
	}

	/**
	 * Method 'DisciplinasPk'
	 * 
	 * @param idDisciplina
	 */
	public DisciplinasPk(final int idDisciplina)
	{
		this.idDisciplina = idDisciplina;
	}

	/** 
	 * Sets the value of idDisciplinaNull
	 */
	public void setIdDisciplinaNull(boolean idDisciplinaNull)
	{
		this.idDisciplinaNull = idDisciplinaNull;
	}

	/** 
	 * Gets the value of idDisciplinaNull
	 */
	public boolean isIdDisciplinaNull()
	{
		return idDisciplinaNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof DisciplinasPk)) {
			return false;
		}
		
		final DisciplinasPk _cast = (DisciplinasPk) _other;
		if (idDisciplina != _cast.idDisciplina) {
			return false;
		}
		
		if (idDisciplinaNull != _cast.idDisciplinaNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idDisciplina;
		_hashCode = 29 * _hashCode + (idDisciplinaNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mycompany.myapp.dto.DisciplinasPk: " );
		ret.append( "idDisciplina=" + idDisciplina );
		return ret.toString();
	}

}
