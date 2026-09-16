import sys
import asyncio
import time
from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QPushButton

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    start_time = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        boton = QPushButton("Pulsa")
        
        boton.setCheckable(False)
        boton.clicked.connect(self.botonPulsado)
        
        self.setFixedSize(QSize(200,200)) # Tamaño fijo de la ventana
        
        self.setCentralWidget(boton) # Meto el botón
        
    def botonPulsado(self):
            current_time = time.time()
            print(f"Pulsado {self.cont}")
            self.cont += 1
            if self.cont == 1:
                self.start_time = current_time
            elapsed_time = current_time - self.start_time   
            
            # print(elapsed_time)
            
            if elapsed_time >= 5:
                print("Clicks por segundo: ", self.cont/5)
                sys.exit()


app = QApplication([])

window = MainWindow()

window.show()

app.exec()