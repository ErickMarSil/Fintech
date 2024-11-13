    package com.fintech.app.fintech.services.querycontroll;

import java.io.*;

public class GetterQuery {
    public static String get_query(String name) throws Exception {
        StringBuilder query = new StringBuilder();
        try (InputStream inputStream = GetterQuery.class.getResourceAsStream("/com/fintech/app/fintech/services/querycontroll/" + name);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            String line;
            while ((line = reader.readLine()) != null) {
                query.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return query.toString().trim();
    }
}
