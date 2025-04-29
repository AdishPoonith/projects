.class public abstract Li9/z;
.super Li9/d1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Li9/d1<",
        "TReqT;TRespT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li9/d1;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-super {p0, p1, p2}, Li9/d1;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic b()V
    .locals 0

    invoke-super {p0}, Li9/d1;->b()V

    return-void
.end method

.method public bridge synthetic c(I)V
    .locals 0

    invoke-super {p0, p1}, Li9/d1;->c(I)V

    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Li9/z;->f()Li9/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Li9/g;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public e(Li9/g$a;Li9/y0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/g$a<",
            "TRespT;>;",
            "Li9/y0;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Li9/z;->f()Li9/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Li9/g;->e(Li9/g$a;Li9/y0;)V

    return-void
.end method

.method protected abstract f()Li9/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li9/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Li9/d1;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
