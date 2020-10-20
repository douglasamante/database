
package Model;

import View.login;

public class show {
    
    static login Login;
    
    public void showLogin(auth Auth){
        
        show.Login = new login(Auth);
        show.Login.setLocationRelativeTo(null);
        show.Login.setVisible(true);
        
    }
    
}
