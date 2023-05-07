class Ship extends Transport {
  private String captainName;

  public Ship(String title, int capacity, int speed, String captainName) {
    super(title, capacity, speed);
    this.captainName = captainName;
  }

  public void captainGreeting() {
    System.out.println("Captain " + captainName + " welcomes you aboard " + getTitle() + ".");
  }

  public String getCaptainName() {
    return captainName;
  }

  public void setCaptainName(String captainName) {
    this.captainName = captainName;
  }
}