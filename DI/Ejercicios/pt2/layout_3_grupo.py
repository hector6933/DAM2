from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        padreH = QHBoxLayout()
        vertical1 = QVBoxLayout()
        vertical2 = QVBoxLayout()
        grupo1 = QGroupBox("Opciones")
        grupo2 = QGroupBox("Botones")
        
        
        radio1 = QRadioButton("Opción 1")
        radio2 = QRadioButton("Opción 2")
        radio3 = QRadioButton("Opción 3")
        radio1.clicked.connect(self.mostrarOpcion)
        radio2.clicked.connect(self.mostrarOpcion)
        radio3.clicked.connect(self.mostrarOpcion)
        
        vertical1.addWidget(radio1)
        vertical1.addWidget(radio2)
        vertical1.addWidget(radio3)
        grupo1.setLayout(vertical1)
        
        
        boton1 = QPushButton("Botón 1")
        boton2 = QPushButton("Botón 2")
        boton3 = QPushButton("Botón 3")
        boton1.clicked.connect(self.mostrarBoton)
        boton2.clicked.connect(self.mostrarBoton)
        boton3.clicked.connect(self.mostrarBoton)
        vertical2.addWidget(boton1)
        vertical2.addWidget(boton2)
        vertical2.addWidget(boton3)
        grupo2.setLayout(vertical2)
        
        padreH.addWidget(grupo1)
        padreH.addWidget(grupo2)
        
        widget = QWidget()
        widget.setLayout(padreH)
        
        self.setCentralWidget(widget)
    
    def mostrarOpcion(self):
        print(f"{self.sender().text()} marcada")
    
    def mostrarBoton(self):
        print(f"{self.sender().text()} pulsado")

app = QApplication([])
window = MainWindow()
window.show()
app.exec()

