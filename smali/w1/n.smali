.class public final synthetic Lw1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lw1/o;Lw1/o;)V
    .locals 1

    if-ne p0, p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1, v0}, Lw1/o;->f(Lw1/w$a;)V

    :cond_1
    if-eqz p0, :cond_2

    invoke-interface {p0, v0}, Lw1/o;->d(Lw1/w$a;)V

    :cond_2
    return-void
.end method
