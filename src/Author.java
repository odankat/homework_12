import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

}
