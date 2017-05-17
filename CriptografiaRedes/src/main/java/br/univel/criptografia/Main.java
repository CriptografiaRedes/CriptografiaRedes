package br.univel.criptografia;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class Main extends JFrame{

	private JTextArea taDescriptografar;
	private JTextArea taCriptografar;

	public Main() {
		setSize(400,400);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		taCriptografar = new JTextArea();
		GridBagConstraints gbc_taCriptografar = new GridBagConstraints();
		gbc_taCriptografar.gridwidth = 2;
		gbc_taCriptografar.insets = new Insets(5, 5, 5, 5);
		gbc_taCriptografar.fill = GridBagConstraints.BOTH;
		gbc_taCriptografar.gridx = 0;
		gbc_taCriptografar.gridy = 0;
		panel.add(taCriptografar, gbc_taCriptografar);
		
		JButton btnCriptografar = new JButton("Criptografar");
		btnCriptografar.addActionListener(criptografar());
		GridBagConstraints gbc_btnCriptografar = new GridBagConstraints();
		gbc_btnCriptografar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCriptografar.anchor = GridBagConstraints.NORTH;
		gbc_btnCriptografar.insets = new Insets(5, 5, 5, 5);
		gbc_btnCriptografar.gridx = 0;
		gbc_btnCriptografar.gridy = 1;
		panel.add(btnCriptografar, gbc_btnCriptografar);
		
		JButton btnDescriptografar = new JButton("Descriptografar");
		btnCriptografar.addActionListener(descriptografar());
		GridBagConstraints gbc_btnDescriptografar = new GridBagConstraints();
		gbc_btnDescriptografar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDescriptografar.anchor = GridBagConstraints.NORTH;
		gbc_btnDescriptografar.insets = new Insets(5, 5, 5, 5);
		gbc_btnDescriptografar.gridx = 1;
		gbc_btnDescriptografar.gridy = 1;
		panel.add(btnDescriptografar, gbc_btnDescriptografar);
		
		taDescriptografar = new JTextArea();
		GridBagConstraints gbc_taDescriptografar = new GridBagConstraints();
		gbc_taDescriptografar.gridwidth = 2;
		gbc_taDescriptografar.insets = new Insets(5, 5, 5, 5);
		gbc_taDescriptografar.fill = GridBagConstraints.BOTH;
		gbc_taDescriptografar.gridx = 0;
		gbc_taDescriptografar.gridy = 2;
		panel.add(taDescriptografar, gbc_taDescriptografar);
	}

	private ActionListener descriptografar() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = taDescriptografar.getText();
				for (int i = 1; i < aux.length() - 1; i++){
					taCriptografar.append(aux.substring(i, i + 1));
				}
			}
		};		
	}

	private ActionListener criptografar() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String aux = taCriptografar.getText();
				for (int i = aux.length() - 1; i >= 0; i--){
					taDescriptografar.append(aux.substring(i, i + 1));
				}
			}
		};
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
