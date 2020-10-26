
package Control;

import View.edit;
import View.browser;
import View.login;
import Model.*;
import java.util.ArrayList;


       

public class MEI_TRAB {

    
    public static void main(String[] args) {
      
        show S_window = new show();
        auth Auth = new auth();
        browser Browser = new browser();
        edit Edit = new edit();
        
        
        
        S_window.showLogin(Auth);
        
    }
    
}
