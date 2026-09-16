from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        boton = QPushButton("Pulsa")
        
        self.botonPulsado = False
        boton.setCheckable(True) 
        boton.clicked.connect(self.botonActivado)
        boton.setChecked(self.botonPulsado) # Esto pone si el estado inicial del botón está checked o no
        # boton.released
        
        
        self.setFixedSize(QSize(200,200)) # Tamaño fijo de la ventana
        
        self.setCentralWidget(boton) # Meto el botón

    def botonActivado(self,checked):
            self.botonPulsado = checked
            print(self.botonPulsado)
            
    def saberEstado(self, checked):
        print("¿Botón pulsado?", checked)
                    


app = QApplication([])
window = MainWindow()
window.show()
app.exec()