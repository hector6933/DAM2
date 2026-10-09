from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        tabs = QTabWidget()
        
        tabs.setTabPosition(QTabWidget.TabPosition.South)
        tabs.setMovable(True)        
        
        
        tabs.addTab(Color("Red"),"Rojo")
        tabs.addTab(Color("Blue"),"Azul")
        tabs.addTab(Color("Yellow"),"Amarillo")
        tabs.addTab(Color("Lime"),"Verde")
        
        self.setCentralWidget(tabs)


app = QApplication([])
window = MainWindow()
window.show()
app.exec()

