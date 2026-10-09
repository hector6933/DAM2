from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QStatusBar, QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox, QToolBar
from PyQt6.QtGui import QPixmap, QAction, QIcon

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        self.setMinimumSize(300,250)
        
        vlayout = QVBoxLayout()
                
        self.etiqueta = QLabel("")
        
        etiquetahola = QLabel("Hola!")
        
        vlayout.addWidget(etiquetahola)
        vlayout.addWidget(self.etiqueta)
        
        
        
        barra = QToolBar("Barra de herramientas")
        barra.setIconSize(QSize(16,16))
        self.addToolBar(barra)
        
        boton = QAction(QIcon("Ejercicios/icons/disk.png"),"Guardar archivo",self)
        boton.triggered.connect(self.mostrarBtn)
        boton.setStatusTip("Guardar archivo")
        barra.addAction(boton)
        
        boton2 = QAction(QIcon("Ejercicios/icons/document.png"),"Nuevo",self)
        boton2.triggered.connect(self.mostrarBtn)
        boton2.setStatusTip("Nuevo archivo")
        barra.addAction(boton2)
     
        boton3 = QAction(QIcon("Ejercicios/icons/application-dock.png"),"Abrir",self)
        boton3.triggered.connect(self.mostrarBtn)
        boton3.setStatusTip("Abrir archivo")
        barra.addAction(boton3)
        
        menu = self.menuBar()
        menu_archivo = menu.addMenu("&Archivo")
        menu_archivo.addAction(boton)
        menu_archivo.addAction(boton2)
        menu_archivo.addAction(boton3)
        
        menu_ayuda = menu.addMenu("&Ayuda")
        menu_siguenos = menu_ayuda.addMenu("&Síguenos")
        
        boton4 = QAction("Síguenos en X",self)
        boton4.setStatusTip("Síguenos en X")
        boton4.triggered.connect(self.mostrarBtn)
        menu_siguenos.addAction(boton4)
        
        menu_siguenos.addSeparator()
        
        boton5 = QAction("Síguenos en Instagram",self)
        boton5.setStatusTip("Síguenos en Instagram")
        boton5.triggered.connect(self.mostrarBtn)
        menu_siguenos.addAction(boton5)
        
        self.setStatusBar(QStatusBar(self))

        widget = QWidget()
        widget.setLayout(vlayout)
        self.setCentralWidget(widget)
        
    def mostrarBtn(self):
        self.etiqueta.setText(self.sender().text())
    
app = QApplication([])
window = MainWindow()
window.show()
app.exec()

