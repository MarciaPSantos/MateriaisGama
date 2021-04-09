package br.com.bankofozutil;

import javax.swing.JOptionPane;

	public class Magica {

		public static boolean b(String msg) {
			if (JOptionPane.showConfirmDialog(null, msg, "?", JOptionPane.YES_NO_OPTION)==0) {
				return true;
			}
			return false;
		}
		
		public static int i(String msg) {
			return Integer.parseInt(s(msg));
		}
		
		public static float f(String msg) {
			return Float.parseFloat(s(msg));
		}
		
		public static String s(String msg) {
			return JOptionPane.showInputDialog(msg).toLowerCase();
		}
		
		
	}
