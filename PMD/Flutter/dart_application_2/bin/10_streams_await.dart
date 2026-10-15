void main(List<String> args) {
  
  emitirNumeros().listen((event) {
    print(event);
  });

}

Stream<int> emitirNumeros() async* {

  final valores = [6,7,8,9,10,11,12,13,14,15,16,17,18,19,20];

  for (int i in valores) {
    await Future.delayed(Duration(seconds: 1));
    yield i; 
  }

}
