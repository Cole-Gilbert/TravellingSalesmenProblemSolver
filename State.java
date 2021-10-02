public class State {

    private String name;
    private String code;
    private City capital;

    public State(String code, String name) {
        this.name = name;
        this.code = code;
    }

    public String name() { return this.name; }
    public String code() { return this.code; }
    public City capital() { return this.capital; }

    public void capital(City capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
