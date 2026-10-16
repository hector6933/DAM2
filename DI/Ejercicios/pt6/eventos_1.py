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
        
        etiqueta = QLabel("Pulsa aquí")
        
        # etiqueta.clicked.connect(self.mostrarventana)
        
        hlayout = QHBoxLayout()
        widget = QWidget()
        
        etiqueta.setAlignment(Qt.AlignmentFlag.AlignCenter)        

        self.setCentralWidget(etiqueta)
        
    def mouseMoveEvent(self, a0):
        print(f"Arrastrar {a0.position()}")
    
    def mousePressEvent(self, a0):
        print("Presionar")
        
    def mouseReleaseEvent(self, a0):
        print("Soltar")
    
    def mouseDoubleClickEvent(self, a0):
        print(f"Doble click {a0.pos()} {self.cont}")
        self.cont += 1
        
app = QApplication([])
window = MainWindow()
window.show()
app.exec()