package Java240612.car;

public class Car {
  public int getGear() {
    return gear;
  }

  public String getWheel() {
    return wheel;
  }

  public int getCc() {
    return cc;
  }

  public String getLogo() {
    return logo;
  }

  public String getEngine() {
    return engine;
  }

  public String getCompany() {
    return company;
  }

  private int speed;
  private int gear;

  public boolean isStop() {
    return stop;
  }

  private boolean stop;

  public void setGear(int gear) {
    this.gear = gear;
  }

  public void setCc(int cc) {
    this.cc = cc;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public void setTest(String test) {
    this.test = test;
  }

  private String wheel;
  private int cc;
  private String logo;
  private String engine;

  protected String company = "weniv";
  public String test = "test";

  public Car(int speed, int gear) {
    this.speed = speed;
    this.gear = gear;
  }

  // Getter
  public double getSpeed() {
    return this.speed * 1.6;
  }

  // Setter
  public void setSpeed(int speed) {
    this.speed = this.speed < 0 ? 0 : speed;

    if (0 <= speed && speed <= 30) {
      this.gear = 1;
    } else if (30 < speed && speed <= 70) {
      this.gear = 2;
    } else {
      this.gear = 3;
    }
  }

  public void checkSpeed() {
    System.out.println(this.speed);
  }

  public void setWheel(String wheel) {
    this.wheel = wheel;
  }
}
