.class public final Lg5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lg5/o;)Lg5/m;
    .locals 0

    invoke-interface {p0}, Lg5/o;->read()Lt5/c0;

    move-result-object p0

    invoke-static {p0}, Lg5/m;->e(Lt5/c0;)Lg5/m;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lg5/m;Lg5/p;)V
    .locals 0

    invoke-virtual {p0}, Lg5/m;->f()Lt5/c0;

    move-result-object p0

    invoke-interface {p1, p0}, Lg5/p;->a(Lt5/c0;)V

    return-void
.end method
