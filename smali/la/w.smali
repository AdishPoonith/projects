.class public final Lla/w;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lla/v1;)Lla/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lla/v1;",
            ")",
            "Lla/u<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lla/v;

    invoke-direct {v0, p0}, Lla/v;-><init>(Lla/v1;)V

    return-object v0
.end method

.method public static synthetic b(Lla/v1;ILjava/lang/Object;)Lla/u;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lla/w;->a(Lla/v1;)Lla/u;

    move-result-object p0

    return-object p0
.end method
