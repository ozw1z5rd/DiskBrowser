package com.bytezone.diskbrowser.visicalc;

public class Asin extends ValueFunction
{
  Asin (Cell cell, String text)
  {
    super (cell, text);
    assert text.startsWith ("@ASIN(") : text;
  }

  @Override
  public double calculateValue ()
  {
    return Math.asin (source.getDouble ());
  }
}