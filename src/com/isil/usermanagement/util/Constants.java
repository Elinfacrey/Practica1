package com.isil.usermanagement.util;

public class Constants {
	//Constantes
   public static final String JDBC_CLASS="com.mysql.jdbc.Driver";
   public static final String JDBC_URL="jdbc:mysql://localhost:3306/demo?useSSL=false&&serverTimezone=UTC";
   public static final String JDBC_USERNAME="mysql_dev";
   public static final String JDBC_PASSWORD="123456";
   
   
    public static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, lastname, average) VALUES "
			+ " (?, ?, ?);";
	public static final String SELECT_USER_BY_ID = "select id,name,lastname,average from users where id =?";
	public static final String SELECT_ALL_USERS = "select * from users";
	public static final String DELETE_USERS_SQL = "delete from users where id = ?;";
	public static final String UPDATE_USERS_SQL = "update users set name = ?,lastname= ?, average =? where id = ?;";
   
}
