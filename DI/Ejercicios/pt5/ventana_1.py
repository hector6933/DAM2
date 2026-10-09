from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QStatusBar, QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox, QToolBar, QDialog
from PyQt6.QtGui import QPixmap, QAction, QIcon

from cuadrado import Color


class OtraVentana(QWidget):
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        plantilla = QVBoxLayout()
        self.etiqueta = QLabel("Otra ventana")
        plantilla.addWidget(self.etiqueta)
        self.setLayout(plantilla)

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        boton = QPushButton("Pulsa aquí")
        boton.clicked.connect(self.mostrarBtn)
        
        self.setCentralWidget(boton)
         
    def mostrarBtn(self):
        self.window = OtraVentana()
        self.window.show()
        
        
app = QApplication([])
window = MainWindow()
window.show()
app.exec()

