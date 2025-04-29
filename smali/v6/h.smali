.class public Lv6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv6/h$a;
    }
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/String;Lv6/h$a;Lb6/e;)Lv6/f;
    .locals 0

    invoke-static {p0, p1, p2}, Lv6/h;->d(Ljava/lang/String;Lv6/h$a;Lb6/e;)Lv6/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Lb6/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lb6/c<",
            "*>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lv6/f;->a(Ljava/lang/String;Ljava/lang/String;)Lv6/f;

    move-result-object p0

    const-class p1, Lv6/f;

    invoke-static {p0, p1}, Lb6/c;->l(Ljava/lang/Object;Ljava/lang/Class;)Lb6/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/String;Lv6/h$a;)Lb6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lv6/h$a<",
            "Landroid/content/Context;",
            ">;)",
            "Lb6/c<",
            "*>;"
        }
    .end annotation

    const-class v0, Lv6/f;

    invoke-static {v0}, Lb6/c;->m(Ljava/lang/Class;)Lb6/c$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Lb6/r;->k(Ljava/lang/Class;)Lb6/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v0

    new-instance v1, Lv6/g;

    invoke-direct {v1, p0, p1}, Lv6/g;-><init>(Ljava/lang/String;Lv6/h$a;)V

    invoke-virtual {v0, v1}, Lb6/c$b;->d(Lb6/h;)Lb6/c$b;

    move-result-object p0

    invoke-virtual {p0}, Lb6/c$b;->c()Lb6/c;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Ljava/lang/String;Lv6/h$a;Lb6/e;)Lv6/f;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p2, v0}, Lb6/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Context;

    invoke-interface {p1, p2}, Lv6/h$a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lv6/f;->a(Ljava/lang/String;Ljava/lang/String;)Lv6/f;

    move-result-object p0

    return-object p0
.end method
