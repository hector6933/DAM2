from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QListWidget, QAbstractItemView, QLineEdit, QSpinBox
from PyQt6.QtGui import QPixmap
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        spinbox = QSpinBox()
        spinbox.setRange(-2147483647,2147483647)
        spinbox.setPrefix("Dinero ")
        spinbox.setSuffix("€")
        spinbox.setSingleStep(67)
        
        spinbox.valueChanged.connect(self.muestra) # Muestra el número
        spinbox.textChanged.connect(self.muestra) # Muestra el texto con el euro
                
        self.setCentralWidget(spinbox)
        
    def muestra(self,s):
        print(s)
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()