package com.simpleplugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

/**
 * Created by Cosmin on 09/03/14.
 */
public class SimpleLexerAdapter extends FlexAdapter {
    public SimpleLexerAdapter() {
        super(new SimpleLexer((Reader) null));
    }
}
