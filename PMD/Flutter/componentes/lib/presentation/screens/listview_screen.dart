import 'package:flutter/material.dart';

class ListviewScreen extends StatelessWidget {
  final games = [
    "Sonic",
    "Rocket Night Adventures",
    "Cool Spot",
    "Street Fighter II",
    "Street os Rage 2",
  ];

  ListviewScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Listview tipo 1")),
      body: ListView(
        children: [
          Text("Hola a DAM2"),

          ...games.map( (juego) => ListTile(
              leading: Icon(Icons.access_alarm),
              title: Text(juego),
              onTap: () => {},
              subtitle: Text("Lorem Ipsum dolor sit amet. Porro!"),
              trailing: Icon(Icons.arrow_forward_ios),
            ),
          ),
          Divider()

        ],
      ),
    );
  }
}

// git commit -m "PMD - Cosas flutter"
