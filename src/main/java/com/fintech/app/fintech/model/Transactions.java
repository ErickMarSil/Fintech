package com.fintech.app.fintech.model;

import java.sql.Date;

public class Transactions {
    public long id;
    public Date expense_date;
    public String payment_type;
    public Double amount;
    public String recipient_account_name;
}
