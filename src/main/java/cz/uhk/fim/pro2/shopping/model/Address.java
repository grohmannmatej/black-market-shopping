package cz.uhk.fim.pro2.shopping.model;

public class Address {
    private String street;
    private String city;
    private String country;
    private String zip;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getZip() {
        return zip;
    }

    public Address(String street, String city, String country, String zip) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
    }

    public Address() {
    }
}
