package br.univel.criptografia;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainC extends JFrame {

	private static final long serialVersionUID = -86567920112192094L;
	private JTextField tfCriptografar;
	private JTextField tfDescriptografar;
	private JButton btnCriptografar;
	private JButton btnDescriptografar;
	private JButton btnLimpar;
	private String conteudoCriptografar;

	public MainC() {
		super("Criptografia Redes");
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\password.png"));
		setSize(900, 250);
		setLocationRelativeTo(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 49, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JPanel panelCriptografia = new JPanel();
		GridBagConstraints gbc_panelCriptografia = new GridBagConstraints();
		gbc_panelCriptografia.insets = new Insets(0, 0, 5, 0);
		gbc_panelCriptografia.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelCriptografia.gridx = 0;
		gbc_panelCriptografia.gridy = 1;
		getContentPane().add(panelCriptografia, gbc_panelCriptografia);
		GridBagLayout gbl_panelCriptografia = new GridBagLayout();
		gbl_panelCriptografia.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelCriptografia.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panelCriptografia.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelCriptografia.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelCriptografia.setLayout(gbl_panelCriptografia);

		JLabel lbCriptografar = new JLabel("Criptografar:");
		lbCriptografar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbCriptografar = new GridBagConstraints();
		gbc_lbCriptografar.anchor = GridBagConstraints.EAST;
		gbc_lbCriptografar.insets = new Insets(10, 10, 10, 10);
		gbc_lbCriptografar.gridx = 1;
		gbc_lbCriptografar.gridy = 2;
		panelCriptografia.add(lbCriptografar, gbc_lbCriptografar);

		tfCriptografar = new JTextField();
		tfCriptografar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_tfCriptografar = new GridBagConstraints();
		gbc_tfCriptografar.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfCriptografar.gridwidth = 3;
		gbc_tfCriptografar.insets = new Insets(10, 0, 10, 0);
		gbc_tfCriptografar.gridx = 2;
		gbc_tfCriptografar.gridy = 2;
		panelCriptografia.add(tfCriptografar, gbc_tfCriptografar);
		tfCriptografar.setColumns(10);

		btnCriptografar = new JButton("   Criptografar    ");
		btnCriptografar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCriptografar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conteudoCriptografar = tfCriptografar.getText().trim();
				btnDescriptografar.setEnabled(true);
				tfDescriptografar.setText(conteudoCriptografar);
				tfCriptografar.setText("");
			}
		});
		GridBagConstraints gbc_btnCriptografar = new GridBagConstraints();
		gbc_btnCriptografar.insets = new Insets(10, 10, 10, 10);
		gbc_btnCriptografar.gridx = 5;
		gbc_btnCriptografar.gridy = 2;
		panelCriptografia.add(btnCriptografar, gbc_btnCriptografar);

		JLabel lbDescriptografar = new JLabel("Descriptografar:");
		lbDescriptografar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lbDescriptografar = new GridBagConstraints();
		gbc_lbDescriptografar.anchor = GridBagConstraints.EAST;
		gbc_lbDescriptografar.insets = new Insets(10, 10, 10, 10);
		gbc_lbDescriptografar.gridx = 1;
		gbc_lbDescriptografar.gridy = 4;
		panelCriptografia.add(lbDescriptografar, gbc_lbDescriptografar);

		tfDescriptografar = new JTextField();
		tfDescriptografar.setEditable(false);
		tfDescriptografar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_tfDescriptografar = new GridBagConstraints();
		gbc_tfDescriptografar.gridwidth = 3;
		gbc_tfDescriptografar.insets = new Insets(10, 0, 10, 0);
		gbc_tfDescriptografar.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfDescriptografar.gridx = 2;
		gbc_tfDescriptografar.gridy = 4;
		panelCriptografia.add(tfDescriptografar, gbc_tfDescriptografar);
		tfDescriptografar.setColumns(10);

		btnDescriptografar = new JButton("Descriptografar");
		btnDescriptografar.setEnabled(false);
		btnDescriptografar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDescriptografar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GridBagConstraints gbc_btnDescriptografar = new GridBagConstraints();
		gbc_btnDescriptografar.insets = new Insets(10, 10, 10, 10);
		gbc_btnDescriptografar.gridx = 5;
		gbc_btnDescriptografar.gridy = 4;
		panelCriptografia.add(btnDescriptografar, gbc_btnDescriptografar);

		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetarCampos();
			}
		});
		GridBagConstraints gbc_btnLimpar = new GridBagConstraints();
		gbc_btnLimpar.insets = new Insets(0, 0, 5, 0);
		gbc_btnLimpar.anchor = GridBagConstraints.NORTH;
		gbc_btnLimpar.gridx = 0;
		gbc_btnLimpar.gridy = 2;
		getContentPane().add(btnLimpar, gbc_btnLimpar);
	}

	protected void resetarCampos() {
		tfCriptografar.setText("");
		tfDescriptografar.setText("");
		btnDescriptografar.setEnabled(false);
	}

	public static void main(String[] args) {
		new MainC().setVisible(true);
	}

}
