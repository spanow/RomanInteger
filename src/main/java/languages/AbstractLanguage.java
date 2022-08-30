package languages;

import lombok.Data;

import java.io.Serializable;

@Data
public class AbstractLanguage implements Serializable {
  private String writing;
  private int value;

  public AbstractLanguage(String writing, int value) {
    this.writing = writing;
    this.value = value;
  }
}
