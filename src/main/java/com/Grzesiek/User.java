package com.Grzesiek;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private boolean isAdmin;
    private int score;
}
