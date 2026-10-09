from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        boton1 = QPushButton()
        boton1.setText("Botón 1")
        boton1.clicked.connect(self.mostrar)
        
        boton2 = QPushButton()
        boton2.setText("Botón 2")
        boton2.clicked.connect(self.mostrar)
        
        boton3 = QPushButton()
        boton3.setText("Botón 3")
        boton3.clicked.connect(self.mostrar)
        
        layout = QVBoxLayout()
        layout.addWidget(boton1)
        layout.addWidget(boton2)
        layout.addWidget(boton3)
        
        widget = QWidget()
        widget.setLayout(layout)
        
        layout.setContentsMargins(30,30,30,30) # Padding 
        layout.setSpacing(20) # Gap
        
        self.setCentralWidget(widget)
    
    def mostrar(self):
        # Nos manda el emisor del botón 
        # Sender coge la variable, y con la variable cogo el método de text del botón
        print(f"{self.sender().text()} pulsado" )
       

app = QApplication([])
window = MainWindow()
window.show()
app.exec()

