package test.ase.demo;

import java.io.Serializable;

public class Blog2Id implements Serializable {
    private int id;

    private String title;

    public Blog2Id(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // equals() and hashCode()

}