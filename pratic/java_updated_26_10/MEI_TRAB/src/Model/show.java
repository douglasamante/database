
package Model;

import View.*;

public class show {
    
    static login Login;
    static application Application;
    static edit Edit;
    static log Log;
    static time_log TimeLog;
    static browser Browser;
    static search Search;
    
    public void showLogin(auth Auth){
        
        show.Login = new login(Auth);
        show.Login.setLocationRelativeTo(null);
        show.Login.setVisible(true);
        
    }
    
    public void unshowLogin(auth Auth){
        show.Login.setVisible(false);
    }
    
    public void showApplication(){
        show.Application = new application();
        show.Application.setLocationRelativeTo(null);
        show.Application.setVisible(true);
    }
    
    public void unshowApplication(){
        show.Application.setVisible(false);
    }
    
    
    public void showEdit(){
        show.Edit = new edit();
        show.Edit.setLocationRelativeTo(null);
        show.Edit.setVisible(true);
    }
    
    public void unshowEdit(){
        show.Edit.setVisible(false);
    }
    
    public void showBrowser(){
        show.Browser = new browser();
        show.Browser.setLocationRelativeTo(null);
        show.Browser.setVisible(true);
    }
    
    public void unshowBrowser(){
        show.Browser.setVisible(false);
    }
    
    public void showLog(){
        show.Log = new log();
        show.Log.setLocationRelativeTo(null);
        show.Log.setVisible(true);
    }
    
    public void unshowLog(){
        show.Log.setVisible(false);
    }
    
    public void TimeLog(){
        show.TimeLog = new time_log();
        show.TimeLog.setLocationRelativeTo(null);
        show.TimeLog.setVisible(true);
    }
    
    public void unTimeLog(){
        show.TimeLog.setVisible(false);
    }
    
    public void showSearch(){
        show.Search = new search();
        show.Search.setLocationRelativeTo(null);
        show.Search.setVisible(true);
    }
    
    public void unshowSearch(){
        show.Search.setVisible(false);
    }
    
}
