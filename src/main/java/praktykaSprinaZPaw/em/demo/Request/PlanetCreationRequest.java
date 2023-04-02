package praktykaSprinaZPaw.em.demo.Request;

public class PlanetCreationRequest {
    private String name;
    private String type;
    private int size;

    public PlanetCreationRequest(String name, String type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSice() {
        return size;
    }

    @Override
    public String toString() {
        return "PlanetCreationRequest{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", sice=" + size +
                '}';
    }
}
