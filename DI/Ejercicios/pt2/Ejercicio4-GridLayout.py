from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        plantilla = QGridLayout()
        
        plantilla.addWidget(Color("Red"),0,0)
        plantilla.addWidget(Color("Green"),0,1)
        plantilla.addWidget(Color("Yellow"),1,2)
        plantilla.addWidget(Color("Blue"),2,0)
        
        widget = QWidget()
        widget.setLayout(plantilla)
        
        self.setCentralWidget(widget)
    
app = QApplication([])
window = MainWindow()
window.show()
app.exec()

