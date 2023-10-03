package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<String[]> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param firstName   first name of the frogger
     * @param lastName    last name of the frogger
     * @param phoneNumber phone number of the frogger
     * @param zipCode     zip code of the frogger
     * @param state       state of the frogger
     * @param gender      gender of the frogger
     * @return Return false if the record has existed. Else, return true.
     */
    public boolean addRecord(FroggerID frog) {
        for (String[] row : this.records) {
            if (row[0].equals(frog.firstName())
                    && row[1].equals(frog.lastName())
                    && row[2].equals(frog.phoneNumber())
                    && row[3].equals(frog.zipCode())
                    && row[4].equals(frog.state())
                    && row[5].equals(frog.gender())) {
                return false;
            }
        }
        this.records.add(
                new String[]{frog.firstName(), frog.lastName(), frog.phoneNumber(), frog.zipCode(), frog.state(), frog.gender()});
        return true;
    }
}