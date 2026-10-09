from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QMessageBox, QStatusBar, QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox, QToolBar, QDialog
from PyQt6.QtGui import QPixmap, QAction, QIcon

from cuadrado import Color
from dialogs import CustomDialog

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        boton = QPushButton("Pulsa aquí")
        boton.clicked.connect(self.mostrarBtn)
        
        self.setCentralWidget(boton)
         
    def mostrarBtn(self):
        dlg = QMessageBox(self)
        dlg.setWindowTitle("Cuadro de diálogo")
        dlg.setText("Este es el mensaje de mi cuadro de mensaje")
        dlg.setStandardButtons(QMessageBox.StandardButton.Yes | QMessageBox.StandardButton.No)
        dlg.setIcon(QMessageBox.Icon.Warning)
        
        if dlg.exec() == QMessageBox.StandardButton.Yes:
            print("El usuario ha aceptado")
        else:
            print("El usuario ha cancelado")
        
        
app = QApplication([])
window = MainWindow()
window.show()
app.exec()

