package ru.srqa.pft.addressbook.model;

public class UserData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String company;
    private final String address;
    private final String mobileTelephoneNumber;
    private final String email;

    public UserData(String firstName, String middleName, String lastName, String nickName, String company, String address, String mobileTelephoneNumber, String email) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.company = company;
        this.address = address;
        this.mobileTelephoneNumber = mobileTelephoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileTelephoneNumber() {
        return mobileTelephoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
