/*
 * Copyright 2002-2005 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */	
package test.net.sf.sojo.model;


public class Address {
	
	private String city = null;
	private String postcode = null;
	private Customer customer = null;
	
	
	public String getCity() { return city; }
	public void setCity(String pvCity) { city = pvCity; }
	
	public Customer getCustomer() { return customer; }
	public void setCustomer(Customer pvCustomer) { customer = pvCustomer; }
	
	public String getPostcode() { return postcode; }
	public void setPostcode(String pvPostcode) { postcode = pvPostcode; }
	
}
