package factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.NewUser;
import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class NewUserFactory {

    public NewUser newUser;

    public NewUserFactory() throws IOException {
        newUser = new ObjectMapper()
                .readValue(new FileImageInputStream
                        (new File("src\\test\\resources\\resquestBody\\newUserPOST")
                        ), NewUser.class);
    }
}