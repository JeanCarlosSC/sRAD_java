package sRAD_java.gui.sComponent;

import javax.swing.*;
import java.awt.*;

import static sRAD_java.gui.component.Resource.DTII14;
import static sRAD_java.gui.component.Resource.fontText;

public class SLabel extends JLabel {

//DEFAULT LABEL
    /**
     * default
     */
    public SLabel(){
        super();
    }

//ICON LABEL

    public SLabel (int x, int y, ImageIcon icon) {
        setProperties(x, y, icon, null);
    }

    public SLabel (int x, int y, ImageIcon icon, Cursor cursor) {
        setProperties(x, y, icon, cursor);
    }

    /**
     * icon label
     */
    public void setProperties(int x, int y, ImageIcon icon) {
        this.setSize(icon.getIconWidth(), icon.getIconHeight());
        this.setLocation(x, y);
        this.setIcon(icon);
    }

    public void setProperties(int x, int y, ImageIcon icon, Cursor cursor) {
        setProperties(x, y, icon);
        this.setCursor(cursor);
    }

//TEXT LABEL

    public SLabel (int x, int y, int width, int height, String text) {
        setProperties(x, y, width, height, text, fontText, DTII14, LEFT, null);
    }

    public SLabel (int x, int y, int width, int height, String text, int hAlignment) {
        setProperties(x, y, width, height, text, fontText, DTII14, hAlignment, null);
    }

    public SLabel (int x, int y, int width, int height, String text, Font font) {
        setProperties(x, y, width, height, text, font, DTII14, LEFT, null);
    }

    public SLabel (int x, int y, int width, int height, String text, Font font, Color foreground, int hAlignment, Color background) {
        setProperties(x , y, width, height, text, font, foreground, hAlignment, background);
    }

    /**
     * text label
     */
    public void setProperties(int x, int y, int width, int height, String text, Font font, Color foreground, int hAlignment) {
        this.setBounds(x, y, width, height);
        this.setForeground(foreground);
        this.setFont(font);
        this.setText(text);
        this.setHorizontalAlignment(hAlignment);
    }

    public void setProperties(int x, int y, int width, int height, String text, Font font, Color foreground, int hAlignment, Color background) {
        setProperties(x, y, width, height, text, font, foreground, hAlignment);
        this.setBackground(background);
    }

}
