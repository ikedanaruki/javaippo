class Sample9 {
  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();
    p1.weight = 45;
    p2.weight = 67;

    System.out.println("p1さんの体重");
    p1.printWeight();
    System.out.println("p2さんの体重");
    p2.printWeight();

    System.out.println("p1さんのおやつ");
    p1.eatCake(400,4);
    System.out.println("p2さんのおやつ");
    for(int i = 0; i < 5; i++) {
      p2.eatCake(200,1);
    } 
    System.out.println("p1さんの体重は" + p1.getWeight() + "kgです");
    p1.printWeight();
    System.out.println("p2さんの体重は" + p2.getWeight() + "kgです");
    p2.printWeight();
  }
}
