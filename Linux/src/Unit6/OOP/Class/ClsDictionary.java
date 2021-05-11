
package Unit6.OOP.Class;

public class ClsDictionary {

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public String getDecription() {
    return decription;
  }

  public void setDecription(String decription) {
    this.decription = decription;
  }
  private String word;
  private String decription;

  public ClsDictionary() {
  }

  public ClsDictionary(String word, String decription) {
    this.word = word;
    this.decription = decription;
  }
  
}
