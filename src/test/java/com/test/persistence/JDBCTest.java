package com.test.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {

static {
	try {
		Class.forName("org.postgresql.Driver");
	} catch (Exception e) {
		e.printStackTrace();
	}
}

@Test
public void testConnection() {
	
	try(Connection con =
			DriverManager.getConnection(
					"jdbc:postgresql://192.168.5.22/sampledb",
					"testuser",
					"1234")){
		
		log.info(con);
	} catch (Exception e) {
		fail(e.getMessage());
	}
}
}
