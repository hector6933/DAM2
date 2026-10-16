from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QComboBox, QRadioButton, QMenu, QStatusBar, QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox, QToolBar, QDialog
from PyQt6.QtGui import QPixmap, QAction, QIcon
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        aragon = ["Huesca","Zaragoza","Teruel"]
        cvalencia = ["Castellón","Valencia","Alicante"]
        
        self.setWindowTitle("Mi aplicación")
        
        vlayout = QVBoxLayout()
        vlayout.setAlignment(Qt.AlignmentFlag.AlignCenter)
        
        hlayout = QHBoxLayout()
        hlayout.setAlignment(Qt.AlignmentFlag.AlignCenter)
        widget1 = QWidget()
        widget1.setLayout(hlayout)
        
        rad1 = QRadioButton("Aragón")
        rad1.clicked.connect(lambda: self.cambiar(aragon))
        rad2 = QRadioButton("Comunidad Valenciana")
        rad2.clicked.connect(lambda: self.cambiar(cvalencia))
        
        hlayout.addWidget(rad1)
        hlayout.addWidget(rad2)
        
        self.combobox = QComboBox()
        
        vlayout.addWidget(widget1)
        vlayout.addWidget(self.combobox)
        
        widget = QWidget()
        widget.setLayout(vlayout)
        
        self.setCentralWidget(widget) 
        
    def cambiar(self, items):
        self.combobox.clear()
        self.combobox.addItems(items)
        
        
        

app = QApplication([])
window = MainWindow()
window.show()
app.exec()