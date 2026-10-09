from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QLabel, QLineEdit, QCheckBox
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        boton1 = QPushButton("Botón1")
        boton2 = QPushButton("Botón2")
        boton3 = QPushButton("Botón3")
        
        padreV = QVBoxLayout()
        horizontal1 = QHBoxLayout()
        horizontal1.addWidget(boton1)
        horizontal1.addWidget(boton2)
        
        
        horizontal2 = QHBoxLayout()
        horizontal2.addWidget(boton3)
        padreV.addLayout(horizontal1)
        padreV.addLayout(horizontal2)
        
        widget = QWidget()
        widget.setLayout(padreV)
        
        self.setCentralWidget(widget)
       

app = QApplication([])
window = MainWindow()
window.show()
app.exec()

