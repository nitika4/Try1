/**
 * 
 */
package coreJava.hashCodeEqualsImplementationTest;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author abgupta
 *
 */
public class Employee {

	private String name;
	
	private int age;
	
	private String [] address;
	
	private int [] ids;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String[] getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String[] address) {
		this.address = address;
	}

	/**
	 * @return the ids
	 */
	public int[] getIds() {
		return ids;
	}

	/**
	 * @param ids the ids to set
	 */
	public void setIds(int[] ids) {
		this.ids = ids;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(address);
		result = prime * result + age;
		result = prime * result + Arrays.hashCode(ids);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (!Arrays.equals(address, other.address))
			return false;
		if (age != other.age)
			return false;
		if (!Arrays.equals(ids, other.ids))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + Arrays.toString(address) + ", ids="
				+ Arrays.toString(ids) + "]";
	}
	
	
}
