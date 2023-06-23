
package travel.management.system;

import java.sql.*;
public class ConnTest {
    public static void main(String args[]) {
        
        String query="select username from account where password=1234";
        try {
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                rs.next();
                
                String name=rs.getString("username");
                System.out.println(name);
            }catch(Exception e) {
                e.printStackTrace();
            }
    }   
}