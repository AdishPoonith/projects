.class Lh8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh8/a;->setOnDescendantFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Landroid/view/View$OnFocusChangeListener;

.field final synthetic k:Landroid/view/View;

.field final synthetic l:Lh8/a;


# direct methods
.method constructor <init>(Lh8/a;Landroid/view/View$OnFocusChangeListener;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lh8/a$a;->l:Lh8/a;

    iput-object p2, p0, Lh8/a$a;->j:Landroid/view/View$OnFocusChangeListener;

    iput-object p3, p0, Lh8/a$a;->k:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lh8/a$a;->j:Landroid/view/View$OnFocusChangeListener;

    iget-object p2, p0, Lh8/a$a;->k:Landroid/view/View;

    invoke-static {p2}, Lf9/h;->c(Landroid/view/View;)Z

    move-result v0

    invoke-interface {p1, p2, v0}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    return-void
.end method
