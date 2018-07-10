/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.company.crm.server.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.company.crm.api.domain.Person;

public class PersonImplTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateAgeAsOldie() {
		// Prepare
		Person person = new PersonImpl("Oldie");

		// CUT
		Integer age = person.calculateAge();

		// Asserts
		assertEquals(80, age.intValue());
	}

	@Test
	public void testCalculateAgeAsYoungster() {
		// Prepare
		Person person = new PersonImpl("Lofi");

		// CUT
		Integer age = person.calculateAge();

		// Asserts
		assertEquals(10, age.intValue());
	}

}