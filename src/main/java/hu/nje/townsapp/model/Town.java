package hu.nje.townsapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "towns")
public class Town {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tname")
    private String tname;

    @Column(name = "countyid")
    private int countyid;

    @Column(name = "countyseat")
    private int countyseat;

    @Column(name = "countylevel")
    private int countylevel;

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTname() { return tname; }
    public void setTname(String tname) { this.tname = tname; }

    public int getCountyid() { return countyid; }
    public void setCountyid(int countyid) { this.countyid = countyid; }

    public int getCountyseat() { return countyseat; }
    public void setCountyseat(int countyseat) { this.countyseat = countyseat; }

    public int getCountylevel() { return countylevel; }
    public void setCountylevel(int countylevel) { this.countylevel = countylevel; }
}
