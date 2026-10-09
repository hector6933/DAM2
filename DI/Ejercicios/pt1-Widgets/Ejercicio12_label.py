from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        label = QLabel("Nisi eu amet eu reprehenderit culpa et deserunt nisi nulla excepteur pariatur do dolor. \n Ex sint cillum ullamco velit est. \n Eiusmod exercitation enim occaecat anim nisi nisi consectetur nulla.")
        
        formato = label.font()
        formato.setPointSize(20)
        formato.setFamily("Cascadia Code")
        formato.setBold(True)
        
        label.setFont(formato)
        label.setAlignment(Qt.AlignmentFlag.AlignHCenter | Qt.AlignmentFlag.AlignVCenter)
        
        self.setCentralWidget(label) # Meto el layout
            
    def clickado(self, pulsado):
        self.cont += 1
        # Pulsado puede ser True o False, osea 1 o 0 por lo que si es false es 0 por lo que pilla No pulsado
        self.boton.setText(["No pulsado","Pulsado"][pulsado]) 
        
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()