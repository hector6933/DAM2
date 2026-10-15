import 'dart:async';

void main(List<String> args) {
  print("Inicio del programa");

  httpGet("http://www.google.es")
    .then((value) => print(value))
    .catchError((err) => print(err));

  print("Fin del programa");
}

Future<String> httpGet(String url) {
  return Future.delayed(Duration(seconds: 2), () {
    return "Respuesta de la petición http";
    // throw "ERRORRRR";
  });
}
