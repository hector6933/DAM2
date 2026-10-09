from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QLabel, QLineEdit, QCheckBox
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        
        horizontal = QHBoxLayout()
        input = QLineEdit()
        input.returnPressed.connect(self.mostrarTexto)
        horizontal.addWidget(QLabel("Texto"))
        horizontal.addWidget(input)
        
        verticalCheck = QVBoxLayout()
        check1 = QCheckBox("Opción 1")
        check2 = QCheckBox("Opción 2")
        check3 = QCheckBox("Opción 3")
        check1.stateChanged.connect(self.mostrarCheck)
        check2.stateChanged.connect(self.mostrarCheck)
        check3.stateChanged.connect(self.mostrarCheck)
        verticalCheck.addWidget(check1)
        verticalCheck.addWidget(check2)
        verticalCheck.addWidget(check3)
        
        padreV = QVBoxLayout()
        padreV.addLayout(horizontal)
        padreV.addLayout(verticalCheck)
        
        widget = QWidget()
        widget.setLayout(padreV)
        
        self.setCentralWidget(widget)
    
    def mostrarTexto(self):
        print(self.sender().text()) 
        
    
    def mostrarCheck(self, s):
        print(f"{self.sender().text()} está {["Sin marcar","","Marcado"][s]}")
       

app = QApplication([])
window = MainWindow()
window.show()
app.exec()

