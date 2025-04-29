.class public final Landroidx/lifecycle/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc0/a$b<",
            "Lf0/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lc0/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc0/a$b<",
            "Landroidx/lifecycle/b0;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lc0/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc0/a$b<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/t$b;

    invoke-direct {v0}, Landroidx/lifecycle/t$b;-><init>()V

    sput-object v0, Landroidx/lifecycle/t;->a:Lc0/a$b;

    new-instance v0, Landroidx/lifecycle/t$c;

    invoke-direct {v0}, Landroidx/lifecycle/t$c;-><init>()V

    sput-object v0, Landroidx/lifecycle/t;->b:Lc0/a$b;

    new-instance v0, Landroidx/lifecycle/t$a;

    invoke-direct {v0}, Landroidx/lifecycle/t$a;-><init>()V

    sput-object v0, Landroidx/lifecycle/t;->c:Lc0/a$b;

    return-void
.end method

.method public static final a(Lf0/d;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lf0/d;",
            ":",
            "Landroidx/lifecycle/b0;",
            ">(TT;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Landroidx/lifecycle/i;->a()Landroidx/lifecycle/e;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/e;->b()Landroidx/lifecycle/e$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/e$b;->k:Landroidx/lifecycle/e$b;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroidx/lifecycle/e$b;->l:Landroidx/lifecycle/e$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {p0}, Lf0/d;->j()Landroidx/savedstate/a;

    move-result-object v0

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Landroidx/savedstate/a;->c(Ljava/lang/String;)Landroidx/savedstate/a$c;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroidx/lifecycle/u;

    invoke-interface {p0}, Lf0/d;->j()Landroidx/savedstate/a;

    move-result-object v2

    move-object v3, p0

    check-cast v3, Landroidx/lifecycle/b0;

    invoke-direct {v0, v2, v3}, Landroidx/lifecycle/u;-><init>(Landroidx/savedstate/a;Landroidx/lifecycle/b0;)V

    invoke-interface {p0}, Lf0/d;->j()Landroidx/savedstate/a;

    move-result-object v2

    invoke-virtual {v2, v1, v0}, Landroidx/savedstate/a;->h(Ljava/lang/String;Landroidx/savedstate/a$c;)V

    invoke-interface {p0}, Landroidx/lifecycle/i;->a()Landroidx/lifecycle/e;

    move-result-object p0

    new-instance v1, Landroidx/lifecycle/SavedStateHandleAttacher;

    invoke-direct {v1, v0}, Landroidx/lifecycle/SavedStateHandleAttacher;-><init>(Landroidx/lifecycle/u;)V

    invoke-virtual {p0, v1}, Landroidx/lifecycle/e;->a(Landroidx/lifecycle/h;)V

    :cond_2
    return-void

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b(Landroidx/lifecycle/b0;)Landroidx/lifecycle/v;
    .locals 4

    const-class v0, Landroidx/lifecycle/v;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lc0/c;

    invoke-direct {v1}, Lc0/c;-><init>()V

    sget-object v2, Landroidx/lifecycle/t$d;->j:Landroidx/lifecycle/t$d;

    invoke-static {v0}, Lkotlin/jvm/internal/t;->b(Ljava/lang/Class;)Lia/c;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lc0/c;->a(Lia/c;Lda/l;)V

    invoke-virtual {v1}, Lc0/c;->b()Landroidx/lifecycle/x$b;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/x;

    invoke-direct {v2, p0, v1}, Landroidx/lifecycle/x;-><init>(Landroidx/lifecycle/b0;Landroidx/lifecycle/x$b;)V

    const-string p0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {v2, p0, v0}, Landroidx/lifecycle/x;->b(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/w;

    move-result-object p0

    check-cast p0, Landroidx/lifecycle/v;

    return-object p0
.end method
