package struts;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
  private String userName;
  private String password;

  @Override
  public String execute() {
    if(userName.equals("test") && password.equals("test"))
      return "success";
    return "fail";
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
