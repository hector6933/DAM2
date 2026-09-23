from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QListWidget, QAbstractItemView, QLineEdit, QSpinBox, QDial
from PyQt6.QtGui import QPixmap
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        dial = QDial()
        dial.setRange(0,100)
        dial.setNotchesVisible(True)
        
        dial.valueChanged.connect(self.muestra)
                
        self.setCentralWidget(dial)
       
        
    def muestra(self,s):
        print(s)
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()
