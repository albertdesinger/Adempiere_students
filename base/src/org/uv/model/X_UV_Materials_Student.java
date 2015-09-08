/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.uv.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Model for UV_Materials_Student
 *  @author Adempiere (generated) 
 *  @version Costumizacion por alberto XD - $Id$ */
public class X_UV_Materials_Student extends PO implements I_UV_Materials_Student, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150904L;

    /** Standard Constructor */
    public X_UV_Materials_Student (Properties ctx, int UV_Materials_Student_ID, String trxName)
    {
      super (ctx, UV_Materials_Student_ID, trxName);
      /** if (UV_Materials_Student_ID == 0)
        {
			setUV_Materials_Student_ID (0);
        } */
    }

    /** Load Constructor */
    public X_UV_Materials_Student (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_UV_Materials_Student[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }

	/** Set Materials Student ID.
		@param UV_Materials_Student_ID Materials Student ID	  */
	public void setUV_Materials_Student_ID (int UV_Materials_Student_ID)
	{
		if (UV_Materials_Student_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_UV_Materials_Student_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_UV_Materials_Student_ID, Integer.valueOf(UV_Materials_Student_ID));
	}

	/** Get Materials Student ID.
		@return Materials Student ID	  */
	public int getUV_Materials_Student_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UV_Materials_Student_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}