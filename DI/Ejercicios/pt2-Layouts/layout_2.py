from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        vertical1 = QVBoxLayout()
        vertical1.addWidget(Color("Lime"))
        vertical1.addWidget(Color("Red"))
        vertical1.addWidget(Color("Cyan"))
        
        vertical2 = QVBoxLayout()
        vertical2.addWidget(Color("Lime"))
        vertical2.addWidget(Color("Red"))
        vertical2.addWidget(Color("Cyan"))
        
        
        # Este es el padre que contiene a los dos layouts
        horizontal = QHBoxLayout() 
        horizontal.addLayout(vertical1)
        horizontal.addWidget(Color("Yellow"))
        horizontal.addLayout(vertical2)
        
        widget = QWidget()
        widget.setLayout(horizontal)
        
        self.setCentralWidget(widget)
        
       

app = QApplication([])
window = MainWindow()
window.show()
app.exec()

