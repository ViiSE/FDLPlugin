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

public class FDLExpressionsImpl extends ASTWrapperPsiElement implements FDLExpressions {

  public FDLExpressionsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FDLVisitor visitor) {
    visitor.visitExpressions(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FDLVisitor) accept((FDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public FDLLiteralAny getLiteralAny() {
    return findNotNullChildByClass(FDLLiteralAny.class);
  }

  @Override
  @NotNull
  public FDLOperations getOperations() {
    return findNotNullChildByClass(FDLOperations.class);
  }

}
