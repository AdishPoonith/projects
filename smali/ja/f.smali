.class Lja/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lda/p;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lda/p<",
            "-",
            "Lja/d<",
            "-TT;>;-",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lja/c;

    invoke-direct {v0}, Lja/c;-><init>()V

    invoke-static {p0, v0, v0}, Lw9/b;->a(Lda/p;Ljava/lang/Object;Lv9/d;)Lv9/d;

    move-result-object p0

    invoke-virtual {v0, p0}, Lja/c;->i(Lv9/d;)V

    return-object v0
.end method

.method public static b(Lda/p;)Lja/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lda/p<",
            "-",
            "Lja/d<",
            "-TT;>;-",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lja/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lja/f$a;

    invoke-direct {v0, p0}, Lja/f$a;-><init>(Lda/p;)V

    return-object v0
.end method
