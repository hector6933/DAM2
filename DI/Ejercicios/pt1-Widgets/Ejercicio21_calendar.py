from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QListWidget, QAbstractItemView, QLineEdit, QSpinBox, QDial, QCalendarWidget
from PyQt6.QtGui import QPixmap
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        self.calendar = QCalendarWidget()
        self.calendar.selectionChanged.connect(self.muestra)
        
        self.setCentralWidget(self.calendar)
       
    def muestra(self):
        print(self.calendar.selectedDate().toString("dd/MM/yyyy"))
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()

