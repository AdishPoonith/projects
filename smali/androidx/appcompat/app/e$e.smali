.class Landroidx/appcompat/app/e$e;
.super Landroidx/core/view/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/e;->D0(Lk/b$a;)Lk/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/e;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/e$e;->a:Landroidx/appcompat/app/e;

    invoke-direct {p0}, Landroidx/core/view/b0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/app/e$e;->a:Landroidx/appcompat/app/e;

    iget-object p1, p1, Landroidx/appcompat/app/e;->y:Landroidx/appcompat/widget/ActionBarContextView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Landroidx/appcompat/app/e$e;->a:Landroidx/appcompat/app/e;

    iget-object p1, p1, Landroidx/appcompat/app/e;->B:Landroidx/core/view/z;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/core/view/z;->h(Landroidx/core/view/a0;)Landroidx/core/view/z;

    iget-object p1, p0, Landroidx/appcompat/app/e$e;->a:Landroidx/appcompat/app/e;

    iput-object v0, p1, Landroidx/appcompat/app/e;->B:Landroidx/core/view/z;

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/app/e$e;->a:Landroidx/appcompat/app/e;

    iget-object p1, p1, Landroidx/appcompat/app/e;->y:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/app/e$e;->a:Landroidx/appcompat/app/e;

    iget-object p1, p1, Landroidx/appcompat/app/e;->y:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    iget-object p1, p0, Landroidx/appcompat/app/e$e;->a:Landroidx/appcompat/app/e;

    iget-object p1, p1, Landroidx/appcompat/app/e;->y:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/app/e$e;->a:Landroidx/appcompat/app/e;

    iget-object p1, p1, Landroidx/appcompat/app/e;->y:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Landroidx/core/view/t;->C(Landroid/view/View;)V

    :cond_0
    return-void
.end method
