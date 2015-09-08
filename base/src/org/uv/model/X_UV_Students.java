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

/** Generated Model for UV_Students
 *  @author Adempiere (generated) 
 *  @version Costumizacion por alberto XD - $Id$ */
public class X_UV_Students extends PO implements I_UV_Students, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20150904L;

    /** Standard Constructor */
    public X_UV_Students (Properties ctx, int UV_Students_ID, String trxName)
    {
      super (ctx, UV_Students_ID, trxName);
      /** if (UV_Students_ID == 0)
        {
			setCI (0);
			setUV_Students_ID (0);
        } */
    }

    /** Load Constructor */
    public X_UV_Students (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_UV_Students[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set CI.
		@param CI CI	  */
	public void setCI (int CI)
	{
		set_Value (COLUMNNAME_CI, Integer.valueOf(CI));
	}

	/** Get CI.
		@return CI	  */
	public int getCI () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CI);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
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