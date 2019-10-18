Algoritmo ej1
	Definir horas, sueldo, hExtras Como Entero
	
	Escribir "Introduce el número de horas trabajadas a la semana"
	Leer horas
	
	hExtras=horas-40
	
	Si horas<=40 Entonces
		sueldo=horas*10
	SiNo
		sueldo=(40*10)+(hExtras*15)
	Fin Si
	
	Escribir "El sueldo semanal que le corresponde es ",sueldo," euros"
	
FinAlgoritmo
