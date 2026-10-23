import 'package:flutter/material.dart';

class Listview2Screen extends StatelessWidget {
  final games = [
    "Sonic",
    "Rocket Night Adventures",
    "Cool Spot",
    "Street Fighter II",
    "Street os Rage 2",
  ];

  Listview2Screen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Listview tipo 2")),
      body: ListView.separated(
        itemBuilder: (context, index) => Text(games[index]),
        separatorBuilder: (_, _) => Divider(),
        itemCount: games.length,
      ),
    );
  }
}

// git commit -m "PMD - Cosas flutter"
