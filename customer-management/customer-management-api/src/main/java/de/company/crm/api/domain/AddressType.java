/** 
 * Generated by KissMDA - Simple Java Cartridge - kissmda-cartridges-simple-java.
 * KissMDA: http://kissmda.org
 *  
 * DO NOT EDIT this file manually! All changes will be overwritten by next generation!
 *  
 * Generation date: Mon Jul 09 14:58:16 CEST 2018.
 */
package de.company.crm.api.domain;

public enum AddressType {
	HOME(1), OFFICE(2);
	Integer type;

	private AddressType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}
}