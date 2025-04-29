.class public final Landroidx/lifecycle/z;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/lifecycle/b0;)Lc0/a;
    .locals 1

    const-string v0, "owner"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Landroidx/lifecycle/d;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/lifecycle/d;

    invoke-interface {p0}, Landroidx/lifecycle/d;->h()Lc0/a;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Lc0/a$a;->b:Lc0/a$a;

    :goto_0
    return-object p0
.end method
