.class Ls9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lda/a;)Ls9/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lda/a<",
            "+TT;>;)",
            "Ls9/h<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls9/p;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Ls9/p;-><init>(Lda/a;Ljava/lang/Object;ILkotlin/jvm/internal/g;)V

    return-object v0
.end method
