package helpers;

import org.aeonbits.owner.ConfigFactory;

public class CredentialsConfig
{

    public static String userName() {
        return getConfig().userName();
    }

    public static String password() {
        return getConfig().password();
    }

    private static WebConfig getConfig() {
        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }
}
