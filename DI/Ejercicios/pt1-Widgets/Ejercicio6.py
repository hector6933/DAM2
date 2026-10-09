from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        boton = QPushButton("Pulsa")
        
        boton.setCheckable(True)
        boton.clicked.connect(self.botonPulsado)
        boton.clicked.connect(self.saberEstado)
        # boton.released
        
        self.setFixedSize(QSize(200,200)) # Tamaño fijo de la ventana
        
        self.setCentralWidget(boton) # Meto el botón

    def botonPulsado(self):
            print(f"Pulsado {self.cont}")
            self.cont += 1
    def saberEstado(self, checked):
        print("¿Botón pulsado?", checked)
                    


app = QApplication([])

window = MainWindow()

window.show()

app.exec()