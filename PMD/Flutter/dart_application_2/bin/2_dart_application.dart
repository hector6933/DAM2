import 'package:dart_application_2/dart_application_2.dart' as dart_application_2;

void main(List<String> arguments) {

  // Los maps son pares de valores
  final Map<String,dynamic> pokemon = {

    "nombre": "Ditto",
    "hp": 100,
    "isAlive": true,
    "sprites": {
      1: "ditto/front.jpg",
      2: "ditto/back.jpg"
    }
  };

  print(pokemon);
  
  print("Nombre: ${pokemon["nombre"]}");
  print("Sprites: ${pokemon["sprites"]}");

  print("Cosa: ${pokemon["sprites"][1]}");
  
}
