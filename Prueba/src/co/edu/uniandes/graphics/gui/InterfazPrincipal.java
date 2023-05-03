package co.edu.uniandes.graphics.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class InterfazPrincipal extends JFrame
{
	
	private PanelLienzo paneLienzo;
	
	public static void main (String[ ] args)
    {
        InterfazPrincipal interfaz= new InterfazPrincipal();
        interfaz.setLocationRelativeTo( null );
        interfaz.setVisible( true );
    }
	
	public InterfazPrincipal()
	{
		
	
		setSize(700, 700);
		
		setDefaultCloseOperation( DISPOSE_ON_CLOSE );
        setTitle( "Figuras" );               
        paneLienzo= new PanelLienzo( );
        setLayout(new BorderLayout());
        add(paneLienzo, null);
	}
	
	

}
