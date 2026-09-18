from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QListWidget, QAbstractItemView, QLineEdit
from PyQt6.QtGui import QPixmap
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        self.texto = QLineEdit()
        self.texto.setMaxLength(500)
        self.texto.setPlaceholderText("Introduce algo...")
        
        self.texto.returnPressed.connect(self.intro)
        
        # texto.textChanged.connect(self.muestra)
        
        self.texto.setAlignment(Qt.AlignmentFlag.AlignHCenter | Qt.AlignmentFlag.AlignVCenter)
        self.setCentralWidget(self.texto) 
        
    def muestra(self,s):
        print(s)
    
    def intro(self):
        print(self.texto.text())
    
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()