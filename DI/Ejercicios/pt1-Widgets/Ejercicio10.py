from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        self.boton = QPushButton("Pulsa")
        
        self.boton.setCheckable(True) 
        # self.boton.setChecked(True) # Esto pone si el estado inicial del botón está checked o no
        self.boton.clicked.connect(self.clickado)
        
        self.setFixedSize(QSize(200,200)) # Tamaño fijo de la ventana
        
        self.setCentralWidget(self.boton) # Meto el botón

            
    def clickado(self, pulsado):
        self.cont += 1
        # Pulsado puede ser True o False, osea 1 o 0 por lo que si es false es 0 por lo que pilla No pulsado
        self.boton.setText([f"No pulsado \n{self.cont}",f"Pulsado \n{self.cont}"][pulsado]) 
        
        
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()