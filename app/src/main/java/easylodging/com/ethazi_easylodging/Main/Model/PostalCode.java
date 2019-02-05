package easylodging.com.ethazi_easylodging.Main.Model;

public class PostalCode {
    private String postalCode;
    private String territory;
    private String municipalityCode;
    private String municipality;

    public PostalCode() {
    }

    public PostalCode(String postalCode, String territory, String municipalityCode, String municipality) {
        this.postalCode = postalCode;
        this.territory = territory;
        this.municipalityCode = municipalityCode;
        this.municipality = municipality;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getMunicipalityCode() {
        return municipalityCode;
    }

    public void setMunicipalityCode(String municipalityCode) {
        this.municipalityCode = municipalityCode;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }
}
