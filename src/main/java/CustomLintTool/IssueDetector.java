package CustomLintTool;

//import com.android.tools.lint.detector.api;

import com.android.resources.ResourceType;
import com.android.tools.lint.client.api.UElementHandler;
import com.android.tools.lint.detector.api.AnnotationUsageType;
import com.android.tools.lint.detector.api.Context;
import com.android.tools.lint.detector.api.Detector;
import com.android.tools.lint.detector.api.JavaContext;
import com.android.tools.lint.detector.api.interprocedural.CallGraphResult;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.uast.*;

import java.util.List;

public class IssueDetector implements Detector.UastScanner {

    public IssueDetector(){

    }
    @Override
    public void analyzeCallGraph(@NotNull Context context, @NotNull CallGraphResult callGraphResult) {

    }

    @Nullable
    @Override
    public List<String> applicableAnnotations() {
        return null;
    }

    @Nullable
    @Override
    public List<String> applicableSuperClasses() {
        return null;
    }

    @Override
    public boolean appliesToResourceRefs() {
        return false;
    }

    @Nullable
    @Override
    public UElementHandler createUastHandler(@NotNull JavaContext javaContext) {
        return null;
    }

    @Nullable
    @Override
    public List<String> getApplicableConstructorTypes() {
        return null;
    }

    @Nullable
    @Override
    public List<String> getApplicableMethodNames() {
        return null;
    }

    @Nullable
    @Override
    public List<String> getApplicableReferenceNames() {
        return null;
    }

    @Nullable
    @Override
    public List<Class<? extends UElement>> getApplicableUastTypes() {

        return null;
    }

    @Override
    public boolean inheritAnnotation(@NotNull String s) {
        return false;
    }

    @Override
    public boolean isApplicableAnnotationUsage(@NotNull AnnotationUsageType annotationUsageType) {
        return false;
    }

    @Override
    public boolean isCallGraphRequired() {
        return false;
    }

    @Override
    public void visitAnnotationUsage(@NotNull JavaContext javaContext, @NotNull UElement uElement, @NotNull AnnotationUsageType annotationUsageType, @NotNull UAnnotation uAnnotation, @NotNull String s, @Nullable PsiMethod psiMethod, @Nullable PsiElement psiElement, @NotNull List<? extends UAnnotation> list, @NotNull List<? extends UAnnotation> list1, @NotNull List<? extends UAnnotation> list2, @NotNull List<? extends UAnnotation> list3) {

    }

    @Override
    public void visitAnnotationUsage(@NotNull JavaContext javaContext, @NotNull UElement uElement, @NotNull AnnotationUsageType annotationUsageType, @NotNull UAnnotation uAnnotation, @NotNull String s, @Nullable PsiMethod psiMethod, @NotNull List<? extends UAnnotation> list, @NotNull List<? extends UAnnotation> list1, @NotNull List<? extends UAnnotation> list2, @NotNull List<? extends UAnnotation> list3) {

    }

    @Override
    public void visitClass(@NotNull JavaContext javaContext, @NotNull UClass uClass) {

    }

    @Override
    public void visitClass(@NotNull JavaContext javaContext, @NotNull ULambdaExpression uLambdaExpression) {

    }

    @Override
    public void visitConstructor(@NotNull JavaContext javaContext, @NotNull UCallExpression uCallExpression, @NotNull PsiMethod psiMethod) {

    }

    @Override
    public void visitMethod(@NotNull JavaContext javaContext, @NotNull UCallExpression uCallExpression, @NotNull PsiMethod psiMethod) {

    }

    @Override
    public void visitMethodCall(@NotNull JavaContext javaContext, @NotNull UCallExpression uCallExpression, @NotNull PsiMethod psiMethod) {

    }

    @Override
    public void visitReference(@NotNull JavaContext javaContext, @NotNull UReferenceExpression uReferenceExpression, @NotNull PsiElement psiElement) {

    }

    @Override
    public void visitResourceReference(@NotNull JavaContext javaContext, @NotNull UElement uElement, @NotNull ResourceType resourceType, @NotNull String s, boolean b) {

    }

    @Override
    public void afterCheckFile(@NotNull Context context) {

    }

    @Override
    public void beforeCheckFile(@NotNull Context context) {

    }
}
