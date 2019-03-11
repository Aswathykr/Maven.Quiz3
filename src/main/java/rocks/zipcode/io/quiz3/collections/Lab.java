package rocks.zipcode.io.quiz3.collections;

import java.util.Objects;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lab)) return false;
        Lab lab = (Lab) o;
        return Objects.equals(labName, lab.labName);
    }

    String labName;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {
        return labName;
    }

    @Override
    public int compareTo(Object o) {
        Lab lab = (Lab) o;
        return this.getName().compareTo(lab.getName());
    }
}
