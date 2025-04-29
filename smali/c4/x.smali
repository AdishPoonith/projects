.class public Lc4/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lc4/y;
    .locals 1

    sget-object v0, Lc4/z;->k:Lc4/z;

    invoke-static {p0, v0}, Lc4/x;->b(Landroid/content/Context;Lc4/z;)Lc4/y;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lc4/z;)Lc4/y;
    .locals 1

    new-instance v0, Le4/d;

    invoke-direct {v0, p0, p1}, Le4/d;-><init>(Landroid/content/Context;Lc4/z;)V

    return-object v0
.end method
