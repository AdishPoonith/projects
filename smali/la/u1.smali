.class final Lla/u1;
.super Lla/b2;
.source "SourceFile"


# instance fields
.field private final n:Lda/l;
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

    invoke-direct {p0}, Lla/b2;-><init>()V

    iput-object p1, p0, Lla/u1;->n:Lda/l;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lla/u1;->n:Lda/l;

    invoke-interface {v0, p1}, Lda/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lla/u1;->A(Ljava/lang/Throwable;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
