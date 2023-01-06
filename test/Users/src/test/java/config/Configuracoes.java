package config;

import org.aeonbits.owner.Config;

@Config.Sources("file:src\\test\\resources\\hti.properties")
public interface Configuracoes extends Config {

    @Key("baseURI")
    String baseURI();

    @Key("basePath")
    String basePath();


}
