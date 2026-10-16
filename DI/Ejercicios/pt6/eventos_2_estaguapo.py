from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QMenu, QStatusBar, QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox, QToolBar, QDialog
from PyQt6.QtGui import QPixmap, QAction, QIcon

from cuadrado import Color


class OtraVentana(QWidget):
    def __init__(self, width, height): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        self.setMinimumSize(width, height)
        plantilla = QVBoxLayout()
        self.etiqueta = QLabel("Otra ventana")
        plantilla.addWidget(self.etiqueta)
        self.setLayout(plantilla)

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
    def contextMenuEvent(self, event):
        context = QMenu(self)
        
        boton = QAction(QIcon("Ejercicios/icons/bug.png"),"Abrir ventana",self)
        boton.triggered.connect(self.botonPulsado)
                
        context.addAction(boton)
        context.addAction(QAction("Acción 2",self))
        context.addAction(QAction("Acción 3",self))
        context.addAction(QAction("Acción 4",self))
        context.addAction(QAction("Acción 5",self))
        context.addAction(QAction("Acción 6",self))
        context.addAction(QAction("Acción 7",self))
        context.addAction(QAction("Acción 8",self))
        context.addAction(QAction("Acción 9",self))
        context.addAction(QAction("Acción 10",self))
        context.addAction(QAction("Acción 11",self))
        context.exec(event.globalPos())        
    
    def botonPulsado(self):
        print("Pulsado")
        self.window = OtraVentana(250,150)
        self.window.show()
app = QApplication([])
window = MainWindow()
window.show()
app.exec()