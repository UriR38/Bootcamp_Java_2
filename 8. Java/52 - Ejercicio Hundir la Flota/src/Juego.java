import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Juego extends JFrame {
    private Tablero tablero;
    private JButton[][] botones;
    private JTextArea registro;
    private JLabel contadorBarcos;
    private JLabel contadorDisparos;
    private JLabel nivelDificultad;
    private int turnos;
    private int disparosRestantes;
    private int barcosRestantes;
    private int numBarcos;
    private int numDisparos;
    private String dificultad;
    private static final int TAMANO_BOTON = 40;

    // Rutas de las imágenes
    private static final String RUTA_AGUA = "src/imagenes/mar.png";
    private static final String RUTA_BARCO_HUNDIDO = "src/imagenes/naufragio.png";
    private static final String RUTA_AGUA_DISPARADA = "src/imagenes/agua.png";

    // Iconos de las imágenes redimensionadas
    private static final ImageIcon AGUA = redimensionarImagen(RUTA_AGUA, TAMANO_BOTON, TAMANO_BOTON);
    private static final ImageIcon BARCO_HUNDIDO = redimensionarImagen(RUTA_BARCO_HUNDIDO, TAMANO_BOTON, TAMANO_BOTON);
    private static final ImageIcon AGUA_DISPARADA = redimensionarImagen(RUTA_AGUA_DISPARADA, TAMANO_BOTON, TAMANO_BOTON);

    // Configuración de dificultades
    private static final int FACIL_BARCOS = 5;
    private static final int FACIL_DISPAROS = Integer.MAX_VALUE; // Disparos ilimitados

    private static final int MEDIO_BARCOS = 8;
    private static final int MEDIO_DISPAROS = 18;

    private static final int DIFICIL_BARCOS = 10;
    private static final int DIFICIL_DISPAROS = 10;

    public Juego() {
        // Mostrar selector de dificultad al inicio
        mostrarSelectorDificultad();
    }

    /**
     * Inicializa el juego con el número de barcos y disparos especificados según la dificultad.
     */

    private void inicializarJuego(int numBarcos, int numDisparos, String dificultad) {
        this.numBarcos = numBarcos;
        this.numDisparos = numDisparos;
        this.dificultad = dificultad;
        turnos = 0;
        disparosRestantes = numDisparos;
        barcosRestantes = numBarcos;

        tablero = new Tablero();
        botones = new JButton[Tablero.TAMANO][Tablero.TAMANO];
        registro = new JTextArea(10, 20);
        contadorBarcos = new JLabel();
        contadorDisparos = new JLabel();
        nivelDificultad = new JLabel("| Hundir la Flota | ⚓ | Dificultad: " + dificultad +" |");

        // Configuración de la interfaz gráfica
        configurarUI();

        // Colocar barcos en el tablero
        tablero.colocarBarcosAleatoriamente(numBarcos);
        actualizarContadores();
    }

    /**
     * Configura la interfaz de usuario.
     */

    private void configurarUI() {
        // Eliminar todos los componentes existentes
        getContentPane().removeAll();

        // Configuración de la ventana principal
        setTitle("Hundir la Flota");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel superior: Nombre del juego y nivel de dificultad
        JPanel panelSuperior = new JPanel(new BorderLayout());
        nivelDificultad.setHorizontalAlignment(SwingConstants.CENTER);
        panelSuperior.add(nivelDificultad, BorderLayout.CENTER);

        // Panel central que contiene el número de barcos y disparos restantes, y los botones de reinicio
        JPanel panelCentralSuperior = new JPanel(new BorderLayout());
        JPanel panelInfo = new JPanel(new GridLayout(2, 1));
        panelInfo.add(contadorBarcos);
        panelInfo.add(contadorDisparos);

        // Botón para cambiar la dificultad
        JButton btnReiniciar = new JButton("Cambiar Dificultad");
        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciarJuego();
            }
        });

        // Botón para reiniciar el tablero con la misma dificultad
        JButton btnReiniciarMismaDificultad = new JButton("Reiniciar Tablero");
        btnReiniciarMismaDificultad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciarTablero();
            }
        });

        JPanel panelBotones = new JPanel(new GridLayout(2, 1));
        panelBotones.add(btnReiniciarMismaDificultad);
        panelBotones.add(btnReiniciar);

        panelCentralSuperior.add(panelInfo, BorderLayout.WEST);
        panelCentralSuperior.add(panelBotones, BorderLayout.EAST);

        // Creación del panel del tablero
        JPanel panelTablero = new JPanel(new GridLayout(Tablero.TAMANO, Tablero.TAMANO));
        for (int i = 0; i < Tablero.TAMANO; i++) {
            for (int j = 0; j < Tablero.TAMANO; j++) {
                botones[i][j] = new JButton(AGUA);
                botones[i][j].setPreferredSize(new Dimension(TAMANO_BOTON, TAMANO_BOTON));
                botones[i][j].setDisabledIcon(AGUA);  // Icono deshabilitado para mantener el color original
                botones[i][j].setFocusable(false);    // Desactivar el enfoque en los botones
                final int x = i;
                final int y = j;
                botones[i][j].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        manejarDisparo(x, y);
                    }
                });
                panelTablero.add(botones[i][j]);
            }
        }

        // Configuración del área de registro de disparos
        registro.setEditable(false);
        registro.setBackground(Color.BLACK);
        registro.setForeground(Color.WHITE);
        JScrollPane scrollRegistro = new JScrollPane(registro);

        // Añadir componentes a la ventana principal
        JPanel panelSuperiorCompleto = new JPanel(new BorderLayout());
        panelSuperiorCompleto.add(panelSuperior, BorderLayout.NORTH);
        panelSuperiorCompleto.add(panelCentralSuperior, BorderLayout.CENTER);

        add(panelSuperiorCompleto, BorderLayout.NORTH);
        add(panelTablero, BorderLayout.CENTER);
        add(scrollRegistro, BorderLayout.SOUTH);

        // Establecer tamaño de la ventana
        setSize(400, 600); // Cambia el tamaño según tus necesidades
        setLocationRelativeTo(null);
        setVisible(true);
        repaint();
        revalidate();
    }

    /**
     * Maneja la acción de disparo en el tablero.
     *
     * @param x Coordenada X del disparo
     * @param y Coordenada Y del disparo
     */

    private void manejarDisparo(int x, int y) {
        turnos++;
        disparosRestantes--;
        boolean acertado = tablero.recibirDisparo(x, y);
        if (acertado) {
            botones[x][y].setIcon(BARCO_HUNDIDO);
            botones[x][y].setDisabledIcon(BARCO_HUNDIDO);
            botones[x][y].setBackground(Color.RED);
            registro.append("Turno " + turnos + ": " + (x + 1) + ", " + (y + 1) + " (barco hundido)\n");
            barcosRestantes--;
        } else {
            botones[x][y].setIcon(AGUA_DISPARADA);
            botones[x][y].setDisabledIcon(AGUA_DISPARADA);
            botones[x][y].setBackground(Color.CYAN);
            registro.append("Turno " + turnos + ": " + (x + 1) + ", " + (y + 1) + " (agua)\n");
        }
        botones[x][y].setEnabled(false);
        botones[x][y].setFocusable(false); // Desactivar el enfoque en los botones deshabilitados
        actualizarContadores();

        if (barcosRestantes == 0) {
            registro.append("¡Victoria!\n");
            JOptionPane.showMessageDialog(this, "¡Has hundido todos los barcos!");
        } else if (disparosRestantes == 0) {
            registro.append("¡Game Over!\n");
            JOptionPane.showMessageDialog(this, "¡No te quedan disparos!");
        }
    }

    /**
     * Actualiza los contadores de barcos y disparos.
     */

    private void actualizarContadores() {
        contadorBarcos.setText("Barcos enemigos restantes: " + barcosRestantes);
        contadorDisparos.setText("Disparos restantes: " + (disparosRestantes == Integer.MAX_VALUE ? "∞" : disparosRestantes));
    }

    /**
     * Muestra el selector de dificultad al inicio.
     */

    private void mostrarSelectorDificultad() {
        JFrame selectorFrame = new JFrame("Seleccionar Dificultad");
        selectorFrame.setLayout(new GridLayout(3, 1));
        selectorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selectorFrame.setSize(300, 200);

        // Botón para seleccionar la dificultad fácil
        JButton btnFacil = new JButton("Fácil");
        btnFacil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inicializarJuego(FACIL_BARCOS, FACIL_DISPAROS, "Fácil");
                selectorFrame.dispose();
            }
        });

        // Botón para seleccionar la dificultad media
        JButton btnMedio = new JButton("Intermedia");
        btnMedio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inicializarJuego(MEDIO_BARCOS, MEDIO_DISPAROS, "Intermedia");
                selectorFrame.dispose();
            }
        });

        // Botón para seleccionar la dificultad difícil
        JButton btnDificil = new JButton("Difícil");
        btnDificil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inicializarJuego(DIFICIL_BARCOS, DIFICIL_DISPAROS, "Difícil");
                selectorFrame.dispose();
            }
        });

        selectorFrame.add(btnFacil);
        selectorFrame.add(btnMedio);
        selectorFrame.add(btnDificil);

        selectorFrame.setLocationRelativeTo(null);
        selectorFrame.setVisible(true);
    }

    /**
     * Reinicia el juego mostrando nuevamente el selector de dificultad.
     */

    private void reiniciarJuego() {
        getContentPane().removeAll();
        mostrarSelectorDificultad();
    }

    /**
     * Reinicia el tablero manteniendo la misma dificultad.
     */

    private void reiniciarTablero() {
        inicializarJuego(numBarcos, numDisparos, dificultad);
    }

    /**
     * Redimensiona una imagen a las dimensiones especificadas.
     *
     * @param ruta  Ruta de la imagen
     * @param ancho Ancho deseado
     * @param alto  Alto deseado
     * @return ImageIcon redimensionado
     */

    private static ImageIcon redimensionarImagen(String ruta, int ancho, int alto) {
        try {
            BufferedImage imagenOriginal = ImageIO.read(new File(ruta));
            Image imagenRedimensionada = imagenOriginal.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            BufferedImage imagenFinal = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = imagenFinal.createGraphics();
            g2d.drawImage(imagenRedimensionada, 0, 0, null);
            g2d.dispose();
            return new ImageIcon(imagenFinal);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
