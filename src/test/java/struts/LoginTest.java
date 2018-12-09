package struts;

import com.opensymphony.xwork2.ActionProxy;
import org.apache.struts2.StrutsTestCase;
import org.junit.Test;

public class LoginTest extends StrutsTestCase {

  @Test
  public void testThatLoginSucceedsWhenInputIsCorrect() throws Exception {
    assertEquals(1, 1);
    request.setParameter("userName", "test");
    request.setParameter("password", "test");

    ActionProxy actionProxy = getActionProxy("/login.action");
    Login loginAction = (Login) actionProxy.getAction();

    assertNotNull(loginAction);

    String result = actionProxy.execute();

    assertEquals("success", result);
  }

  @Test
  public void testThatLoginFailsWhenInputIsNotCorrect() throws Exception {
    assertEquals(1, 1);
    request.setParameter("userName", "");
    request.setParameter("password", "");

    ActionProxy actionProxy = getActionProxy("/login.action");
    Login loginAction = (Login) actionProxy.getAction();

    assertNotNull(loginAction);

    String result = actionProxy.execute();

    assertEquals("fail", result);
  }
}
