package cz.zentity.demo.DTO;

public class CustomerDTO {
    private Long id;
    private String name;
    private String surname;
    private String sex;
    private String nationality;
    private String dateOfBirth;
    private String cardNumber;
    private String cardDateOfIssue;
    private String cardDateOfExpiry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardDateOfIssue() {
        return cardDateOfIssue;
    }

    public void setCardDateOfIssue(String cardDateOfIssue) {
        this.cardDateOfIssue = cardDateOfIssue;
    }

    public String getCardDateOfExpiry() {
        return cardDateOfExpiry;
    }

    public void setCardDateOfExpiry(String cardDateOfExpiry) {
        this.cardDateOfExpiry = cardDateOfExpiry;
    }
}
