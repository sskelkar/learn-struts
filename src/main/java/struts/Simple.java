package struts;

import com.opensymphony.xwork2.ActionSupport;

public class Simple extends ActionSupport {
  private String title = "this is a simple action";

  @Override
  public String execute() {
    return "ok";
  }

  public String getTitle() {
    return title;
  }
}
