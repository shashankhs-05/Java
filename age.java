class Father {
  public Father(int age) throws WrongAgeException {
    if (age < 0) {
      throw new WrongAgeException();
    }
  }
}

class Son extends Father {
  public Son(int age, int fatherAge) throws WrongAgeException {
    super(fatherAge);
    if (age >= fatherAge) {
      throw new WrongAgeException();
    }
  }
}

class WrongAgeException extends Exception {
  public WrongAgeException() {
    super("Invalid age");
  }
}

class Main {
  public static void main(String[] args) {
    try {
      Father f = new Father(-1);
    } catch (WrongAgeException e) {
      System.out.println(e.getMessage());
    }

    try {
      Son s = new Son(10, 5);
    } catch (WrongAgeException e) {
      System.out.println(e.getMessage());
    }
  }
}
