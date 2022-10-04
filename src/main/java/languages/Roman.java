package languages;

import lombok.Data;

@Data
public class Roman {
    private String writing;
    private int value;

    public Roman(String writing, int value) {
        this.writing = writing;
        this.value = value;
    }
}
