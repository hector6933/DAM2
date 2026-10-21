from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QComboBox, QRadioButton, QMenu, QStatusBar, QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox, QToolBar, QDialog
from PyQt6.QtGui import QPixmap, QAction, QIcon
class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        self.valores = []
        
        self.setWindowTitle("Mi aplicación")
        display = ""
        
        btn1 = QPushButton("1")
        btn2 = QPushButton("2")
        btn3 = QPushButton("3")
        btn4 = QPushButton("4")
        btn5 = QPushButton("5")
        btn6 = QPushButton("6")
        btn7 = QPushButton("7")
        btn8 = QPushButton("8")
        btn9 = QPushButton("9")
        btn0 = QPushButton("0")
        btnMas = QPushButton("+")
        btnIgual = QPushButton("=")
        btnBorrar = QPushButton("CE")
        
        btn1.clicked.connect(self.cambiar)
        btn2.clicked.connect(self.cambiar)
        btn3.clicked.connect(self.cambiar)
        btn4.clicked.connect(self.cambiar)
        btn5.clicked.connect(self.cambiar)
        btn6.clicked.connect(self.cambiar)
        btn7.clicked.connect(self.cambiar)
        btn8.clicked.connect(self.cambiar)
        btn9.clicked.connect(self.cambiar)
        btn0.clicked.connect(self.cambiar)
        btnMas.clicked.connect(self.sumar)
        btnIgual.clicked.connect(self.igual)
        btnBorrar.clicked.connect(self.borrar)
        
        vlayout = QVBoxLayout()
        vWidget = QWidget()
        vWidget.setLayout(vlayout)
        
        self.texto = QLabel(display)
        self.texto.setAlignment(Qt.AlignmentFlag.AlignRight)
        vlayout.addWidget(self.texto)
        
        plantilla = QGridLayout()
        
        plantilla.addWidget(btn7,0,0)
        plantilla.addWidget(btn8,0,1)
        plantilla.addWidget(btn9,0,2)
        
        plantilla.addWidget(btn4,1,0)
        plantilla.addWidget(btn5,1,1)
        plantilla.addWidget(btn6,1,2)
        
        plantilla.addWidget(btn1,2,0)
        plantilla.addWidget(btn2,2,1)
        plantilla.addWidget(btn3,2,2)
        
        plantilla.addWidget(btnMas,3,0)
        plantilla.addWidget(btn0,3,1)
        plantilla.addWidget(btnIgual,3,2)
        
        vlayout.addLayout(plantilla)
        vlayout.addWidget(btnBorrar)
        
        self.setCentralWidget(vWidget) 
        
    def cambiar(self):
        numero = self.sender().text()
        
        self.texto.setText(self.texto.text() + numero)
    
    def sumar(self):
        
        texto = self.texto.text()
        if texto != "" and str.isdigit(texto):
            self.valores.append(int(self.texto.text()))
            self.texto.setText("")
    
    def igual(self):
        
        texto = self.texto.text()
        if texto != "" and str.isdigit(texto):
            self.valores.append(int(self.texto.text()))
            self.texto.setText("")
    
        if self.valores:
            total = 0
            for num in self.valores:
                total += num

            self.texto.setText(f"Total: {total}")
    
    def borrar(self):
        self.texto.setText("")
        self.valores = []

app = QApplication([])
window = MainWindow()
window.show()
app.exec()