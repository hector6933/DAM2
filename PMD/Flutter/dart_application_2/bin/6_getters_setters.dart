void main(List<String> args) {
  final miCuadrado = Cuadrado(lado: 3);

  miCuadrado.lado = -3;
  print("Area: ${miCuadrado.area}");
}

class Cuadrado {
  double _lado = 0;

  Cuadrado({required double lado})
    : assert(lado >= 0, "El lado debe de ser mayor o igual a 0"),
    assert(lado < 10, "El lado debe de ser mayor a 10"),
      _lado = lado;

  double get lado {
    return _lado;
  }

  set lado(double valor) {
    if (valor < 0) throw "El valor debe de ser mayor de 0";

    print("El nuevo valor es $valor");
    _lado = valor;
  }

  double get area {
    return _lado * _lado;
  }
}
