package struts;

import org.apache.struts2.dispatcher.DefaultActionSupport;

public class MyAction extends DefaultActionSupport {
    private String name;

    @Override
    public String execute() {
        name = "David";
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
