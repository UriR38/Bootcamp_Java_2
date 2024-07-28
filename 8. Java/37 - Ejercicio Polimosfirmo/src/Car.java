class Car {
    String company;
    int speed;

    public Car(String company, int speed) {
        this.company = company;
        this.speed = speed;
    }

    void getSpeed() {
        System.out.println(company + " car's speed is " + speed + " Km/hr");
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    String getCompany() {
        return company;
    }

    void setCompany(String company) {
        this.company = company;
    }
}
