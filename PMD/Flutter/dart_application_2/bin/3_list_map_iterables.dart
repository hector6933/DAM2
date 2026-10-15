void main(List<String> args) {
  
  final numbers = [1,2,3,4,5,6,7,8,9,10,10];

  print("Lista original: $numbers");
  print("Tamaño: ${numbers.length}");
  print("Index 0: ${numbers[0]}");
  print("First: ${numbers.first}");
  print("Iterable Reversed: ${numbers.reversed}");
  print("List Reversed: ${numbers.reversed.toList()}");
  print("Set: ${numbers.reversed.toSet()}");
  numbers.forEach((element) => print(element));

  // Si queremos ordenar con sort es así, como en java y javascript
  numbers.sort((a,b) => b-a);
  print("Lista de mayor a menor: $numbers");

  final numbersMasQue5 = numbers.where((int num) {

    return num > 5;

  });

  print(numbersMasQue5);
  
}