from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QPushButton

class MainWindow(QMainWindow): # Creación de una clase
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        boton = QPushButton("Pulsa")
        
        self.setFixedSize(QSize(200,200)) # Tamaño fijo de la ventana
        
        self.setCentralWidget(boton) # Meto el botón

app = QApplication([])

window = MainWindow()

window.show()

app.exec()