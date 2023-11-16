package cz.zentity.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String sex;
    private String nationality;
    private String dateOfBirth;
    private String cardNumber;
    private String cardDateOfIssue;
    private String cardDateOfExpiry;

    public Customer(String name, String surname, String sex, String nationality,
                    String dateOfBirth, String cardNumber, String cardDateOfIssue,
                    String cardDateOfExpiry) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.cardNumber = cardNumber;
        this.cardDateOfIssue = cardDateOfIssue;
        this.cardDateOfExpiry = cardDateOfExpiry;
    }

    public Customer() {

    }
}

