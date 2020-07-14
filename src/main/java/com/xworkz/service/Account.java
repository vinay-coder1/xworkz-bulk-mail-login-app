package com.xworkz.service;

public enum Account {
	
	Default(1), Secondary(2);

    private final Integer id;
    
    Account(int id) {
         this.id=id;	
         }
	
	public int getId() {
        return id;
    }
}
