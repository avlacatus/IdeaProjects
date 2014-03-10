// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.simpleplugin.psi.SimpleProperty;
import com.simpleplugin.psi.SimpleVisitor;
import org.jetbrains.annotations.NotNull;

public class SimplePropertyImpl extends SimpleNamedElementImpl implements SimpleProperty {

  public SimplePropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) ((SimpleVisitor)visitor).visitProperty(this);
    else super.accept(visitor);
  }

  public String getKey() {
    return SimplePsiImplUtil.getKey(this);
  }

  public String getValue() {
    return SimplePsiImplUtil.getValue(this);
  }

  public String getName() {
    return SimplePsiImplUtil.getName(this);
  }

  public PsiElement setName(String newName) {
    return SimplePsiImplUtil.setName(this, newName);
  }

  public PsiElement getNameIdentifier() {
    return SimplePsiImplUtil.getNameIdentifier(this);
  }

}
