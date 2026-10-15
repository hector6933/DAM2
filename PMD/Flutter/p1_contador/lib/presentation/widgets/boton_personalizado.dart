import 'package:flutter/material.dart';

class BotonPersonalizado extends StatelessWidget {
  
  final IconData icono;
  const new({
    super.key,
    required this.icono
  });

  @override
  Widget build(BuildContext context) {
    return FloatingActionButton(
      child: Icon(icono),
      onPressed: () {
        
      },
    );
  }
}
