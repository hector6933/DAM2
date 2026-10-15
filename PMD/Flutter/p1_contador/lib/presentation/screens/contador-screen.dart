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
      appBar: AppBar(title: Text("Contador App"), centerTitle: true),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              contador.toString(),
              style: TextStyle(fontSize: 100, fontWeight: .w100),
            ),
            Text("Clicks", style: TextStyle(fontSize: 25)),
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
          BotonPersonalizado(icono: Icons.airlines_rounded,),
          BotonPersonalizado(icono: Icons.arrow_upward_outlined,),
          BotonPersonalizado(icono: Icons.blender_sharp,),
        ],
      ),
    );
  }
}
