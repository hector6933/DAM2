from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        label = QLabel()
        label2 = QLabel()
        input = QLineEdit()
        
        input.textChanged.connect(label.setText)
        
        layout = QVBoxLayout()
        layout.addWidget(label2)
        layout.addWidget(input)
        layout.addWidget(label)
        
        contenedor = QWidget()
        contenedor.setLayout(layout)
        
        self.setCentralWidget(contenedor) # Meto el layout
            
    def clickado(self, pulsado):
        self.cont += 1
        # Pulsado puede ser True o False, osea 1 o 0 por lo que si es false es 0 por lo que pilla No pulsado
        self.boton.setText(["No pulsado","Pulsado"][pulsado]) 
        
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()