package ui;

import data.GestorEntidades;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

    //  Interfaz grafica de la APP, permite ver todos los registros, ingresar guias, colaboradores externos y vehiculos

public class VentanaPrincipal extends JFrame {

    // Gestor central que administra la colección
    private GestorEntidades gestor;

    // texto donde se muestran los registros
    private JTextArea areaResultados;

    // constructor de la vantana y sus componntes
    public VentanaPrincipal(GestorEntidades gestor) {
        this.gestor = gestor;

        // ventana principal
        setTitle("Llanquihue Tour - Sistema de Registro");
        setSize(700, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
        setLayout(new BorderLayout(10, 10));

        // panel el titulo
        JLabel titulo = new JLabel("LLANQUIHUE TOUR - Gestión de Entidades", SwingConstants.CENTER);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 16));
        titulo.setBorder(new EmptyBorder(15, 10, 5, 10));
        titulo.setForeground(new Color(30, 80, 140));
        add(titulo, BorderLayout.NORTH);

        // area central
        areaResultados = new JTextArea();
        areaResultados.setEditable(false);
        areaResultados.setFont(new Font("Monospaced", Font.PLAIN, 13));
        areaResultados.setMargin(new Insets(10, 10, 10, 10));
        areaResultados.setBackground(new Color(245, 248, 252));

        JScrollPane scroll = new JScrollPane(areaResultados);
        scroll.setBorder(BorderFactory.createTitledBorder("Registros del sistema"));
        add(scroll, BorderLayout.CENTER);

        // botones de acción
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        panelBotones.setBorder(new EmptyBorder(0, 10, 10, 10));

        JButton btnGuia        = crearBoton("+ Guía Turístico",      new Color(34, 120, 60));
        JButton btnVehiculo    = crearBoton("+ Vehículo",             new Color(30, 80, 160));
        JButton btnColaborador = crearBoton("+ Colaborador Externo",  new Color(140, 70, 10));
        JButton btnMostrar     = crearBoton("Ver todos los registros", new Color(80, 80, 80));
        JButton btnLimpiar     = crearBoton("Limpiar pantalla",        new Color(160, 30, 30));

        // asignamos acciones al clic en cada boton
        btnGuia.addActionListener(this::ingresarGuia);
        btnVehiculo.addActionListener(this::ingresarVehiculo);
        btnColaborador.addActionListener(this::ingresarColaborador);
        btnMostrar.addActionListener(e -> mostrarTodos());
        btnLimpiar.addActionListener(e -> areaResultados.setText(""));

        panelBotones.add(btnGuia);
        panelBotones.add(btnVehiculo);
        panelBotones.add(btnColaborador);
        panelBotones.add(btnMostrar);
        panelBotones.add(btnLimpiar);

        add(panelBotones, BorderLayout.SOUTH);

        // mostramos los datos de prueba al iniciar la APP
        mostrarTodos();
    }
    // A continuación los metodos de ingreso

    private void ingresarGuia(ActionEvent e) {
        JTextField campoNombre       = new JTextField();
        JTextField campoRut          = new JTextField();
        JTextField campoEspecialidad = new JTextField();

        Object[] campos = {
            "Nombre del guía:",       campoNombre,
            "RUT:",                   campoRut,
            "Especialidad:",          campoEspecialidad
        };

        int opcion = JOptionPane.showConfirmDialog(this, campos,
                "Ingresar Guía Turístico", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            String nombre       = campoNombre.getText().trim();
            String rut          = campoRut.getText().trim();
            String especialidad = campoEspecialidad.getText().trim();

            // Validación básica: los campos no deben estar vacíos
            if (nombre.isEmpty() || rut.isEmpty() || especialidad.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Todos los campos son obligatorios.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            GuiaTuristico nuevo = new GuiaTuristico(nombre, rut, especialidad);
            gestor.agregar(nuevo);
            areaResultados.append("✔ Guía registrado: " + nombre + "\n");
        }
    }


     // Ingreso de nuevo vehiculo
    private void ingresarVehiculo(ActionEvent e) {
        JTextField campoCodigo      = new JTextField();
        JTextField campoDescripcion = new JTextField();
        JTextField campoPatente     = new JTextField();

        Object[] campos = {
            "Código del vehículo:", campoCodigo,
            "Descripción:",         campoDescripcion,
            "Patente:",             campoPatente
        };

        int opcion = JOptionPane.showConfirmDialog(this, campos,
                "Ingresar Vehículo", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            String codigo      = campoCodigo.getText().trim();
            String descripcion = campoDescripcion.getText().trim();
            String patente     = campoPatente.getText().trim();

            if (codigo.isEmpty() || descripcion.isEmpty() || patente.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Todos los campos son obligatorios.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Vehiculo nuevo = new Vehiculo(codigo, descripcion, patente);
            gestor.agregar(nuevo);
            areaResultados.append("Vehículo registrado: " + descripcion + " [" + patente + "]\n");
        }
    }


     // Agregar colaborador externo

    private void ingresarColaborador(ActionEvent e) {
        JTextField campoNombre  = new JTextField();
        JTextField campoRut     = new JTextField();
        JTextField campoEmpresa = new JTextField();

        Object[] campos = {
            "Nombre del colaborador:", campoNombre,
            "RUT:",                    campoRut,
            "Empresa:",                campoEmpresa
        };

        int opcion = JOptionPane.showConfirmDialog(this, campos,
                "Ingresar Colaborador Externo", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (opcion == JOptionPane.OK_OPTION) {
            String nombre  = campoNombre.getText().trim();
            String rut     = campoRut.getText().trim();
            String empresa = campoEmpresa.getText().trim();

            if (nombre.isEmpty() || rut.isEmpty() || empresa.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Todos los campos son obligatorios.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            ColaboradorExterno nuevo = new ColaboradorExterno(nombre, rut, empresa);
            gestor.agregar(nuevo);
            areaResultados.append("✔ Colaborador registrado: " + nombre + " (" + empresa + ")\n");
        }
    }


    // Mostrar todos los registros

    private void mostrarTodos() {
        areaResultados.setText(""); // Limpiar antes de mostrar
        StringBuilder sb = new StringBuilder();

        sb.append("=================================================\n");
        sb.append("   REGISTRO DE ENTIDADES - LLANQUIHUE TOUR\n");
        sb.append("=================================================\n\n");

        for (Registrable entidad : gestor.getEntidades()) {

            // instanceof diferencia el tipo en tiempo de ejecución
            if (entidad instanceof GuiaTuristico guia) {
                sb.append(">> PERSONAL GUÍA\n");
                sb.append(guia.obtenerResumen()).append("\n");
                sb.append("   [Especialidad: ").append(guia.getEspecialidad()).append("]\n");

            } else if (entidad instanceof ColaboradorExterno colaborador) {
                sb.append(">> COLABORADOR EXTERNO\n");
                sb.append(colaborador.obtenerResumen()).append("\n");
                sb.append("   [Empresa: ").append(colaborador.getEmpresa()).append("]\n");

            } else if (entidad instanceof Vehiculo vehiculo) {
                sb.append(">> RECURSO MATERIAL\n");
                sb.append(vehiculo.obtenerResumen()).append("\n");
                sb.append("   [Patente: ").append(vehiculo.getPatente()).append("]\n");

            } else {
                sb.append(entidad.obtenerResumen()).append("\n");
            }

            sb.append("-------------------------------------------------\n");
        }

        sb.append("\nTotal registrado: ").append(gestor.getEntidades().size()).append(" entidades.");
        areaResultados.setText(sb.toString());
        areaResultados.setCaretPosition(0); // Scroll al inicio
    }

    // estilos de los botones

    private JButton crearBoton(String texto, Color color) {
        JButton btn = new JButton(texto);
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 12));
        btn.setBorder(BorderFactory.createEmptyBorder(8, 14, 8, 14));
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return btn;
    }
}
