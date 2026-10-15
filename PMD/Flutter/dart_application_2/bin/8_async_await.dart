import 'dart:async';

void main(List<String> args) async {
  print("Inicio del programa");

  final url = "http://www.google.es";

  // httpGet("http://www.google.es")
  //     .then((value) => print(value))
  //     .catchError((err) => print(err));

  try {
    
    final value = await httpGet(url);
    print(value);

  } catch (e) {

    print("Tenemos un error: $e");

  }

  print("Fin del programa");
}

Future<String> httpGet(String url) async {
  await Future.delayed(Duration(seconds: 3));
  return 'Respuesta de la petición http';
}

// Future<String> httpGet(String url) {
//   return Future.delayed(Duration(seconds: 2), () {
//     return "Respuesta de la petición http";
//     // throw "ERRORRRR";
//   });
// }
