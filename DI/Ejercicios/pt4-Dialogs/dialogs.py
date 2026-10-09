from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QStatusBar, QApplication, QMainWindow, QHBoxLayout, QWidget, QVBoxLayout, QPushButton, QRadioButton, QGroupBox, QGridLayout, QStackedLayout, QTabWidget, QLabel, QLineEdit, QTextEdit, QCheckBox, QToolBar, QDialog, QDialogButtonBox
from PyQt6.QtGui import QPixmap, QAction, QIcon

from cuadrado import Color

class CustomDialog(QDialog): # Creación de una clase
    
    cont = 0
    
    def __init__(self, parent=None): # Creación de una función
        super().__init__(parent) # LLamo al constructor del padre
        
        self.setWindowTitle("Cuadro de diálogo")
        
        QBtn = QDialogButtonBox.StandardButton.Ok | QDialogButtonBox.StandardButton.Cancel
        
        self.dialogBox = QDialogButtonBox(QBtn)
        self.dialogBox.accepted.connect(self.accept)
        self.dialogBox.rejected.connect(self.reject)
        self.dialogBox.setCenterButtons(True)
        
        self.plantilla = QVBoxLayout()
        mensaje = QLabel("Algo ha sucedido ¿Todo Ok?")
        mensaje.setAlignment(Qt.AlignmentFlag.AlignCenter)
        self.plantilla.addWidget(mensaje)
        self.plantilla.addWidget(self.dialogBox)
        
        self.plantilla.setAlignment(Qt.AlignmentFlag.AlignCenter)
        
        self.setLayout(self.plantilla)

        
        