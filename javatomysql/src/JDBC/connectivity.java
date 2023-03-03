package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectivity 
  {  
	
	public static void main(String[] args)  	
	{ 		
		try 		
		{ 			
			Class.forName("com.mysql.jdbc.Driver"); 			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ccprogram","root","vaishnavi"); 			
			Statement st=(Statement) conn.createStatement(); 
			/*String str="insert into itemployee values(113,'Rutuja',23,'Manager',450000)";
			st.executeUpdate(str);
			*/
			/*String str1="update itemployee set eage=27 where ename='Rutuja'";
    		st.executeUpdate(str1);
    		*/
			String str2="delete from itemployee where ename='Rutuja'";
			st.executeUpdate(str2);
			ResultSet rset=st.executeQuery("select * from itemployee"); 			
			while(rset.next()) 			
			{ 				
				System.out.println(rset.getString(1)+"           "+rset.getString(2)+"              "+rset.getString(3)+"                   "+rset.getString(4)+"                   "+rset.getString(5));  		
				} 			 		
			} catch (Exception e)  
		{ 			
				System.out.println("The error are:   " + e); 		
				} 	
		} 
	}

