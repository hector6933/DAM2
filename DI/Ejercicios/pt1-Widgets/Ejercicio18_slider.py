from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QListWidget, QAbstractItemView, QLineEdit, QSlider
from PyQt6.QtGui import QPixmap
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        slider = QSlider()
        slider.setRange(0,100)
        slider.setOrientation(Qt.Orientation.Horizontal)
        
        slider.valueChanged.connect(self.muestra)
        slider.sliderMoved.connect(self.cambiado)
        
        slider.setFixedSize(200,10)
        
        self.setFixedSize(QSize(500,200)) # Tamaño fijo de la ventana
        self.setCentralWidget(slider)
        
    def muestra(self,s):
        print(s)
    def cambiado(self,s):
            print("Se ha tocado el slider")

app = QApplication([])
window = MainWindow()
window.show()
app.exec()