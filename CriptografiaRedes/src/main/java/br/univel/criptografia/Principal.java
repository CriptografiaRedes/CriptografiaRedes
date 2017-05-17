package br.univel.criptografia;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Font;

public class Principal extends JFrame {

	private static final long serialVersionUID = 7801781534080022909L;
	private Dimension dimensaoTela = Toolkit.getDefaultToolkit().getScreenSize();
	private JTextField tfValorA;
	private JTextField tfValorB;
	private JTextField tfValorC;

	public Principal() {
		setResizable(false);
		setTitle("Criptografia Redes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocation((dimensaoTela.width - this.getSize().width) / 2, (dimensaoTela.height - this.getSize().height) / 2);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 85, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTH;
		gbc_panel_1.insets = new Insets(10, 10, 10, 10);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JLabel lbValorA = new JLabel("ValorA :");
		lbValorA.setFont(new Font("Dialog", Font.BOLD, 15));
		GridBagConstraints gbc_lbValorA = new GridBagConstraints();
		gbc_lbValorA.insets = new Insets(5, 0, 5, 0);
		gbc_lbValorA.anchor = GridBagConstraints.EAST;
		gbc_lbValorA.gridx = 1;
		gbc_lbValorA.gridy = 1;
		panel_1.add(lbValorA, gbc_lbValorA);

		tfValorA = new JTextField();
		tfValorA.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_tfValorA = new GridBagConstraints();
		gbc_tfValorA.gridwidth = 3;
		gbc_tfValorA.insets = new Insets(10, 10, 10, 10);
		gbc_tfValorA.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfValorA.gridx = 2;
		gbc_tfValorA.gridy = 1;
		panel_1.add(tfValorA, gbc_tfValorA);
		tfValorA.setColumns(10);

		JButton btnCriptografar = new JButton("Criptografar");
		btnCriptografar.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_btnCriptografar = new GridBagConstraints();
		gbc_btnCriptografar.gridwidth = 4;
		gbc_btnCriptografar.gridx = 1;
		gbc_btnCriptografar.gridy = 2;
		panel_1.add(btnCriptografar, gbc_btnCriptografar);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.NORTH;
		gbc_panel.insets = new Insets(10, 10, 10, 10);
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lbValorB = new JLabel("ValorB :");
		lbValorB.setFont(new Font("Dialog", Font.BOLD, 15));
		GridBagConstraints gbc_lbValorB = new GridBagConstraints();
		gbc_lbValorB.anchor = GridBagConstraints.EAST;
		gbc_lbValorB.insets = new Insets(5, 0, 5, 0);
		gbc_lbValorB.gridx = 1;
		gbc_lbValorB.gridy = 1;
		panel.add(lbValorB, gbc_lbValorB);

		tfValorB = new JTextField();
		tfValorB.setFont(new Font("Dialog", Font.PLAIN, 17));
		GridBagConstraints gbc_tfValorB = new GridBagConstraints();
		gbc_tfValorB.insets = new Insets(10, 10, 10, 10);
		gbc_tfValorB.gridwidth = 3;
		gbc_tfValorB.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfValorB.gridx = 2;
		gbc_tfValorB.gridy = 1;
		panel.add(tfValorB, gbc_tfValorB);
		tfValorB.setColumns(10);

		JButton btnDescriptografar = new JButton("Descriptografar");
		btnDescriptografar.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_btnDescriptografar = new GridBagConstraints();
		gbc_btnDescriptografar.gridwidth = 4;
		gbc_btnDescriptografar.gridx = 1;
		gbc_btnDescriptografar.gridy = 2;
		panel.add(btnDescriptografar, gbc_btnDescriptografar);

		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(10, 10, 10, 10);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 2;
		getContentPane().add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		JLabel lbValorC = new JLabel("ValorC :");
		lbValorC.setFont(new Font("Dialog", Font.BOLD, 15));
		GridBagConstraints gbc_lbValorC = new GridBagConstraints();
		gbc_lbValorC.insets = new Insets(5, 0, 5, 0);
		gbc_lbValorC.anchor = GridBagConstraints.EAST;
		gbc_lbValorC.gridx = 1;
		gbc_lbValorC.gridy = 1;
		panel_2.add(lbValorC, gbc_lbValorC);

		tfValorC = new JTextField();
		tfValorC.setFont(new Font("Gadugi", Font.PLAIN, 17));
		GridBagConstraints gbc_tfValorC = new GridBagConstraints();
		gbc_tfValorC.gridwidth = 3;
		gbc_tfValorC.insets = new Insets(10, 10, 10, 10);
		gbc_tfValorC.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfValorC.gridx = 2;
		gbc_tfValorC.gridy = 1;
		panel_2.add(tfValorC, gbc_tfValorC);
		tfValorC.setColumns(10);
	}

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}