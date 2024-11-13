package com.fintech.app.fintech.services.enviroment;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvController {
    protected static Dotenv denv = Dotenv.load();
    public static String getFromEnv(String node){
        return denv.get(node);
    }
}
