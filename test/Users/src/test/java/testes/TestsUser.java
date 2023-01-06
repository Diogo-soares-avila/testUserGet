package testes;

import br.com.getnet.homologacao.lifecycle.TestRuleJupiter;
import br.com.getnet.homologacao.util.Root;
import config.Configuracoes;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.Users_POST;
import java.io.IOException;

@ExtendWith({TestRuleJupiter.class})

public class TestsUser extends Root {

    @BeforeEach
    public void setUp() {
        Configuracoes configuracoes = ConfigFactory.create(Configuracoes.class);
        baseURI = configuracoes.baseURI();
        basePath = configuracoes.basePath();
    }

    @Test
    public void user() throws IOException {
        new Users_POST().testNewUser();
    }
}