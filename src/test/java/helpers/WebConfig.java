package helpers;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:~/w/qa_guru_2021/19_Mobile_1/credentials.properties",
        "system:properties"
})
public interface WebConfig extends Config {
    @Key("Password")
    String Password();

    @Key("Username")
    String Username();
}

