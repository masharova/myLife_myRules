package selenium.enumeration;

public enum SupportedDrivers {
    CHROME("chrome");
    private String driverName;

    SupportedDrivers(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverName() {
        return driverName;
    }
}
