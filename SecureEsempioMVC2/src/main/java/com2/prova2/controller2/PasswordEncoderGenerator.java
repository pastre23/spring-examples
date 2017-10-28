package com2.prova2.controller2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderGenerator 
{
  public static void main(String[] args) 
  {
	String password = "1234";
	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
	String hashedPassword = passwordEncoder.encode(password);
	System.out.println(hashedPassword);
  }
}