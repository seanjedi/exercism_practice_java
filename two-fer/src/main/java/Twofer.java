import static java.util.Optional.ofNullable;

public class Twofer {
    public String twofer(String name) {
        if (name == null) name = "you";
        return String.format("One for %s, one for me.", ofNullable(name).orElse("you"));
    }
}
