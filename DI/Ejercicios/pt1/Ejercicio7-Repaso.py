from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton

class MainWindow(QMainWindow): 
    
    def __init__(self): 
        super().__init__()
        
        self.setWindowTitle("Mi aplicación")
                
        boton = QPushButton("Pulsa")
        
        boton.pressed.connect(self.pulsado)
        boton.released.connect(self.soltado)
        boton.clicked.connect(self.clickado)
        
        self.setFixedSize(QSize(200,200)) # Tamaño fijo de la ventana
        self.setCentralWidget(boton) # Meto el botón
    
    def pulsado(self):
        print("Botón pulsado")
        
    def soltado(self):
        print("Botón soltado")
        
    def clickado(self):
        print("Botón clickado")
    
app = QApplication([])
window = MainWindow()
window.show()
app.exec()