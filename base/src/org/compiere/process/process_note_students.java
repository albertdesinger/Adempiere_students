package org.compiere.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import org.compiere.util.DB;
import org.compiere.util.Env;
import org.uv.model.X_UV_Materials_Student;
import org.uv.model.X_UV_Students;

public class process_note_students extends SvrProcess {

	int 					 uv_students_id;
	X_UV_Materials_Student   uv_materials_student;
	int 					 list_not_null = 0;
	X_UV_Students 			 uv_students;
	
	@Override
	protected void prepare() {
		// TODO Auto-generated method stub
		
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null){ 
				
			}else if (name.equals("UV_Students_ID")){
				uv_students_id = para[i].getParameterAsInt(); 
				list_not_null = 1;
			}else{
				log.log(Level.SEVERE, "Unknown Parameter: "+name);
			}
		}

	}

	@Override
	protected String doIt() throws Exception {
		// TODO Auto-generated method stub
		//Make the connection with data bade students
		PreparedStatement pstm = null;
		String 			  message = "";
		String 			  name_materials ="";
		int 			  prom = 0;
		ResultSet 		  rs = null;
		int 			  Verd = 0;
		//String sql = "SELECT sum(uv_details_students.note), count(uv_details_students.note) AS cant_note, uv_details_students.uv_materials_student_id ,uv_details_students.uv_students_id, uv_students.name AS name_estudiante FROM uv_details_students, uv_students WHERE uv_details_students.uv_students_id = "+uv_students_id+" AND uv_students.uv_students_id = uv_details_students.uv_students_id GROUP BY uv_details_students.uv_materials_student_id, uv_details_students.uv_students_id ,uv_students.name";
		
		String sql = "SELECT sum(uv_details_students.note), count(uv_details_students.note) AS cant_note, uv_details_students.uv_materials_student_id ,uv_details_students.uv_students_id, uv_students.name AS name_estudiante FROM uv_details_students, uv_students WHERE uv_students.uv_students_id = uv_details_students.uv_students_id";
		if(list_not_null!=0) sql+=" AND  uv_details_students.uv_students_id = "+uv_students_id+"";
		sql+=" GROUP BY uv_details_students.uv_materials_student_id, uv_details_students.uv_students_id ,uv_students.name  ";
		
		try{
			
			pstm = DB.prepareStatement(sql, null);
			rs =   pstm.executeQuery();
			
			uv_students  = new X_UV_Students(Env.getCtx(),uv_students_id, get_TrxName());
			message+= "Estudiante: "+uv_students.getName()+" \n";
			while(rs.next()){
				prom = rs.getInt(1)/rs.getInt(2);
				uv_materials_student = new X_UV_Materials_Student(getCtx(),rs.getInt(3), get_TrxName());
				name_materials =	   uv_materials_student.getName();
				message+= "Materia: "+name_materials+" \t Promedio: "+prom;
				message+="\n\n";
				Verd = 1;
			}
		}catch(SQLException ex){
			log.log(Level.SEVERE, sql, ex);
			return ex.getLocalizedMessage();
		}
		
		if (Verd == 0) message = "Este usuario no posee materias"; 
			
			
		
		return message;
	}

	
	
	
	
	
}
