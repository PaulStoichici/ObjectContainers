import java.util.List;

public class Hobby {
    String name;
    int frequency;
    List<String> addresses;

    public Hobby(String name, int frequency, List<String> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<String> getAddresses() {
        return addresses;
    }
    @Override
    public String toString(){
        return "Hobby: "+name +", Frequency: "+ frequency + ",Adrese unde se practica "+ addresses;
    }
}
