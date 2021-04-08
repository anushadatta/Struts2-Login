package Controller;

import com.opensymphony.xwork2.ActionSupport;

import Model.User;

public class LoginController extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private User userBean;
    private static SQLController dbController = new SQLController();
 
    public LoginController() {
        super();
    }

    public User getUserBean() {
        return userBean;
    }
    
    public void setUserBean(User user) {
        userBean = user;
    }
    
    public String execute() throws Exception {
        dbController.connect();
        //call Service class to store userBean's state in database
        User userSession = dbController.checkLogin(userBean.getUsername(), userBean.getPassword());
        if (userSession != null){
            return "SUCCESS";
        }
        addActionError("Incorrect Username/Password!");
        return "ERROR";
    }
    
    public void validate(){
        if (userBean.getUsername().length() == 0) {
            addFieldError("userBean.username", "Username is required.");
        }

        if (userBean.getPassword().length() == 0) {
            addFieldError("userBean.password", "Password is required.");
        }
    }
 
}