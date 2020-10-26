
package Model;

import Model.users;
import java.util.ArrayList;
import java.util.Arrays;


public class auth {

    protected ArrayList<users> Users = new ArrayList<users>();
    protected String username; 
    protected char[] password;
    protected String host_name;
    protected String database_name;
    protected static users activeUser = new users();
    
    public void setAuthUsers(ArrayList<users> user){
        this.Users = user;
    }
    
    public static users getActiveUser(){
        return activeUser;
    }
    
    public int SucesssfulLogin(String host_nameTest, String database_nameTest, String usernameTest, char[] passwordTest){
        
        if(Users != null){
            for(users user : Users){
                if(Users != null){
                    password = user.getPassword();
                    host_name = user.getHost_name();
                    database_name = user.getDatabase_name();
                    username = user.getUsername();
                    
                    if(host_name.equals(host_nameTest)){
                        if(database_name.equals(database_nameTest)){
                            if(username.equals(usernameTest)){
                                if(Arrays.equals(password, passwordTest)){
                                    this.activeUser = user;
                                    return -1; //It was a sucess
                                }
                                else{   
                                    return 0; //The Password is wrong
                                }
                            }
                        }
                        
                    }
                }
            }
        }
        return -10; //ERROR
    }
}

