void main(List<String> args) {
  
  final wolverine = Heroe(nombre: "Logan");
  final ironMan = Heroe(poder: "Millonario y genio", nombre: "Tony Stark");

  print(wolverine.nombre);
  print("${ironMan.nombre} ${ironMan.poder}");

  print(ironMan);

}

class Heroe {

  String nombre;
  String? poder;

  Heroe({
    required this.nombre,
    this.poder = "ninguno"
  });


  @override
  String toString(){

    return "$nombre - $poder";

  }

}