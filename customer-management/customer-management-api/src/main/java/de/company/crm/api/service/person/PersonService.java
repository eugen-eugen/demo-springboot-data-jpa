/** 
 * Generated by KissMDA - Simple Java Cartridge - kissmda-cartridges-simple-java.
 * KissMDA: http://kissmda.org
 *  
 * DO NOT EDIT this file manually! All changes will be overwritten by next generation!
 *  
 * Generation date: Mon Jul 09 14:58:15 CEST 2018.
 */
package de.company.crm.api.service.person;

import java.util.Collection;

import de.company.crm.api.domain.Address;
import de.company.crm.api.domain.Person;
import de.company.crm.api.exception.CreatePersonException;
import de.company.crm.api.exception.FinderException;

public interface PersonService {
	Person createAddressFromPerson(Address address, Person person) throws CreatePersonException;

	Collection<Person> findAllPersons(Integer start, Integer length) throws FinderException;

	Collection<Person> findPersonsByName(String name) throws FinderException;
}
