package praktykaSprinaZPaw.em.demo.Request;

public class BuildPortRequest {
    private String planetName;
    private int lvl;

    public BuildPortRequest(String planetName, int lvl) {
        this.planetName = planetName;
        this.lvl = lvl;
    }

    public BuildPortRequest() {
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getPlanetName() {
        return planetName;
    }

    public int getLvl() {
        return lvl;
    }

    @Override
    public String toString() {
        return "BuildPortRequest{" +
                "planetName='" + planetName + '\'' +
                ", lvl=" + lvl +
                '}';
    }
}
