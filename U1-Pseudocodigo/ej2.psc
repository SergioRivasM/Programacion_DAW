Algoritmo posicionNum
	Definir posicion, i Como Entero
	Definir num, digito como caracter
	
	Escribir "Por favor, introduzca un n�mero entero positivo"
	Leer num
	
	Escribir "Introduzca la posici�n dentro del n�mero"
	Leer posicion
	
	Escribir "Introduzca el nuevo d�gito"
	Leer digito
	
	Para i<-0 Hasta longitud(num)-1 Hacer
		Si i=posicion-1 Entonces
			Escribir sin saltar digito
		SiNo
			Escribir sin saltar subcadena(num, i, i)
		Fin Si
	Fin Para
	
FinAlgoritmo
