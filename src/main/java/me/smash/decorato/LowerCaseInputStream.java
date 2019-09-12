package me.smash.decorato;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

  public LowerCaseInputStream(InputStream in) {
    super(in);
  }

  @Override
  public int read() throws IOException {
    int c = super.read();
    if (c != -1) {
      c = Character.toLowerCase(c);
    }

    return c;
  }

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    int counts = super.read(b, off, len);
    for (int i = 0; i < counts; i++) {
      b[i] = (byte)Character.toLowerCase(b[i]);
    }
    return counts;
  }
}
