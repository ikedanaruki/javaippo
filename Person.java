class Person {
  int weight;
  void eatCake(int g, int count) {
    System.out.println(g + "gのケーキを"+ count +"個食べます");
    weight = weight + g * count;
  }

  void printWeight() {
    System.out.println(weight);
  }

  int getWeight() {
    return weight; 
  }  
}
