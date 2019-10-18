Algoritmo reloj
	definir altura,x,i,j como entero
	definir cont Como Caracter
	
	cont<-"*"
	
escribir "Ingrese altura:"
leer altura;

Si altura<3 o altura%2=0 Entonces
	Escribir "Error, introduce un número mayor o igual que 3 o un número impar"
SiNo
	Para i<-0 Hasta altura-1 Hacer
		cont=cont+"*"
	Fin Para
	
	Escribir cont

Fin Si
	
FinAlgoritmo
