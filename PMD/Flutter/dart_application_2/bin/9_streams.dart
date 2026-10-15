void main(List<String> args) {
  
  emitirNumeros().listen((event) {
    print(event);
  });

}

Stream<int> emitirNumeros(){

  return Stream.periodic(Duration(seconds: 1), (value) {
    return value; 
  }).take(5);

}