package movies;

public class Person {
	
	private String firstName;
	private String lastName;
	private	Gender gender; 
	private boolean hasOscar;
	private boolean hasGoldenGlobe;
	
	public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.hasOscar = hasOscar;
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isHasOscar() {
		return hasOscar;
	}

	public void setHasOscar(boolean hasOscar) {
		this.hasOscar = hasOscar;
	}

	public boolean isHasGoldenGlobe() {
		return hasGoldenGlobe;
	}

	public void setHasGoldenGlobe(boolean hasGoldenGlobe) {
		this.hasGoldenGlobe = hasGoldenGlobe;
	}

	public String toXMLString()
	{
		StringBuffer xmlStrig = new StringBuffer(Tools.toXMLString("firstName", this.firstName));
		xmlStrig.append(Tools.toXMLString("lastName", this.lastName));
		xmlStrig.append(Tools.toXMLString("gender", this.gender.toString()));
		xmlStrig.append(Tools.toXMLString("hasOscar", Boolean.toString(this.hasOscar)));
		xmlStrig.append(Tools.toXMLString("hasGoldenGlobe", Boolean.toString(this.hasGoldenGlobe)));
		
		return xmlStrig.toString();
	}
	
}
