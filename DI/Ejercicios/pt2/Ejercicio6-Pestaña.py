from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        tabs = QTabWidget()
        tabs.setTabPosition(QTabWidget.TabPosition.North)
        tabs.setMovable(False)        
        
        widget1 = QWidget()
        w1Horizontal1 = QHBoxLayout()
        widget1.setLayout(w1Horizontal1)
        
        input = QLineEdit()
        input.textChanged.connect(lambda: print(self.sender().text()))
        w1Horizontal1.addWidget(QLabel("Hola"))
        w1Horizontal1.addWidget(input)
        
        widget2 = QWidget()
        w2Vertical1 = QVBoxLayout()
        widget2.setLayout(w2Vertical1)
        
        checkbox = QCheckBox("Selección")
        checkbox.stateChanged.connect(lambda s: print(f"Selección {["Sin pulsar","","Pulsado"][s]}"))
        botonPulsa = QPushButton("Pulsa")
        botonPulsa.clicked.connect(lambda: print("Botón pulsado"))
        w2Vertical1.addWidget(checkbox)
        w2Vertical1.addWidget(botonPulsa)
        
        tabs.addTab(widget1,"Pestaña 1")
        tabs.addTab(widget2,"Pestaña 2")
        
        self.setCentralWidget(tabs)

app = QApplication([])
window = MainWindow()
window.show()
app.exec()

