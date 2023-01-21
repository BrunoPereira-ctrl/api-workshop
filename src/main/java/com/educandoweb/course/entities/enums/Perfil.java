package com.educandoweb.course.entities.enums;

public enum Perfil {
	
	ADMIN(1, "ROLE_ADMIN"),
	USER(2, "ROLE_USER");
	
	
	private int code;
	private String description;
	
	private Perfil(int code, String descripton) {
		this.code = code;
		this.description = descripton;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static Perfil valueOf(Integer code) {
		
		if(code == null) {
			return null;
		}
		
		for(Perfil value : Perfil.values()) {
			if (code.equals(value.getCode())) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid perfil code");
	}

}
