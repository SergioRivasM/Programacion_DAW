Algoritmo aleatorios
	Definir num, i como entero
	Definir respuesta Como caracter
	Dimension num[20];
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		num[i]<-AZAR(400)+1
		Escribir "Los números aleatorios son: ", num[i]
	Fin Para
	
	Escribir "¿Quieres resaltar los múltiplos de 5 o de 7?"
	Leer respuesta
	
	Si respuesta="Si" o respuesta="si" o respuesta="SI" Entonces
		Para i<-0 Hasta 19 Con Paso 1 Hacer
			Si num[i]%5=0 o num[i]%7=0 Entonces
				Escribir "[", num[i], "]"
			SiNo
				Escribir num[i];
			Fin Si
		Fin Para
	Fin Si
	
FinAlgoritmo