/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author lili_work1
 */
public class JOptionPaneArrays
{

    // Arrays 1D
    public static JPanel createJPanel(Component parentComponnet, char[] matrix, String message)
    {
        GridLayout gridLay = null;
        JLabel label = null;
        JPanel panel = null;

        gridLay = new GridLayout(matrix.length + 1, 2, 1, 1);
        panel = new JPanel(gridLay);

        for (int r = 0; r < matrix.length; r++)
        {
            // **** Rows labels (Letters) ********
            label = new JLabel("" + r);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
            // ***********************************

            label = new JLabel("");
            label.setText("" + matrix[r]);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);

        }

        JPanel panel2 = new JPanel();
        panel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        panel2.add(panel);

        JLabel label2 = new JLabel(message);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(label2);

        return panel2;
    }

    public static JPanel createJPanel(Component parentComponnet, int[] matrix, String message, boolean showText)
    {
        GridLayout gridLay = null;
        JLabel label = null;
        JPanel panel = null;

        gridLay = new GridLayout(matrix.length + 1, 2, 1, 1);
        panel = new JPanel(gridLay);

        for (int r = 0; r < matrix.length; r++)
        {
            // **** Rows labels (Letters) ********
            label = new JLabel("" + r);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
            // ***********************************

            label = new JLabel("");
            label.setText("" + matrix[r]);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);

        }

        JPanel panel2 = new JPanel();
        panel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        panel2.add(panel);

        JLabel label2 = new JLabel(message);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(label2);

        return panel2;
    }

    public static JPanel createJPanel(Component parentComponnet, float[] matrix, String message)
    {
        GridLayout gridLay = null;
        JLabel label = null;
        JPanel panel = null;

        gridLay = new GridLayout(matrix.length + 1, 2, 1, 1);
        panel = new JPanel(gridLay);

        for (int r = 0; r < matrix.length; r++)
        {
            // **** Rows labels (Letters) ********
            label = new JLabel("" + r);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
            // ***********************************

            label = new JLabel("");
            label.setText("" + matrix[r]);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);

        }

        JPanel panel2 = new JPanel();
        panel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        panel2.add(panel);

        JLabel label2 = new JLabel(message);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(label2);

        return panel2;
    }

    public static JPanel createJPanel(Component parentComponnet, String[] matrix, String message)
    {
        GridLayout gridLay = null;
        JLabel label = null;
        JPanel panel = null;

        gridLay = new GridLayout(matrix.length + 1, 2, 1, 1);
        panel = new JPanel(gridLay);

        for (int r = 0; r < matrix.length; r++)
        {
            // **** Rows labels (Letters) ********
            label = new JLabel("" + r);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
            // ***********************************

            label = new JLabel("");
            label.setText("" + matrix[r]);
            label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);

        }

        JPanel panel2 = new JPanel();
        panel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        panel2.add(panel);

        JLabel label2 = new JLabel(message);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(label2);

        return panel2;
    }

    // Arrays 2D
    public static JPanel createJPanel(Component parentComponnet, char[][] matrix, String message)
    {
        GridLayout gridLay = null;
        JLabel label = null;
        JPanel panel = null;

        gridLay = new GridLayout(matrix.length + 1, matrix[0].length + 1, 1, 1);
        panel = new JPanel(gridLay);
        label = new JLabel("");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        panel.add(label);

        // ******* Column labels (numbers) *******
        for (int c = 0; c < matrix[0].length; c++)
        {
            label = new JLabel("" + c);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
        }
        // ***************************************

        for (int r = 0; r < matrix.length; r++)
        {
            // **** Rows labels (Letters) ********
            label = new JLabel("" + r);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
            // ***********************************

            for (int c = 0; c < matrix[r].length; c++)
            {
                label = new JLabel("");
                label.setText("" + matrix[r][c]);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setVerticalAlignment(SwingConstants.CENTER);
                panel.add(label);
            }
        }

        JPanel panel2 = new JPanel();
        panel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        panel2.add(panel);

        JLabel label2 = new JLabel(message);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(label2);

        return panel2;
    }

    public static JPanel createJPanel(Component parentComponnet, int[][] matrix, String message, boolean showAsColors)
    {
        GridLayout gridLay = null;
        JLabel label = null;
        JPanel panel = null;

        gridLay = new GridLayout(matrix.length + 1, matrix[0].length + 1, 0, 0);
        panel = new JPanel(gridLay);
        label = new JLabel("");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        panel.add(label);

        // ******* Column labels (numbers) *******
        for (int c = 0; c < matrix[0].length; c++)
        {
            label = new JLabel("" + c);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
        }
        // ***************************************

        for (int r = 0; r < matrix.length; r++)
        {
            // **** Rows labels (Letters) ********
            label = new JLabel("" + r);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
            // ***********************************

            for (int c = 0; c < matrix[r].length; c++)
            {
                label = new JLabel("");
                if (showAsColors)
                {
                    label.setOpaque(true);
                    label.setBackground(new Color(matrix[r][c]));
                }
                else
                    label.setText("" + matrix[r][c]);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setVerticalAlignment(SwingConstants.CENTER);
                panel.add(label);
            }
        }

        JPanel panel2 = new JPanel();
        panel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        panel2.add(panel);
        JLabel label2 = new JLabel(message);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(label2);

        return panel2;
    }

    public static JPanel createJPanel(Component parentComponnet, float[][] matrix, String message)
    {
        GridLayout gridLay = null;
        JLabel label = null;
        JPanel panel = null;

        gridLay = new GridLayout(matrix.length + 1, matrix[0].length + 1, 1, 1);
        panel = new JPanel(gridLay);
        label = new JLabel("");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        panel.add(label);

        // ******* Column labels (numbers) *******
        for (int c = 0; c < matrix[0].length; c++)
        {
            label = new JLabel("" + c);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
        }
        // ***************************************

        for (int r = 0; r < matrix.length; r++)
        {
            // **** Rows labels (Letters) ********
            label = new JLabel("" + r);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
            // ***********************************

            for (int c = 0; c < matrix[r].length; c++)
            {
                label = new JLabel("");
                label.setText("" + matrix[r][c]);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setVerticalAlignment(SwingConstants.CENTER);
                panel.add(label);
            }
        }

        JPanel panel2 = new JPanel();
        panel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        panel2.add(panel);
        JLabel label2 = new JLabel(message);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(label2);

        return panel2;
    }

    public static JPanel createJPanel(Component parentComponnet, String[][] matrix, String message)
    {
        GridLayout gridLay = null;
        JLabel label = null;
        JPanel panel = null;

        gridLay = new GridLayout(matrix.length + 1, matrix[0].length + 1, 1, 1);
        panel = new JPanel(gridLay);
        label = new JLabel("");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        panel.add(label);

        // ******* Column labels (numbers) *******
        for (int c = 0; c < matrix[0].length; c++)
        {
            label = new JLabel("" + c);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
        }
        // ***************************************

        for (int r = 0; r < matrix.length; r++)
        {
            // **** Rows labels (Letters) ********
            label = new JLabel("" + r);
            label.setOpaque(true);
            label.setForeground(Color.white);
            label.setBackground(Color.black);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setVerticalAlignment(SwingConstants.CENTER);
            panel.add(label);
            // ***********************************

            for (int c = 0; c < matrix[r].length; c++)
            {
                label = new JLabel("");
                label.setText("" + matrix[r][c]);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setVerticalAlignment(SwingConstants.CENTER);
                panel.add(label);
            }
        }

        JPanel panel2 = new JPanel();
        panel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));

        panel2.add(panel);
        JLabel label2 = new JLabel(message);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel2.add(label2);

        return panel2;
    }

    public static void showMessageDialog(Component parentComponent, char[] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);
        JOptionPane.showMessageDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static String showInputDialog(Component parentComponent, char[] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);

        return JOptionPane.showInputDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showMessageDialog(Component parentComponent, int[] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message, false);
        JOptionPane.showMessageDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static String showInputDialog(Component parentComponent, int[] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message, false);

        return JOptionPane.showInputDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showMessageDialog(Component parentComponent, float[] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);
        JOptionPane.showMessageDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static String showInputDialog(Component parentComponent, float[] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);

        return JOptionPane.showInputDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showMessageDialog(Component parentComponent, String[] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);
        JOptionPane.showMessageDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static String showInputDialog(Component parentComponent, String[] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);

        return JOptionPane.showInputDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showMessageDialog(Component parentComponent, char[][] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);
        JOptionPane.showMessageDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static String showInputDialog(Component parentComponent, char[][] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);

        return JOptionPane.showInputDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showMessageDialog(Component parentComponent, int[][] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message, false);
        JOptionPane.showMessageDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static String showInputDialog(Component parentComponent, int[][] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message, false);

        return JOptionPane.showInputDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showColorArray2D(Component parentComponent, int[][] matrix)
    {
        JPanel panel = createJPanel(parentComponent, matrix, "", true);
        JOptionPane.showMessageDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showMessageDialog(Component parentComponent, float[][] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);
        JOptionPane.showMessageDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static String showInputDialog(Component parentComponent, float[][] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);

        return JOptionPane.showInputDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static void showMessageDialog(Component parentComponent, String[][] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);
        JOptionPane.showMessageDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }

    public static String showInputDialog(Component parentComponent, String[][] matrix, String message)
    {
        JPanel panel = createJPanel(parentComponent, matrix, message);

        return JOptionPane.showInputDialog(parentComponent, panel, "", JOptionPane.PLAIN_MESSAGE);
    }
}
