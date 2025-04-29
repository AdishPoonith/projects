.class public final Lla/q2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lla/v1;)Lla/x;
    .locals 1

    new-instance v0, Lla/p2;

    invoke-direct {v0, p0}, Lla/p2;-><init>(Lla/v1;)V

    return-object v0
.end method

.method public static synthetic b(Lla/v1;ILjava/lang/Object;)Lla/x;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lla/q2;->a(Lla/v1;)Lla/x;

    move-result-object p0

    return-object p0
.end method
