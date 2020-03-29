import java.awt.*;

import javax.swing.*;
class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String selecteditem = null;
	String[] test = { "100", "200", "300", "400" };
	
	public String getElementAt(int index) {
		return test[index];
	}
	
	public int getSize() {
		return test.length;
	}
	
	public void setSelectedItem(Object item) {
		selecteditem = (String) item;
	}
	
	public Object getSelectedItem() {
		return selecteditem;
	}
	
	public int getIndex() {
		for (int i = 0; i < test.length; i++) {
			if (test[i].equals(getSelectedItem()))
				return i;
		}
		return 0;
	}
}