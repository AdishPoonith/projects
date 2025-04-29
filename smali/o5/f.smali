.class public final Lo5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/f$b;
    }
.end annotation


# static fields
.field public static final a:Lr5/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo5/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo5/f$b;-><init>(Lo5/f$a;)V

    sput-object v0, Lo5/f;->a:Lr5/b$a;

    return-void
.end method

.method public static a(Lg5/u;)Lr5/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Lg5/u<",
            "TP;>;)",
            "Lr5/c;"
        }
    .end annotation

    invoke-static {}, Lr5/c;->a()Lr5/c$b;

    move-result-object v0

    invoke-virtual {p0}, Lg5/u;->d()Lr5/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lr5/c$b;->d(Lr5/a;)Lr5/c$b;

    invoke-virtual {p0}, Lg5/u;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg5/u$c;

    invoke-virtual {v3}, Lg5/u$c;->g()Lt5/z;

    move-result-object v4

    invoke-static {v4}, Lo5/f;->b(Lt5/z;)Lg5/j;

    move-result-object v4

    invoke-virtual {v3}, Lg5/u$c;->c()I

    move-result v5

    invoke-virtual {v3}, Lg5/u$c;->e()Lg5/t;

    move-result-object v3

    invoke-virtual {v0, v4, v5, v3}, Lr5/c$b;->a(Lg5/j;ILg5/t;)Lr5/c$b;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lg5/u;->e()Lg5/u$c;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lg5/u;->e()Lg5/u$c;

    move-result-object p0

    invoke-virtual {p0}, Lg5/u$c;->c()I

    move-result p0

    invoke-virtual {v0, p0}, Lr5/c$b;->e(I)Lr5/c$b;

    :cond_2
    :try_start_0
    invoke-virtual {v0}, Lr5/c$b;->b()Lr5/c;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static b(Lt5/z;)Lg5/j;
    .locals 1

    sget-object v0, Lo5/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lg5/j;->d:Lg5/j;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lg5/j;->c:Lg5/j;

    return-object p0

    :cond_2
    sget-object p0, Lg5/j;->b:Lg5/j;

    return-object p0
.end method
