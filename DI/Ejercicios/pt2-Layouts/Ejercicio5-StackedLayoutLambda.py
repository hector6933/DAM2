from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        padreV = QVBoxLayout()
        horizontal = QHBoxLayout()
        stacked = QStackedLayout()
                
        boton1 = QPushButton("Red")
        boton2 = QPushButton("Green")
        boton3 = QPushButton("Yellow")
        
        boton1.clicked.connect(lambda: stacked.setCurrentIndex(0))
        boton2.clicked.connect(lambda: stacked.setCurrentIndex(1))
        boton3.clicked.connect(lambda: stacked.setCurrentIndex(2))
        
        horizontal.addWidget(boton1)
        horizontal.addWidget(boton2)
        horizontal.addWidget(boton3)
        
        stacked.addWidget(Color("Red"))
        stacked.addWidget(Color("Green"))
        stacked.addWidget(Color("Yellow"))
        
        padreV.addLayout(horizontal)
        padreV.addLayout(stacked)
        widget = QWidget()
        widget.setLayout(padreV)
        
        self.setCentralWidget(widget)
        
app = QApplication([])
window = MainWindow()
window.show()
app.exec()

