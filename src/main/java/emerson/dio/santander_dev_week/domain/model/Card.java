package emerson.dio.santander_dev_week.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", scale = 13, precision = 2)
    private Float limit;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}

    public Float getLimit() {return limit;}

    public void setLimit(Float limit) {this.limit = limit;}
}
