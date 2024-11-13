package com.fintech.app.fintech.model;

import java.util.Date;
import java.util.List;

public class User {
    public long id;
    public long cd_cpf;
    public String first_name;
    public String last_name;
    public String email;
    public String password;
    public Date birth_data;
    public Integer nm_phone;

    public void User(
            long id, long cd_cpf, String first_name, String last_name, String email, String password, Date birth_data, Integer nm_phone){
        this.id = id; this.cd_cpf = cd_cpf; this.first_name = first_name; this.last_name = last_name; this.email = email; this.password = password; this.birth_data = birth_data; this.nm_phone = nm_phone;
    }
    public void User(){

    }
}
