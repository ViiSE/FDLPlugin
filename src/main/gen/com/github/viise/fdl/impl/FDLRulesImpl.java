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

public class FDLRulesImpl extends ASTWrapperPsiElement implements FDLRules {

  public FDLRulesImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FDLVisitor visitor) {
    visitor.visitRules(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FDLVisitor) accept((FDLVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FDLExpressions getExpressions() {
    return findChildByClass(FDLExpressions.class);
  }

  @Override
  @Nullable
  public FDLVarRules getVarRules() {
    return findChildByClass(FDLVarRules.class);
  }

}
