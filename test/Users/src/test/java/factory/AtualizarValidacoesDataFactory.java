package factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import pojo.AtualizarValidacoes;
import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class AtualizarValidacoesDataFactory {

    public AtualizarValidacoes atualizarValidacoes;

    public AtualizarValidacoesDataFactory() throws IOException {

        //1 - criar variavel com o POJO relacionado
        //2 - serializar do arquivo para o pojo
        atualizarValidacoes = new ObjectMapper()
                .readValue(new FileImageInputStream
                        (new File("src\\test\\resources\\resquestBody\\atualizarValidacoesPOST")
                        ), AtualizarValidacoes.class);
    }
}
