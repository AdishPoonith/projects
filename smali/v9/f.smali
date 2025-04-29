.class public final Lv9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lda/p;Ljava/lang/Object;Lv9/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lda/p<",
            "-TR;-",
            "Lv9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lv9/d<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lw9/b;->a(Lda/p;Ljava/lang/Object;Lv9/d;)Lv9/d;

    move-result-object p0

    invoke-static {p0}, Lw9/b;->b(Lv9/d;)Lv9/d;

    move-result-object p0

    sget-object p1, Ls9/n;->k:Ls9/n$a;

    sget-object p1, Ls9/u;->a:Ls9/u;

    invoke-static {p1}, Ls9/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lv9/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
