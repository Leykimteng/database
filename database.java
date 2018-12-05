package data;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class database {
    public static Connection conn = null;
    public static void getcon() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver"); 
        database.conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/mysql", "root", "");
    };
    public static void insert(student s1) throws SQLException, ClassNotFoundException{
        database.getcon();
        database.conn.createStatement().execute("insert into student value("+s1.getId()+" , '"+s1.getName()+"');");
    }
    public static void insertmulti(ArrayList<student> list) throws SQLException, ClassNotFoundException{
        
        for(student s1:list){
            database.insert(s1);
        }
    }
    public static student viewData(int id) throws SQLException, ClassNotFoundException{
        database.getcon();
        PreparedStatement ps =  database.conn.prepareStatement("select * from student where id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        student s1 = new student(rs.getInt(1),rs.getString(2));
        return s1;
    }
    public static student[] viewmulti(int i[]) throws SQLException, ClassNotFoundException{
        student s[] = new student[20];
        for(int j=0;j<i.length;j++){
            s[j] = database.viewData(i[j]);
        }
        return s;
    }
}
