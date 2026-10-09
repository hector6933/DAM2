from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QPushButton

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        boton = QPushButton("Pulsa")
        
        boton.setCheckable(False)
        boton.clicked.connect(self.botonPulsado)
        
        self.setFixedSize(QSize(200,200)) # Tamaño fijo de la ventana
        
        self.setCentralWidget(boton) # Meto el botón
        
    def botonPulsado(self):
            print(f"Pulsado {self.cont}")
            self.cont = self.cont + 6767676767676767676767676767676767676767676767676767676767676767676767
            


app = QApplication([])

window = MainWindow()

window.show()

app.exec()