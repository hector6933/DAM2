from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QStatusBar, QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox, QToolBar
from PyQt6.QtGui import QPixmap, QAction, QIcon

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        etiqueta = QLabel("Etiqueta")
        etiqueta.setAlignment(Qt.AlignmentFlag.AlignCenter)
        
        barra = QToolBar("Barrade herramientas")
        barra.setIconSize(QSize(16,16))
        self.addToolBar(barra)
        
        boton = QAction(QIcon("Ejercicios/icons/bug.png"),"Mi botón",self)
        boton.triggered.connect(self.botonPulsado)
        
        barra.addAction(boton)
        
        boton.setStatusTip("Este es mi botón")
        self.setStatusBar(QStatusBar(self))
        
        barra.addSeparator()
        
        boton2 = QAction(QIcon("Ejercicios/icons/cake.png"),"Mi botón 2",self)
        boton2.triggered.connect(self.botonPulsado)
        boton2.setStatusTip("Este es mi botón 2")
        
        barra.addAction(boton2)
        
        barra.addSeparator()
        
        barra.addWidget(QLabel("Texto"))
        barra.addWidget(QCheckBox("Check"))
        
        menu = self.menuBar()
        menu_archivo = menu.addMenu("&Archivo")
        menu_editar = menu.addMenu("&Editar")
        menu_insertar = menu.addMenu("&Insertar")
        
        menu_archivo.addAction(boton)
        menu_archivo.addAction(boton2)
        
        menu_archivo.addSeparator()
        menu_mas = menu_archivo.addMenu("Más")
        menu_mas.addAction(boton2)
        menu_mas.addAction(boton)
        
        self.setCentralWidget(etiqueta)

    def botonPulsado(self):
        print(f"{self.sender().text()} pulsado")
app = QApplication([])
window = MainWindow()
window.show()
app.exec()

