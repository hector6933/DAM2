from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget , QCheckBox
from PyQt6.QtGui import QPixmap
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        casilla = QCheckBox("Casilla de verificación")
        formato = casilla.font()
        formato.setBold(True)
        casilla.setFont(formato)
        casilla.setTristate(True)
        
        casilla.stateChanged.connect(self.muestraEstado)
        
        self.setCentralWidget(casilla) 
        
    def muestraEstado(self,s):
        print(["Sin marcar","Parcialmente","Marcado"][s])
        
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()