package com.bytezone.diskbrowser.gui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import com.bytezone.diskbrowser.applefile.Palette;

public class PaletteAction extends AbstractAction
{
  private final Palette palette;
  private final DataPanel owner;

  public PaletteAction (DataPanel owner, Palette palette)
  {
    super (palette.getName ());
    putValue (Action.SHORT_DESCRIPTION, "Select color palette: " + palette.getName ());
    this.owner = owner;
    this.palette = palette;
  }

  @Override
  public void actionPerformed (ActionEvent e)
  {
    owner.selectPalette (palette);
  }
}