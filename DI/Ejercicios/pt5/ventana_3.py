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
        self.setMinimumSize(200,100)

        self.setWindowTitle("Mi aplicación")
        self.window = OtraVentana()
        boton = QPushButton("Pulsa aquí")
        boton.clicked.connect(self.mostrarVentana)
        
        
        self.input = QLineEdit()
        self.input.textChanged.connect(self.window.etiqueta.setText)
        
        vlayout = QVBoxLayout()
        vlayout.addWidget(boton)
        vlayout.addWidget(self.input)
        widget = QWidget()
        widget.setLayout(vlayout)
        
        
        self.setCentralWidget(widget)
         
    def mostrarVentana(self):
        if self.window.isVisible():
            self.window.hide()
        else:
            self.window.show()
        
app = QApplication([])
window = MainWindow()
window.show()
app.exec()

