package ss16_io_text_file.bai_tap.read_file_csv.model;

public class Nation {
    int id;
    String acronym;
    String nationName;

    public Nation() {
    }

    public Nation(int id, String acronym, String nationName) {
        this.id = id;
        this.acronym = acronym;
        this.nationName = nationName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    @Override
    public String toString() {
        return "Nation{" +
                "id=" + id +
                ", acronym='" + acronym + '\'' +
                ", nationName='" + nationName + '\'' +
                '}';
    }
}
