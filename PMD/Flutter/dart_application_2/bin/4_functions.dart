void main(List<String> args) {
  
  print(saludar()); 

  print(sumar(64, 3));

  print("Sumar Opcional: ");
  print(sumarOpcional(50));
  print(sumarOpcional(50,50));

  print(saludoCompleto(mensaje: "Que te den", nombre: "Iker"));

}

String saludar() => "Hola Alberto!";

int sumar(int a, int b) => a + b;

int sumarOpcional(int a, [int b = 0]) => a + b;

String saludoCompleto({required String nombre, String mensaje = "HOLA!!, "}){

  return "$mensaje $nombre";

}
