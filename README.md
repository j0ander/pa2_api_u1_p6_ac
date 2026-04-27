1. @ApplicationScoped
La instancia es única para toda la aplicación y se maneja a través de un proxy cliente. Se crea
de forma perezosa (lazy).
● Configuración Global de la App: Almacena parámetros leídos de archivos externos que
no cambian.
● Servicio de Autenticación: Centraliza la validación de usuarios para todo el sistema.
● Cliente de Base de Datos: Mantiene el pool de conexiones compartido por todos los
servicios.
● Caché de Datos Frecuentes: Almacena información de consulta rápida para optimizar el
rendimiento.
● Gestor de Notificaciones: Servicio encargado de enviar alertas o correos electrónicos.
● Validador de Reglas de Negocio: Contiene la lógica lógica estática que aplican todos
los módulos.
● Manejador de Métricas: Recolecta datos sobre el estado de salud de la aplicación.
2. @Singleton
Existe una única instancia compartida, pero a diferencia de ApplicationScoped, no usa proxies
y se instancia al inicio (eager).
● Contador de Visitas Global: Un contador atómico para registrar accesos totales al sitio.
● Registro de Auditoría Central: Punto único donde se registran logs críticos de
seguridad.
● Estado de Mantenimiento: Bandera global que indica si el sistema está aceptando
peticiones.
● Gestor de Licencias: Verifica el estado de la licencia de la aplicación al arrancar.
● Cargador de Diccionarios: Carga traducciones o constantes en memoria al iniciar el
servidor.
● Reloj Maestro del Sistema: Provee una referencia de tiempo única para procesos
sincronizados.
● Orquestador de Tareas (Jobs): Controla la ejecución de procesos en segundo plano.
3. @Dependent
Es el contexto por defecto. Se crea una nueva instancia cada vez que se inyecta y vive lo que
viva el objeto que lo contiene.
● Generador de IDs Temporales: Crea identificadores para una transacción específica.
● Formateador de Resultados: Ajusta el formato de salida (JSON, XML) según el punto

de inyección.
● Calculadora de Descuentos: Realiza cálculos específicos para una orden de compra
puntual.
● Procesador de Archivos Locales: Maneja la lectura de un archivo específico y luego se
destruye.
● Analizador de Texto (Parser): Utilizado para procesar un mensaje entrante particular.
● Conversor de Monedas: Realiza conversiones de divisa para una consulta de precio
única.
● Logger Específico: Cada clase obtiene su propia instancia de logger configurada con su
nombre de clase.
