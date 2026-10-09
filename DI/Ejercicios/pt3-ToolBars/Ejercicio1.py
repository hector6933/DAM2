from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QStatusBar, QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox, QToolBar
from PyQt6.QtGui import QPixmap, QAction, QIcon

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        barra = QToolBar("Barra de herramientas")
        barra.setIconSize(QSize(16,16))
        self.addToolBar(barra)
        
        boton = QAction(QIcon("Ejercicios/icons/bug.png"),"Mi botón",self)
        boton.triggered.connect(self.botonPulsado)
        
        menu = self.menuBar()
        menu_archivo = menu.addMenu("&Archivo")
        menu_archivo.addAction(boton)
        
        barra.addAction(boton)
        
        self.etiqueta = QLabel("Hola!")
        self.etiqueta.setAlignment(Qt.AlignmentFlag.AlignLeft)
        self.setCentralWidget(self.etiqueta)

    def botonPulsado(self):
        self.etiqueta.setText(f"Texto cambiado {self.cont}")
        self.cont += 1
        
app = QApplication([])
window = MainWindow()
window.show()
app.exec()

