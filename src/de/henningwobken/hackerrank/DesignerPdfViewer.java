package de.henningwobken.hackerrank;

import java.nio.CharBuffer;
import java.util.Arrays;

public class DesignerPdfViewer {
    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        return word.chars().map(c -> h[c - 'a']).max().getAsInt() * word.length();
    }
}
