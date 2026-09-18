from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget , QCheckBox, QComboBox
from PyQt6.QtGui import QPixmap
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        lista = QComboBox()
        lista.addItems(["Uno","Dos","Tres","Cero"])
        lista.addItem("Rani Demón")
        
        lista.currentTextChanged.connect(print)
        lista.currentIndexChanged.connect(print)
        
        lista.setEditable(True)
        
        self.setCentralWidget(lista) 
        
    def muestraEstado(self,s):
        print(s)
    
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()