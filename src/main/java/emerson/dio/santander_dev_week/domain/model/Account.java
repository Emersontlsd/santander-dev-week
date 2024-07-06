package emerson.dio.santander_dev_week.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(scale = 13, precision = 2)
    private Float balance;

    @Column(name = "additional_limit", scale = 13, precision = 2)
    private Float limit;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}

    public String getAgency() {return agency;}

    public void setAgency(String agency) {this.agency = agency;}

    public Float getBalance() {return balance;}

    public void setBalance(Float balance) {this.balance = balance;}

    public Float getLimit() {return limit;}

    public void setLimit(Float limit) {this.limit = limit;}
}
