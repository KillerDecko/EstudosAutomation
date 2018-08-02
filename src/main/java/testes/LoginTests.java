package testes;

import core.BaseTest;
import org.junit.Test;
import pages.MainPage;

import static org.junit.Assert.assertEquals;

public class LoginTests extends BaseTest {
    MainPage page = new MainPage();

    @Test
    public void toMakeLogin(){

        assertEquals("Hi, Johny Smith",page.getSuccessMessage());
    }
}
