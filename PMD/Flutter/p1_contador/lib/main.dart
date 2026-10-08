import 'package:flutter/material.dart';

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
      home: Scaffold(
        body: Center(
          child: Text("Hola que tal")
        ),
      ) 
    );

  }
  
}