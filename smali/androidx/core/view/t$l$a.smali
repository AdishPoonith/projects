.class Landroidx/core/view/t$l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/core/view/t$l;->u(Landroid/view/View;Landroidx/core/view/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Landroidx/core/view/d0;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroidx/core/view/p;


# direct methods
.method constructor <init>(Landroid/view/View;Landroidx/core/view/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/core/view/t$l$a;->b:Landroid/view/View;

    iput-object p2, p0, Landroidx/core/view/t$l$a;->c:Landroidx/core/view/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/core/view/t$l$a;->a:Landroidx/core/view/d0;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    invoke-static {p2, p1}, Landroidx/core/view/d0;->s(Landroid/view/WindowInsets;Landroid/view/View;)Landroidx/core/view/d0;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_0

    iget-object v3, p0, Landroidx/core/view/t$l$a;->b:Landroid/view/View;

    invoke-static {p2, v3}, Landroidx/core/view/t$l;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    iget-object p2, p0, Landroidx/core/view/t$l$a;->a:Landroidx/core/view/d0;

    invoke-virtual {v0, p2}, Landroidx/core/view/d0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/core/view/t$l$a;->c:Landroidx/core/view/p;

    invoke-interface {p2, p1, v0}, Landroidx/core/view/p;->a(Landroid/view/View;Landroidx/core/view/d0;)Landroidx/core/view/d0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/view/d0;->q()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object v0, p0, Landroidx/core/view/t$l$a;->a:Landroidx/core/view/d0;

    iget-object p2, p0, Landroidx/core/view/t$l$a;->c:Landroidx/core/view/p;

    invoke-interface {p2, p1, v0}, Landroidx/core/view/p;->a(Landroid/view/View;Landroidx/core/view/d0;)Landroidx/core/view/d0;

    move-result-object p2

    if-lt v1, v2, :cond_1

    invoke-virtual {p2}, Landroidx/core/view/d0;->q()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Landroidx/core/view/t;->C(Landroid/view/View;)V

    invoke-virtual {p2}, Landroidx/core/view/d0;->q()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
