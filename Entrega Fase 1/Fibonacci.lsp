(defun fibonacci (n)
  (if (<= n 1)
      n
      (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))

(defun calcular-fibonacci ()
  (format t "Introduce un número para calcular su Fibonacci: ")
  (let ((n (read)))
    (if (and (integerp n) (>= n 0))
        (format t "El Fibonacci de ~d es: ~d~%" n (fibonacci n))
        (format t "Por favor, introduce un número entero no negativo.~%"))))

(calcular-fibonacci)

(defun factorial (n)
  (if (<= n 1)
      1
      (* n (factorial (- n 1)))))

(defun calcular-factorial ()
  (format t "Introduce un número para calcular su factorial: ")
  (let ((n (read)))
    (if (and (integerp n) (>= n 0))
        (format t "El factorial de ~d es: ~d~%" n (factorial n))
        (format t "Por favor, introduce un número entero no negativo.~%"))))

(calcular-factorial)
