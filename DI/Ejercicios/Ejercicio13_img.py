from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget
from PyQt6.QtGui import QPixmap
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        label = QLabel()
        label.setPixmap(QPixmap("Ejercicios/img/remon2.png"))
        label.setScaledContents(True)
        
        self.setCentralWidget(label) # Meto el label
        
    def clickado(self, pulsado):
        self.cont += 1
        # Pulsado puede ser True o False, osea 1 o 0 por lo que si es false es 0 por lo que pilla No pulsado
        self.boton.setText(["No pulsado","Pulsado"][pulsado]) 
        
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()