import 'package:flutter/material.dart';
import 'package:p1_contador/presentation/screens/contador-screen.dart';

void main(List<String> args) {
  
  runApp( MyApp() );

  print("HOLA MUNDOOOOOOOOOOOOOOOOOOO");

}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData.dark(),
      home: ContadorScreen()
    );

  }
  
}