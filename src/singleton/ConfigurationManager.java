package singleton;

public class ConfigurationManager {
    private String companyName;
    private double taxRate;
    private String operationalMode;

    private static ConfigurationManager instance;
    private ConfigurationManager(){
        companyName = "ABC Group";
        taxRate = 0.12;
        operationalMode="Production";
    }
    public static ConfigurationManager getInstance(){
        if (instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public String getOperationalMode() {
        return operationalMode;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
}
