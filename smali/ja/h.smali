.class Lja/h;
.super Lja/g;
.source "SourceFile"


# direct methods
.method public static c(Ljava/util/Iterator;)Lja/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Lja/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lja/h$a;

    invoke-direct {v0, p0}, Lja/h$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, Lja/h;->d(Lja/b;)Lja/b;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lja/b;)Lja/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lja/b<",
            "+TT;>;)",
            "Lja/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lja/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lja/a;

    invoke-direct {v0, p0}, Lja/a;-><init>(Lja/b;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
