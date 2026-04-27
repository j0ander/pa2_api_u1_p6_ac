🔹 ApplicationScoped

Este contexto crea una única instancia que se comparte durante toda la ejecución de la aplicación.

Ejemplos:
Configuración general de la aplicación (idioma, zona horaria, etc.)
Sistema de registro de logs
Contador global de visitas
Gestor de conexión a base de datos
Cache de información frecuente
Lista global de productos en memoria
Configuración de acceso a APIs externas
🔹 Dependent

Este contexto crea una nueva instancia cada vez que se utiliza.

Ejemplos:
Validador de formularios
Generador de códigos aleatorios
Objeto temporal para cálculo de impuestos
Formateador de texto en operaciones puntuales
Conversor de unidades (ej: monedas)
Procesador de compras individuales
Validador de credenciales en login
🔹 Singleton

Este contexto garantiza que exista una única instancia controlada en toda la aplicación.

Ejemplos:
Reloj central del sistema
Administrador de sesiones de usuarios
Registro de eventos críticos
Gestor de configuración principal
Controlador global de seguridad
Administrador de recursos del sistema
Cola global de tareas
