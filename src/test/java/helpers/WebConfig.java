package helpers;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:~/w/qa_guru_2021/19_Mobile_1/credentials.properties",
        "classpath:credentials.properties"
})
public interface WebConfig extends Config {
    @Key("password")
    String password();

    @Key("userName")
    String userName();
}

