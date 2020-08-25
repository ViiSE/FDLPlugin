// This is a generated file. Not intended for manual editing.
package com.github.viise.fdl.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.viise.fdl.psi.FDLTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.github.viise.fdl.*;

public class FDLSubWComma1Impl extends ASTWrapperPsiElement implements FDLSubWComma1 {

  public FDLSubWComma1Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FDLVisitor visitor) {
    visitor.visitSubWComma1(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FDLVisitor) accept((FDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<FDLCondWComma1> getCondWComma1List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FDLCondWComma1.class);
  }

  @Override
  @NotNull
  public List<FDLLiteralAny> getLiteralAnyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FDLLiteralAny.class);
  }

  @Override
  @NotNull
  public List<FDLOperations> getOperationsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, FDLOperations.class);
  }

}
