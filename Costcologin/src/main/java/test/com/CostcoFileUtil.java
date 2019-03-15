/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

/**
 *
 * @author vinot
 */
public class CostcoFileUtil {
    Costcologin login;
   
private void loadFile(){
    try {
            FileReader fr = new FileReader("C:\\data\\data.txt");
            BufferedReader br = new BufferedReader(fr);
            //username
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, "=");
            st.nextToken();
            String username = (String)st.nextToken();
            //password
             line = br.readLine();
             st = new StringTokenizer(line, "=");
             st.nextToken();
             String password = (String)st.nextToken();
            
             //populate values
             login = new Costcologin();
             login.setUsername(username);
             login.setPassword(password);
            
             //print object
             System.out.println(login);
             
             //close file
             br.close();
             fr.close();
             
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        
    }

    public CostcoFileUtil() {
        loadFile();
    }
    
    
            
    public String getUsername() {
     
        return login.getUsername();
    }
    
    public String getPassword() {
        return login.getPassword();
    }
}
