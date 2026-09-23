from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QHBoxLayout, QWidget
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        plantilla = QHBoxLayout()
        plantilla.addWidget(Color("Red"))
        plantilla.addWidget(Color("Lime"))
        plantilla.addWidget(Color("Blue"))
        
        widget = QWidget()
        widget.setLayout(plantilla)
        self.setCentralWidget(widget)
        
       

app = QApplication([])
window = MainWindow()
window.show()
app.exec()

