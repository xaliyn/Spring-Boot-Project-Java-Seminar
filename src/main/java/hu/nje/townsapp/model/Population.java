package hu.nje.townsapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "populations")
public class Population {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "townid")
    private int townid;

    @Column(name = "ryear")
    private int ryear;

    @Column(name = "women")
    private int women;

    @Column(name = "total")
    private int total;

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public int getTownid() { return townid; }
    public void setTownid(int townid) { this.townid = townid; }

    public int getRyear() { return ryear; }
    public void setRyear(int ryear) { this.ryear = ryear; }

    public int getWomen() { return women; }
    public void setWomen(int women) { this.women = women; }

    public int getTotal() { return total; }
    public void setTotal(int total) { this.total = total; }
}
