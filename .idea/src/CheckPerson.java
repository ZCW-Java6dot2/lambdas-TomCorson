

public interface CheckPerson {
    default boolean test(Person p) {
        return false;
    }
}
