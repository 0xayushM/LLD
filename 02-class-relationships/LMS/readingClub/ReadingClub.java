package readingClub;

import java.util.ArrayList;
import java.util.List;
import reader.Reader;

public class ReadingClub {
    private final String clubName;
    List<Reader> readers = new ArrayList<>();

    public ReadingClub(String clubName) {
        this.clubName = clubName;
    }

    public void addMember(Reader reader) {
        readers.add(reader);
    }

    public String getName() {
        return clubName;
    }

    public List<Reader> getMembers() {
        return readers;
    }
}
