package lt.devopspro;


import lt.devopspro.model.LoginForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

    @Autowired
    private MockMvc mvc;



    @Test
    public void postSignUp() throws Exception {

        mvc.perform(MockMvcRequestBuilders.post("/signup").accept(MediaType.APPLICATION_JSON));
    }

    @Test
    public void postLogin() throws Exception {

        LoginForm loginForm = new LoginForm("user", "123456");

        mvc.perform(MockMvcRequestBuilders.post("/login", loginForm).accept(MediaType.APPLICATION_JSON));

    }
}