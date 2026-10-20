import 'package:flutter/material.dart';
import 'package:p1_contador/presentation/widgets/boton_personalizado.dart';

class ContadorScreen extends StatefulWidget {
  const new({super.key});

  @override
  State<ContadorScreen> createState() => _ContadorScreenState();
}

class _ContadorScreenState extends State<ContadorScreen> {
  int contador = 0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Contador App"),
        backgroundColor: Colors.purple.shade900,
        centerTitle: true,
        leading: IconButton(
          onPressed: () {
            contador = 0;
            setState(() {});
          },
          icon: Icon(Icons.refresh_rounded),
        ),
        actions: [
          IconButton(
            onPressed: () {
              contador = 0;
              setState(() {});
            },
            icon: Icon(Icons.refresh_rounded),
          ),
          IconButton(
            onPressed: () {
              contador = 0;
              setState(() {});
            },
            icon: Icon(Icons.refresh_rounded),
          ),
        ],
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              contador.toString(),
              style: TextStyle(fontSize: 100, fontWeight: .w100),
            ),
            Text(
              contador == 1 ? "Click" : "Clicks",
              style: TextStyle(fontSize: 25),
            ),
          ],
        ),
      ),
      // floatingActionButton: FloatingActionButton(
      //   child: Icon(Icons.access_alarm),
      //   onPressed: () {
      //     setState(() {
      //       contador++;
      //     });
      //     print(contador);
      //   },
      // ),
      floatingActionButton: Column(
        mainAxisAlignment: .end,
        spacing: 20,
        children: [
          CustomButton(
            icono: Icons.plus_one,
            funcion: () => setState(() {
              contador++;
            }),
          ),
          CustomButton(
            icono: Icons.exposure_minus_1_outlined,
            funcion: () => setState(() {
              if (contador != 0) contador--;
            }),
          ),
          CustomButton(
            icono: Icons.refresh_rounded,
            funcion: () => setState(() {
              contador = 0;
            }),
          ),
        ],
      ),
    );
  }
}

class CustomButton extends StatelessWidget {
  final IconData icono;
  final VoidCallback funcion;
  const new({super.key, required this.icono, required this.funcion});

  @override
  Widget build(BuildContext context) {
    return FloatingActionButton(
      enableFeedback: true,
      elevation: 5,
      shape: StadiumBorder(),
      onPressed: funcion,
      child: Icon(icono),
    );
  }
}
  