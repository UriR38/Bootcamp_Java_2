import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String mensaje = "<html>El total es:<br>" +
                "&emsp 120 € (IVA 10 % no incl.)<br>" +
                "&emsp 132 € (con IVA incl.)</html>";

        JOptionPane.showMessageDialog(null, mensaje, "Ticket", JOptionPane.INFORMATION_MESSAGE);
    }
}
