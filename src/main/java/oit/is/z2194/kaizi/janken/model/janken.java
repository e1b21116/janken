package oit.is.z2194.kaizi.janken.model;

public class janken {
  String Result;

  public janken(String hand) {
    if (hand.equals("Gu")) {
      Result = "Aiko";
    } else if (hand.equals("Pa")) {
      Result = "You Win!";
    } else {
      Result = "You lose";
    }
  }

  public String getResult() {
    return Result;
  }

  public void setAve(String Result) {
    this.Result = Result;
  }
}
