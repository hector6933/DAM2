from PyQt6.QtCore import QSize, Qt, QDate
from PyQt6.QtWidgets import QComboBox, QDateEdit, QCalendarWidget, QStatusBar, QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox, QToolBar, QDialog
from PyQt6.QtGui import QPixmap

from cuadrado import Color

class MainWindow(QMainWindow): # Creación de una clase
    
    cont = 0
    
    def __init__(self): # Creación de una función
        super().__init__() # LLamo al constructor del padre
        
        self.setWindowTitle("Mi aplicación")
        
        vLayout = QVBoxLayout()

        # Row 1
        hLayout1 = QHBoxLayout()
        widget1 = QWidget()
        widget1.setLayout(hLayout1)
        lNombre = QLabel("Nombre: ")
        self.inputNombre = QLineEdit()
        
        hLayout1.addWidget(lNombre)
        hLayout1.addWidget(self.inputNombre)
        
        vLayout.addWidget(widget1)
        
        # Row 2
        hLayout2 = QHBoxLayout()
        widget2 = QWidget()
        widget2.setLayout(hLayout2)
        lApellidos = QLabel("Apellidos: ")
        self.inputApellidos = QLineEdit()
                
        hLayout2.addWidget(lApellidos)
        hLayout2.addWidget(self.inputApellidos)
                
        vLayout.addWidget(widget2)
        
        # Row 3
        hLayout3 = QHBoxLayout()
        widget3 = QWidget()
        widget3.setLayout(hLayout3)
        lFecha = QLabel("Fecha de alta: ")
        self.inputFecha = QDateEdit()
        self.inputFecha.setCalendarPopup(True)
        self.inputFecha.setMinimumDate(QDate(2006,1,1))
                        
        hLayout3.addWidget(lFecha)
        hLayout3.addWidget(self.inputFecha)
                        
        vLayout.addWidget(widget3)
        
        # Row 4
        hLayout4 = QHBoxLayout()
        widget4 = QWidget()
        widget4.setLayout(hLayout4)
        lDepartamento = QLabel("Departamento: ")
        self.inputDep = QComboBox()
        self.inputDep.addItems(["Contabilidad","Administración","Producción","Cero"])
                                
        hLayout4.addWidget(lDepartamento)
        hLayout4.addWidget(self.inputDep)

        vLayout.addWidget(widget4)
        
        # Row 5
        hLayout5 = QHBoxLayout()
        widget5 = QWidget()
        widget5.setLayout(hLayout5)
        lDesc = QLabel("Descripción: ")
        self.inputDesc = QTextEdit()
        
        btnGrabar = QPushButton("Grabar")
        btnGrabar.clicked.connect(self.grabar)
        btnReset = QPushButton("Reset")
        btnReset.clicked.connect(self.reset)

        
        hLayout5.addWidget(lDesc)
        
        widget51 = QWidget()
        vLayout51 = QVBoxLayout()
        widget51.setLayout(vLayout51)
        
        hLayout52 = QHBoxLayout()
        widget52 = QWidget()
        widget52.setLayout(hLayout52)
        hLayout52.addWidget(btnGrabar)
        hLayout52.addWidget(btnReset)
        
        vLayout51.addWidget(self.inputDesc)
        vLayout51.addWidget(widget52)
        
        hLayout5.addWidget(widget51)
        
        vLayout.addWidget(widget5)
        
        widget = QWidget()
        widget.setLayout(vLayout)
        
        vLayout.setContentsMargins(0,0,0,0) # Padding 
        vLayout.setSpacing(0) # Gap
        
        self.setCentralWidget(widget)
    
    def grabar(self):
        self.inputDesc.setText(self.inputNombre.text())
        self.inputDesc.append(self.inputApellidos.text())
        self.inputDesc.append(self.inputFecha.text())
        self.inputDesc.append(self.inputDep.currentText())
    
    def reset(self):
        self.inputDesc.setText("")   
        self.inputNombre.clear()
        self.inputApellidos.clear()
        self.inputFecha.setDate(QDate(2006,1,1))
        self.inputDep.setCurrentIndex(0)

app = QApplication([])
window = MainWindow()
window.show()
app.exec()

