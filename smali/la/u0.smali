.class public final Lla/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lv9/g;)Lla/t0;
    .locals 1

    sget-object v0, Lv9/e;->h:Lv9/e$b;

    invoke-interface {p0, v0}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object p0

    instance-of v0, p0, Lla/t0;

    if-eqz v0, :cond_0

    check-cast p0, Lla/t0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {}, Lla/q0;->a()Lla/t0;

    move-result-object p0

    :cond_1
    return-object p0
.end method
