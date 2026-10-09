from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QListWidget, QAbstractItemView
from PyQt6.QtGui import QPixmap
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        lista = QListWidget()
        lista.addItems(["Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Dieciocho","Diecinueve","Veinte"])
        
        lista.currentTextChanged.connect(print)
        
        lista.setSelectionMode(QAbstractItemView.SelectionMode.MultiSelection)
        
        self.setCentralWidget(lista) 
        
    def muestraEstado(self,s):
        print(s)
    
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()