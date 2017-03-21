package com.example.john.laboratorio2;

/**
 * Created by John on 14/03/2017.
 */

public class DataBaseManager {
    public static final String TABLE_NAME="usuarios";
    public static final String TABLE_NAME2="events";
    public static final String CN_ID2="_id";
    public static final String CN_ID="_id";
    public static final String CN_USERNAME="usuario";
    public static final String CN_PASSWORD="password";
    public static final String CN_EMAIL="email";
    public static final String CN_NOMBRE="nombreEvento";
    public static final String CN_LUGAR="lugarEvento";

    public static final String CREATE_TABLE="create table "+TABLE_NAME+" ("
            +CN_ID+ " integer primary key autoincrement,"
            +CN_USERNAME+ " text not null,"
            +CN_PASSWORD+ " text not null,"
            +CN_EMAIL+ " text);";
    public static final String CREATE_TABLE2="create table "+TABLE_NAME2+" ("
            +CN_ID2+ " integer primary key autoincrement,"
            +CN_NOMBRE+ " text not null,"
            +CN_LUGAR+ " text);";

}
