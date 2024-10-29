/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package super_market_billing_management;
import Login.LoginForm;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author LENOVO
 */
public class Super_Market_Billing_Management {
    
      // Connect to MySQL
     public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket_db", "root", "password");
            System.out.println("First db connection success " );
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return conn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Connection conn = getConnection(); 
          LoginForm loginForm = new LoginForm(conn);
          loginForm.setVisible(true);
        
          System.out.println(conn+"con");
      

    }
    
}
