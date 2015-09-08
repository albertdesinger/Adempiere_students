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

/** Generated Model for UV_Details_Students
 *  @author Adempiere (generated) 
 *  @version Costumizacion por alberto XD - $Id$ */
public class X_UV_Details_Students extends PO implements I_UV_Details_Students, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150904L;

    /** Standard Constructor */
    public X_UV_Details_Students (Properties ctx, int UV_Details_Students_ID, String trxName)
    {
      super (ctx, UV_Details_Students_ID, trxName);
      /** if (UV_Details_Students_ID == 0)
        {
			setNote (0);
			setUV_Details_Students_ID (0);
			setUV_Materials_Student_ID (0);
			setUV_Students_ID (0);
        } */
    }

    /** Load Constructor */
    public X_UV_Details_Students (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_UV_Details_Students[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Note.
		@param Note 
		Optional additional user defined information
	  */
	public void setNote (int Note)
	{
		set_Value (COLUMNNAME_Note, Integer.valueOf(Note));
	}

	/** Get Note.
		@return Optional additional user defined information
	  */
	public int getNote () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Note);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Details Students ID.
		@param UV_Details_Students_ID Details Students ID	  */
	public void setUV_Details_Students_ID (int UV_Details_Students_ID)
	{
		if (UV_Details_Students_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_UV_Details_Students_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_UV_Details_Students_ID, Integer.valueOf(UV_Details_Students_ID));
	}

	/** Get Details Students ID.
		@return Details Students ID	  */
	public int getUV_Details_Students_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UV_Details_Students_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.uv.model.I_UV_Materials_Student getUV_Materials_Student() throws RuntimeException
    {
		return (org.uv.model.I_UV_Materials_Student)MTable.get(getCtx(), org.uv.model.I_UV_Materials_Student.Table_Name)
			.getPO(getUV_Materials_Student_ID(), get_TrxName());	}

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

	public org.uv.model.I_UV_Students getUV_Students() throws RuntimeException
    {
		return (org.uv.model.I_UV_Students)MTable.get(getCtx(), org.uv.model.I_UV_Students.Table_Name)
			.getPO(getUV_Students_ID(), get_TrxName());	}

	/** Set UV Students ID.
		@param UV_Students_ID UV Students ID	  */
	public void setUV_Students_ID (int UV_Students_ID)
	{
		if (UV_Students_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_UV_Students_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_UV_Students_ID, Integer.valueOf(UV_Students_ID));
	}

	/** Get UV Students ID.
		@return UV Students ID	  */
	public int getUV_Students_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UV_Students_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}