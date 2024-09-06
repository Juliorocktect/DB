package com.inf.DB.Repo;

import org.springframework.stereotype.Repository;
import java.SQL.*;

@Repository
public class BuchRepo {
    private final String URL = "jdbc:postgresql://localhost:5432/app";
    private final String USER = "user";
    private final String passwd = "postgres";
    
}
