.class final Lla/s1;
.super Lla/j;
.source "SourceFile"


# instance fields
.field private final j:Lda/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lda/l<",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lda/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Ls9/u;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lla/j;-><init>()V

    iput-object p1, p0, Lla/s1;->j:Lda/l;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lla/s1;->j:Lda/l;

    invoke-interface {v0, p1}, Lda/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lla/s1;->a(Ljava/lang/Throwable;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InvokeOnCancel["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lla/s1;->j:Lda/l;

    invoke-static {v1}, Lla/o0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lla/o0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
