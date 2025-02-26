package Logica.Principal;


import Logica.CRUD.CrudSesion;
import Logica.CRUD.CrudTurno;
import Logica.CRUD.CrudUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase representa una ventana de administración.
 */
public class VistaAdmin extends JDialog {
    private JPanel vistaAdmin;
    private JButton SALIRButton;
    private JButton USUARIOSButton;
    private JButton TURNOSButton;
    private JButton SESIONESButton;

    /**
     * Crea una nueva instancia de VistaAdmin.
     *
     * @param parent El marco padre de la ventana.
     */
    public VistaAdmin(Frame parent) {
        super(parent);
        setTitle("Administración");
        setContentPane(vistaAdmin);
        setMinimumSize(new Dimension(920, 820));
        setModal(true);
        setLocationRelativeTo(parent);

        SALIRButton.addActionListener(e -> dispose());

        USUARIOSButton.addActionListener(e -> {
            CrudUsuario crudUsuario = new CrudUsuario(null);
        });

        TURNOSButton.addActionListener(e -> {
            CrudTurno crudTurno = new CrudTurno(null);
        });

        SESIONESButton.addActionListener(e -> {
            CrudSesion crudSesion=new CrudSesion(null);
        });
    }
}
