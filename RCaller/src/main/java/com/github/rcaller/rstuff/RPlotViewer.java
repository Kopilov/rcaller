/*
 *
RCaller, A solution for calling R from Java
Copyright (C) 2010-2014  Mehmet Hakan Satman

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation, either version 3 of the License, or
any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * Mehmet Hakan Satman - mhsatman@yahoo.com
 * http://www.mhsatman.com
 * Google code project: https://github.com/jbytecode/rcaller
 * Please visit the blog page with rcaller label:
 * http://stdioe.blogspot.com.tr/search/label/rcaller
 */

package com.github.rcaller.rstuff;

import com.github.rcaller.util.Globals;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Mehmet Hakan Satman
 */
public class RPlotViewer extends JFrame {

  private ImageIcon img;

  public ImageIcon getImg() {
    return img;
  }

  public void setImg(ImageIcon img) {
    this.img = img;
  }

  public RPlotViewer(ImageIcon img) {
    this.img = img;
    this.setSize(img.getIconWidth() + 20, img.getIconHeight() + 60);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setTitle(Globals.version + " - Generated Plot");
    repaint();
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    if (img != null) {
      g.drawImage(this.img.getImage(), 10, 30, this);
    }
  }
}
