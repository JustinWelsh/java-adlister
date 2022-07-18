package beans;

import java.io.Serializable;

public class Author implements Serializable {

    private long id;
    private String first_name;
    private String last_name;

    public Author() {
    }

    public Author(long id, String first_name, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Author(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
