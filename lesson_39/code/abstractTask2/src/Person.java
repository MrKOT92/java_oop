public  class Person {
  private String fullName;
  private String driverLicence;

  public Person(String fullName, String driverLicence) {
    this.fullName = fullName;
    this.driverLicence = driverLicence;
  }
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getDriverLicence() {
    return driverLicence;
  }

  public void setDriverLicence(String driverLicence) {
    this.driverLicence = driverLicence;
  }

  @Override
  public String toString() {
    return "Person{" +
        "fullName='" + fullName + '\'' +
        ", driverLicence='" + driverLicence + '\'' +
        '}';
  }
}


